package com.example.uropatruljen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import com.example.uropatruljen_app.protobuf.*;
import java.math.BigInteger;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login extends AppCompatActivity {

    // Initializing
    TextView info;
    EditText input;
    Button loginBTN;
    Thread Thread = null;
    String serverIP = "192.168.4.1";
    Socket socket;
    ProtobufHandler protobuf;
    int serverPORT = 1883;
    SocketThread t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Getting view that is identified by the android:id
        info = findViewById(R.id.required);
        input = findViewById(R.id.enterModelNum);
        loginBTN = findViewById(R.id.login);

        // Intent function for passing parameters to a new activity
        Intent receivedKeys = getIntent();

        // Using .getStringExtra() for receiving parameters from another activity
        String receivedToShareSSID = receivedKeys.getStringExtra("ssid_key");
        String receivedToSharePass = receivedKeys.getStringExtra("pass_key");

        //We need to start the socket connection
        //Android studio only allows socket connection to be stared in diffrent thread from main
        new Thread(() -> {
            try {
                socket = new Socket("192.168.4.1", 1883);
                t = new SocketThread(socket);
                t.receiveData();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        // Creating protobuf object
        protobuf = new ProtobufHandler();
        Command network_credntials = protobuf.generateCommand("Network Credntials",NetworkCre.newBuilder().setSsid(receivedToShareSSID).setPass(receivedToSharePass).build());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.sendMessage(network_credntials);

        // Perform click event using lambda on loginBTN
        loginBTN.setOnClickListener(view -> {

            // Getting modelNum from entered input
            String modelNum = input.getText().toString().trim();

            if (modelNum.isEmpty()) {

                // Using Toast for display a message
                Toast.makeText(getBaseContext(), "Modelnr er ikke indtastet", Toast.LENGTH_SHORT).show();
            }
            else {

                try {
                    Uro uro = Uro.newBuilder().setModel(modelNum).build();
                    Command uroModelNum = protobuf.generateCommand("modelNumber",Uro.newBuilder().setModel(toHexString(getSHA(modelNum))).build());
                    t.sendMessage(uroModelNum);
                    
                    // Intent function to move to another activity
                    Intent goToHotspot = new Intent(getApplicationContext(), Hotspot.class);
                    
                    // Using .putExtra for sending values to another activity
                    goToHotspot.putExtra("ssid_key", receivedToShareSSID);
                    goToHotspot.putExtra("pass_key", receivedToSharePass);
                    startActivity(goToHotspot);
                    
                    Toast.makeText(getBaseContext(),  modelNum + " til SHA256: " + toHexString(getSHA(modelNum)), Toast.LENGTH_SHORT).show();

                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Calculate cryptographic hashing value with hash function SHA-256
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest messD = MessageDigest.getInstance("SHA-256");

        // digest() method called to calculate message digest of an input and return array of byte
        return messD.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // Convert message digest into a hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }
}
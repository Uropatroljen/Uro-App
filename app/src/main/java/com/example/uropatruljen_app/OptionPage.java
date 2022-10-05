package com.example.uropatruljen_app;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class OptionPage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // Initializing
    Button lightBTN;
    Button musicBTN;
    Button logoutBTN;
    Spinner musicDropdownList;
    TextView viewCountDown;
    Thread Thread = null;
    Socket socket;
    int serverPORT = 1883;
    private CountDownTimer countDownTimer;
    private long timeStart;
    private boolean timerRun;
    private long timeLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_page);

        // Getting view that is identified by the android:id
        lightBTN = findViewById(R.id.light);
        musicBTN = findViewById(R.id.music);
        logoutBTN = findViewById(R.id.logout);
        musicDropdownList = findViewById(R.id.spinner);
        viewCountDown = findViewById(R.id.countdown);

        // Port scan for specific device  -  in this case a device named RaspberryPi on port 1883
        InetSocketAddress getIP = new InetSocketAddress("sas9URO", serverPORT);
        String serverIP = getIP.getHostString();

        //We need to start the socket connection
        //Android studio only allows socket connection to be stared in diffrent thread from main
        new Thread(() -> {
            try {
                socket = new Socket(serverIP, serverPORT);
                t = new SocketThread(socket);
                t.receiveData();
            } 
            catch (IOException e) {
                e.printStackTrace();

                // Using Toast for display a message
                Toast.makeText(getBaseContext(), "Kan ikke finde\n uroens IP", Toast.LENGTH_SHORT).show();
            }
        }).start();

        // Creating protobuf object
        protobuf = new ProtobufHandler();

        // Perform click event using lambda on lightBTN ( light function )
        lightBTN.setOnClickListener(view -> {

        });

        // Spinner click listener
        musicDropdownList.setOnItemSelectedListener(this);

        // Spinner Drop down elements in a list
        List<String> songs = new ArrayList<>();
        songs.add("Fem små aber");
        songs.add("Lille peter edderkop");
        songs.add("Hjulene på bussen");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, songs);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Attaching data adapter to spinner
        musicDropdownList.setAdapter(dataAdapter);

        // Perform click event using lambda on musicBTN ( music function )
        musicBTN.setOnClickListener(view -> {

            viewCountDown.setVisibility(View.VISIBLE);

            if (timerRun) {

                stopMusicTimer();

            } else {

                timeLeft = timeStart;
                playMusicTimer();
            }
        });

        // Perform click event using lambda on logoutBTN ( logout function )
        logoutBTN.setOnClickListener(view -> {

            // Exit
            finishAffinity();
            System.exit(0);
        });

            updateCountDown();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        if (item.contains("aber")) {

            // Set specific time for timer, display start status
            timeStart = 225000;
            viewCountDown.setText(R.string.time345);

        }
        else {

            // Set specific time for timer, display start status
            timeStart = 52060;
            viewCountDown.setText(R.string.time152);

        }

        // Display selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    // Starting timer for music playing
    private void playMusicTimer() {

        countDownTimer = new CountDownTimer(timeLeft, 1000) {

            @Override
            public void onTick(long timeUntilFinished) {

                timeLeft = timeUntilFinished;
                updateCountDown();
            }

            @Override
            public void onFinish() {
                timerRun = false;

                // Display finish status
                musicBTN.setText(R.string.startMusic);
            }
        }.start();

        timerRun = true;
        musicBTN.setText(R.string.stopMusic);
    }

    // Stop timer, when music is stopped
    private void stopMusicTimer() {

        countDownTimer.cancel();
        timerRun = false;
        musicBTN.setText(R.string.startMusic);
    }

    // Display countdown status
    @SuppressLint("SetTextI18n")
    private void updateCountDown() {

        // Used for formatting digit
        NumberFormat f = new DecimalFormat("00");

        int minute = (int) (timeLeft / 1000) / 60;
        int second = (int) (timeLeft / 1000) % 60;

        viewCountDown.setText(f.format(minute) + ":" + f.format(second));
    }
}
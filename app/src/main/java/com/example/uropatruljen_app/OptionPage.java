package com.example.uropatruljen_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.uropatruljen_app.protobuf.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OptionPage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // Initializing
    SwitchCompat lightBTN;
    ImageView lightOnOff;
    Spinner musicDropdownList;
    TextView viewCountDown;
    Button musicBTN;
    Button logoutBTN;
    Socket socket;
    int serverPORT = 1883;
    private CountDownTimer countDownTimer;
    private long timeStart;
    private boolean timerRun;
    private long timeLeft;
    ProtobufHandler protobuf;
    SocketThread t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_page);

        // Getting view that is identified by the android:id
        lightOnOff = findViewById(R.id.imageLight);
        lightBTN = findViewById(R.id.light);
        musicBTN = findViewById(R.id.music);
        logoutBTN = findViewById(R.id.logout);
        musicDropdownList = findViewById(R.id.spinner);
        viewCountDown = findViewById(R.id.countdown);

        // Port scan for specific device  -  in this case a device named RaspberryPi on port 1883
        InetSocketAddress getIP = new InetSocketAddress("sas9URO", serverPORT);
        String serverIP = getIP.getHostString();

        // Need to start the socket connection
        // Android studio only allows socket connection to be stared in different thread from main
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

        // Perform checked changing event using lambda on lightBTN ( light function )
        lightBTN.setOnCheckedChangeListener((compoundButton, b) -> {

            if (compoundButton.isChecked()) {

                // Used to send light status for turn light on with random light colors to server
                t.sendMessage(GiveRandomLight());
                
                lightOnOff.setImageResource(R.drawable.light_icon2);
            }
            else {

                // Used to send light status for turn light off to server
                t.sendMessage(protobuf.generateCommand("stop",Light.newBuilder().setState(false).setRed(0).setBlue(0).setGreen(0).build()));
                
                lightOnOff.setImageResource(R.drawable.light_icon);
            }
        });

        // Spinner click listener
        musicDropdownList.setOnItemSelectedListener(this);

       // Spinner Drop down elements
        List<String> songs = new ArrayList<>();
        songs.add("Vælg musik: ");
        songs.add("Fem små aber");
        songs.add("Lille peter edderkop");
        songs.add("Hjulene på bussen");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, songs);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Attaching data adapter to spinner
        musicDropdownList.setAdapter(dataAdapter);

        // Getting selected song
        String selectedSong = musicDropdownList.getSelectedItem().toString();
        int index = (int)musicDropdownList.getSelectedItemId();

        // Perform click event using lambda on musicBTN ( music function )
        musicBTN.setOnClickListener(view -> {

            viewCountDown.setVisibility(View.VISIBLE);

            if (timerRun) {

                stopMusicTimer(selectedSong,index);

            } else {

                timeLeft = timeStart;
                playMusicTimer(selectedSong,index);
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

    // Adding random colors to lights from list of colors
    private Command GiveRandomLight(){
        Random r = new Random();
        List<Command> colors = new ArrayList<>();
        colors.add(protobuf.generateCommand("Play",Light.newBuilder().setState(true).setRed(255).setBlue(0).setGreen(85).build()));
        colors.add(protobuf.generateCommand("Play",Light.newBuilder().setState(true).setRed(0).setBlue(255).setGreen(0).build()));
        colors.add(protobuf.generateCommand("Play",Light.newBuilder().setState(true).setRed(255).setBlue(0).setGreen(0).build()));
        colors.add(protobuf.generateCommand("Play",Light.newBuilder().setState(true).setRed(0).setBlue(0).setGreen(255).build()));
        return colors.get(r.nextInt(colors.size()));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        // Getting position of selected song  -  a spinner item
        String item = parent.getItemAtPosition(position).toString();

        if (item.contains("aber")) {

            // Set specific time for timer, display start status
            timeStart = 225000;
            viewCountDown.setText(R.string.time345);

            // Display selected spinner item
            Toast.makeText(parent.getContext(), "Der er valgt: " + item, Toast.LENGTH_LONG).show();

            // Used to send specific songs id and title for playing to server
            protobuf.generateCommand("Play",Music.newBuilder().setId(1).setTitle("aber").build());

        }
        else if (item.contains("edderkop")) {

            // Set specific time for timer, display start status
            timeStart = 112060;
            viewCountDown.setText(R.string.time152);

            // Display selected spinner item
            Toast.makeText(parent.getContext(), "Der er valgt: " + item, Toast.LENGTH_LONG).show();

            // Used to send specific songs id and title for playing to server
            protobuf.generateCommand("Play",Music.newBuilder().setId(3).setTitle("bussen").build());

        }
        else if (item.contains("bussen")) {

            // Set specific time for timer, display start status
            timeStart = 112060;
            viewCountDown.setText(R.string.time152);

            // Display selected spinner item
            Toast.makeText(parent.getContext(), "Der er valgt: " + item, Toast.LENGTH_LONG).show();

            // Used to send specific songs id and title for playing to server
            protobuf.generateCommand("Play",Music.newBuilder().setId(3).setTitle("bussen").build());

        }
        else {

            Toast.makeText(parent.getContext(), "Der er ikke valgt musik", Toast.LENGTH_LONG).show();
        }
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    // Starting timer for music playing
    private void playMusicTimer(String song,int index) {
        Command command = protobuf.generateCommand("Play",Music.newBuilder().setId(index).setTitle(song).build());
        t.sendMessage(command);
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
    private void stopMusicTimer(String song, int index) {

        // Used to send specific songs id and title for stop playing to server
        Command command = protobuf.generateCommand("Stop",Music.newBuilder().setId(index).setTitle(song).build());
        t.sendMessage(command);
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
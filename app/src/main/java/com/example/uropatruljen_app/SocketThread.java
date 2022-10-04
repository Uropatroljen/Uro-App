package com.example.uropatruljen_app;

import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.example.uropatruljen_app.protobuf.*;
import com.google.protobuf.InvalidProtocolBufferException;

import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class SocketThread implements Runnable{

    public SocketThread(Socket socket){
        this.socket = socket;
        try {
            out = socket.getOutputStream();
            in = socket.getInputStream();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    OutputStream out;
    InputStream in;
    private Socket socket;
    boolean running = true;
    @Override
    public void run(){
    }

    public void sendMessage(Command message){
        if(socket.isConnected()){
            new Thread(() -> {
                try {
                    out.write(serilizeMessage(message));
                    out.flush();
                    System.out.println("Message was sent");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }).start();
        }
    }
    public void receiveData() {
        new Thread(() -> {

            try{
                while(running){
                    byte[] messageByte = new byte[1024];
                    int range = in.read(messageByte);
                    byte[] filteredByteArray = Arrays.copyOfRange(messageByte, 0, range);
                    deSerilizeMessage(filteredByteArray);
                    //String message = new String(filteredByteArray, StandardCharsets.UTF_8);

                }
            }
            catch (IOException ex){

            }
        }).start();
    }

    private Command deSerilizeMessage(byte[] message){
        try{
            return Command.parseFrom(message);
        }
        catch (InvalidProtocolBufferException ex){
            ex.printStackTrace();
        }
        return null;
    }

    private byte[] serilizeMessage(Command message){
        return message.toByteArray();
    }

}

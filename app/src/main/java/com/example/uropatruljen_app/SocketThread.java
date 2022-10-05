package com.example.uropatruljen_app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.example.uropatruljen_app.protobuf.*;
import com.google.protobuf.InvalidProtocolBufferException;

import java.net.Socket;
import java.util.Arrays;

public class SocketThread implements Runnable{

    //Set the current socket connection
    //Instantiate output and input stream using the socket connection
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

    //Sends message threw the socket connection
    //Takes Protobuf message object
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

    //Recives data from server when written to the client.
    //Using outputstream from the socket client.
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

    //Gets a bytearray and deserilizes it to an command object
    private Command deSerilizeMessage(byte[] message){
        try{
            return Command.parseFrom(message);
        }
        catch (InvalidProtocolBufferException ex){
            ex.printStackTrace();
        }
        return null;
    }

    //Serilize the command to bytearray
    private byte[] serilizeMessage(Command message){
        return message.toByteArray();
    }

}

package com.example.uropatruljen_app;

import com.example.uropatruljen_app.protobuf.*;

public class ProtobufHandler {

    //Dynamic method to generate new command object
    //Takes one of the oneof objects from the protobuf .prorot file and wraps it into an command object
    public Command generateCommand(String command,Object obj){
        Command commandObj;
        if (obj.getClass() == Client.class)
           return commandObj = Command.newBuilder().setCommand(command).setClient(((Client) obj).toBuilder().build()).build();
        else if (obj.getClass() == Music.class)
           return commandObj = Command.newBuilder().setCommand(command).setMusic(((Music) obj).toBuilder().build()).build();
        else if (obj.getClass() == Light.class)
           return commandObj = Command.newBuilder().setCommand(command).setLight(((Light) obj).toBuilder().build()).build();
        else if (obj.getClass() == Uro.class)
           return commandObj = Command.newBuilder().setCommand(command).setUro(((Uro) obj).toBuilder().build()).build();
        else if (obj.getClass() == NetworkCre.class)
           return commandObj = Command.newBuilder().setCommand(command).setNetwork(((NetworkCre) obj).toBuilder().build()).build();
        return null;
    }
}

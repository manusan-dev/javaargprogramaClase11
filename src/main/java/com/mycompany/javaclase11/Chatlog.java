package com.mycompany.javaclase11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class ChatLog{

    private String fileName;

    public ChatLog(String fileName) {
        this.fileName = fileName;
    }

    public void writeMessage(String name, String message) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(name + ": " + message);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public List<String> readMessages() {
        List<String> messages = new ArrayList<>();

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                messages.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        return messages;
    }
}

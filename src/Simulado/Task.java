package Simulado;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Task extends Thread {
    private Socket connection;
    private ArrayList<Integer> number;

    public Task(Socket socket, ArrayList<Integer> array) throws Exception {
        if (socket == null || array == null) {
            throw new Exception("Connection or Array is null");
        }

        this.connection = socket;
        this.number = array;
    }

    public void run() {
        try {
            this.start();
        } catch (Exception e) {
            System.err.println("Deu erro caralho: " + e.getMessage());
        }
    }
}

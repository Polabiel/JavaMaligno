package Sockets;

import java.io.*;
import java.net.*;

public class Proativo {
    public static void main(String[] args) {
        try {
            Socket conexao = new Socket("localhost", 12345);

            BufferedReader receptor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

            PrintWriter transmissor = new PrintWriter(conexao.getOutputStream());

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            String texto;

            do {
                texto = teclado.readLine();
                transmissor.println(texto);
                transmissor.flush();

            } while (!texto.toUpperCase().equals("FIM"));

            transmissor.close();
            receptor.close();
            conexao.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
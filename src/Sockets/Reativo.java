package Sockets;

import java.io.*;
import java.net.*;

public class Reativo {
    public static void main(String[] args) {
        try {

            ServerSocket pedido = new ServerSocket(12345);

            Socket conexao = pedido.accept();

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
            pedido.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
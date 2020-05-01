package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Sends requests to the server and prints on console the response from server including the current board configuration
 */
public class GameClient {
    public int PORT = 8100;
    private String serverAddress =  "127.0.0.1";
    private LocalBoard localBoard;
    private int currentPlayer;
    private int currentXCoordinate;
    private int currentYCoordinate;

    // Adapted from course's slides
    // https://profs.info.uaic.ro/~acf/java/slides/en/networking_slide_en.pdf

    public GameClient(){
        localBoard = new LocalBoard();
    }

    /**
     * Sends to server the message received as parameter and prints the result
     * @param message
     */
    public void startGameClient(String message){
        try{
            Socket socket = new Socket(serverAddress, PORT);

            //Create the buffers for communication
            PrintWriter bufferOUT = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferIN = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //Send request me(client) -> server
            String request = message;
            bufferOUT.println(request);

            //Wait for response server -> me(client)
            String response = bufferIN.readLine();

            //If a piece was put -> get the coordinates and store locally
            if(response.contains("successfuly put a piece at coordinates")){
                currentPlayer = response.charAt(7) - '0';
                currentXCoordinate = response.charAt(49) - '0';
                currentYCoordinate = response.charAt(53) - '0';
                localBoard.putPiece(currentPlayer, currentXCoordinate, currentYCoordinate);
                localBoard.printBoard();
            }
            System.out.println(response);
        }
        catch (UnknownHostException e){
            System.err.println("No server existing: " + e);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

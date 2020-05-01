package com.company;

import java.util.Scanner;

/**
 * Reads from standard input and launches the client
 * Exits the program on "exit" command
 */
public class Main {

    public static void main(String[] args) {
        GameClient gameClient = new GameClient();
        while(true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();
            if(message.compareTo("exit") == 0){
                System.out.println("Thanks for playing the game!");
                break;
            }
            gameClient.startGameClient(message);
        }
    }
}

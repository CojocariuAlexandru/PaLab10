# PA Laborator 10

## Students

  - Cojocariu Alexandru, II A2

## Description

In this project I implemented the Gomoku game (5 in a row). Clients can connect to the server and create requests such as starting the game, placing a piece etc..

## Features

  - (Compulsory) Has the desired structure, a client application and a server application
  - (Compulsory) The server application creates a socket and accepts the clients. It creates a new thread for each client that connects and can send messages back to them.
  - (Compuslory) The server application can close itself if requested (with "close" command)
  - (Compulsory) The client application can close itself if requested (with "exit" command). It reads requests from the user, sends it to the server, and listens for a response afterwards.
  - (Optional) I implemented the Gomoku game. Clients can create a game and place a piece during a game
  - (Optional) The server is mediating players by having a static variable for the current player. This way, the server knows which piece to put to the coordinates given by the client. Also the server can detect invalid requests.
  - (Optional) The clients are shown the board actualised after each move.
  
## Not resolved

  - (Optional) It's suggested to create HTML report to view the game, but in my version it's playable only in console
  - (Bonus) Nothing from bonus

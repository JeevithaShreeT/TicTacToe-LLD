# Tic Tac Toe – Java (LLD)

This is a command-line based Tic Tac Toe game implemented in Java. Designed following clean object-oriented and low-level design principles, the project models the classic two-player game with robust input validation, turn-based logic, and win/draw detection.

---

## Overview

This implementation allows two users to play a game of Tic Tac Toe (3x3 board) from the terminal. The system is structured into modular classes, each encapsulating a single responsibility. Players take turns entering their moves, and the game continues until one player wins or the game results in a draw.

---

## Features

- Two-player interactive game
- Command-line input for player registration and move input
- Win detection (rows, columns, and diagonals)
- Draw detection when board is full
- Board re-renders after each move
- Graceful exit with `"exit"` command
- Input validation and error handling for invalid or duplicate moves

---

## Class Responsibilities

# TicTacToe
- Entry point of the application. Handles player input and game initialization.

# Game
- Manages the overall game flow, player turn rotation, and result checking.

# Board
- Encapsulates the 3x3 grid. Responsible for move validation, board rendering, and win/draw detection.

# Cell
- Represents a single cell in the grid. Tracks row, column, occupancy status, and the symbol.

# Player
- Holds player information: name and assigned symbol (X or O).

# Symbol
- Enum representing possible symbols (X and O).

## Design Highlights
- Encapsulation: Each class controls its own state and behavior.

- Separation of concerns: Logic for players, board, and game loop are clearly separated.

- Scalable structure: The code can be extended to support larger boards, AI opponent, or GUI integration.

## Technology Stack

- Java SE 17

- Standard Java collections and command-line I/O

- Designed using core object-oriented principles

- No external dependencies


## Author

- [Jeevitha Shree T](https://github.com/JeevithaShreeT)


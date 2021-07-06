package com.hillel.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ChessMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ChessBoard board = new ChessBoard();

        while (true) {
            System.out.println("Input");
            String chessType = bufferedReader.readLine();
            if("stop".equals(chessType)){
                break;
            }
            switch (chessType.toLowerCase().trim()){
                case "king":
                   board.addItem(new King());
                   break;
                case"queen":
                    board.addItem(new Queen());
                    break;
                case"pawn":
                    board.addItem(new Pawn());
                    break;
            }

        }
        board.drawBoard();
    }

}

package com.hillel.lesson7;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    List<ChessItem> function = new ArrayList<>();
    public void addItem(ChessItem item){
        function.add(item);
    }

    public void drawBoard(){
        for(ChessItem item : function){
            item.draw();
        }
    }
}

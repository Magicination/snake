package ru.tgct;

import java.util.Random;

public class Field   {
    public Cell[][] cells = new Cell[10][10];
    Field(){
         for(int i=0; i<10;i++){
             for(int k=0;k<10;k++){

                 Cell cells1 = new Cell(i,k);
                 cells[i][k]= cells1;
                 // check
             }

        }
        Random rand=new Random();
        int value_stroki=rand.nextInt(10);
        int value_stolbec=rand.nextInt(10);
        cells[value_stroki][value_stolbec]= new Fruit(value_stroki,value_stolbec);
}

}

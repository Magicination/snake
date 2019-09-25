package ru.tgct;

import java.util.ArrayList;
import java.util.Random;

public class Snake  {
    Field pole1;
    public ArrayList<Cell> kletki = new ArrayList<Cell>();
    public void forward(){
        //if (kletki.get(0) instanceof Fruit) {
           // ++kletki.size();  проверка условия и рост змеи
        //}

        if (kletki.get(0).n_stroki ==kletki.get(1).n_stroki+1)
            return;

        for(int i=kletki.size()-1;i>0;i--){
            kletki.set(i,kletki.get(i-1));
        }
        int n_stroki=kletki.get(0).n_stroki -1;
        int n_stolbec=kletki.get(0).n_stolbec;
        kletki.set(0,pole1.cells[n_stroki][n_stolbec]);
    }
    public void  back(){
        if (kletki.get(0).n_stroki ==kletki.get(1).n_stroki -1)
            return;

        for(int i=kletki.size()-1;i>0;i--){
            kletki.set(i,kletki.get(i-1));
        }
        int n_stroki=kletki.get(0).n_stroki +1;
        int n_stolbec=kletki.get(0).n_stolbec;
        kletki.set(0,pole1.cells[n_stroki][n_stolbec]);
    }
    public void turnright(){
        if (kletki.get(0).n_stolbec ==kletki.get(1).n_stolbec -1)
            return;

        for(int i=kletki.size()-1;i>0;i--){
            kletki.set(i,kletki.get(i-1));
        }
        int n_stroki=kletki.get(0).n_stroki;
        int n_stolbec=kletki.get(0).n_stolbec +1;
        kletki.set(0,pole1.cells[n_stroki][n_stolbec]);
    }
    public void turnleft(){
        if (kletki.get(0).n_stolbec ==kletki.get(1).n_stolbec +1 ) //  чтобы не дивагалась при врезании
            return;

        for(int i=kletki.size()-1;i>0;i--){
            kletki.set(i,kletki.get(i-1));
        }
        int n_stroki=kletki.get(0).n_stroki;
        int n_stolbec=kletki.get(0).n_stolbec -1;
        kletki.set(0,pole1.cells[n_stroki][n_stolbec]);
    }

    public Snake(Field pole){
        pole1 =pole;
        for(int i=0;i<4;i++){ //  размер змейки было 4 бтв
            kletki.add(pole.cells[3+i][5]);

        }

    }

}

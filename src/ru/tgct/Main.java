package ru.tgct;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random; // Рандом нужен? для ягод

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Field field = new Field();
        Snake snake = new Snake(field);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String key = scanner.nextLine();
            Thread.sleep(100);

            switch (key.charAt(0)) {
                case 'w':
                    snake.forward();

                    break; // optional

                case 's':
                    snake.back();
                    // Statements
                    break; // optional
                case 'a':
                    snake.turnleft();
                    // Statements
                    break; // optional
                case 'd':
                    snake.turnright();
                    // Statements
                    break; // optional

                // You can have any number of case statements.
            }

            for (int i = 0; i < field.cells.length; i++) {
                String resultstr = "";
                for (int k = 0; k < field.cells[i].length; k++) {
                    int nomer_kletki=-2;
                    for (int p = 0; p < snake.kletki.size(); p++) {
                        if (snake.kletki.get(p) == field.cells[i][k]) {
                            nomer_kletki=p;

                        }
                    }
                    if (nomer_kletki==0)
                        resultstr += "☗ ";
                    else if (nomer_kletki==snake.kletki.size()-1)
                        resultstr += "◙ ";
                    else if (nomer_kletki % 2==0&&nomer_kletki!=-2)
                        resultstr += "◨ ";
                    else if (nomer_kletki % 2==1)
                        resultstr += "◧ ";
                    else if (field.cells[i][k] instanceof Fruit)
                        resultstr +="@ ";
                    else
                        resultstr +="' ";


                }
                System.out.println(resultstr);
            }


        }
    }
}
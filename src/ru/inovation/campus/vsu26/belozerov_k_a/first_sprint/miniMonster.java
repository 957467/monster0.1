package ru.inovation.campus.vsu26.belozerov_k_a.first_sprint;

import java.util.Random;
import java.util.Scanner;
public class miniMonster extends Monster{
    private String image = "\uD83D\uDC7D";
    public miniMonster(int sizeBoard) {
        super(sizeBoard);
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean taskMonster(int difficultGame){



        return false;
    }



}
    /*class TimeMonster {
        private String image = "\uD83D\uDC7D";
        private int x, y;
        Random r = new Random();

        TimeMonster(int sizeBoard){
            this.y = r.nextInt(sizeBoard - 1);
            this.x = r.nextInt(sizeBoard);
        }
        public String getImage() {
            return image;
        }

        public int getY() {
            return y;
        }

        public int getX() {
            return x;
        }

        public boolean conflictPerson(int perX, int perY){
            return perY - 1 == this.y && perX - 1 == this.x;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public boolean taskTimeMonster(int difficultGame){
            System.out.println("Решите задачу:");

            int x = r.nextInt(300);
            int y = r.nextInt(250);
            int trueAnswer = x + y;
            System.out.println("Реши пример: " + x + " + " + y + " = ?");
            Scanner sc = new Scanner(System.in);
            int ans = sc.nextInt();
            if (trueAnswer == ans) {
                System.out.println("Верно! Ты победил монстра");
                long endTime = System.nanoTime();
                long startTime = 0;
                long duration = (endTime - startTime) / 1_000_000;
                System.out.println("Ответ занял: " + duration + " мс");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            publicvoid downLive;{
                int live = 0;
                live--;
            }
            return false;
        }
    }*/

package ru.inovation.campus.vsu26.belozerov_k_a.first_sprint;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 5;


        String person = "\uD83E\uDDD9\u200D";
        int personLive = 3;
        int personX = 1;
        int personY = 3;

        String monster = "\uD83E\uDDDF\u200D";

        String castle = "\uD83C\uDFF0";
        int castleY = 1;
        int castleX = 1 + random.nextInt(size);
        int counterY = 1;
        while (counterY <= size) {
        }
            counterY += 1;
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                for (y = 1; y <= size; y++) {
                    for (x = 1; x <= size; x++) {
                        if (personY == y && personX == x) {
                        } else if (castleX == x && castleY == y) {
                        } else {
                        }
                    }
                }
            }
        }

        String leftBlock = " | ";
        String rightBlock = " |";
        String wall = " + —— + —— + —— + —— + —— + ";
        int step = 0;
        String gamingField = "+ —— + —— + —— + —— + —— +\n"
                + "|    |    | \uD83C\uDFE0 |    |    |\n"
                + "+ —— + —— + —— + —— + —— +\n"
                + "|    | " + monster + " |    |    |    |\n"
                + "+ —— + —— + —— + —— + —— + |\n"
                + "| " + person + " |    |    |    |    |\n"
                + "+ —— + —— + —— + —— + —— +";
        for (int y = 1; y <= size; y++) {
            System.out.println(wall);
            for (int x = 1; x <= size; x++) {
                if (personY == y && personX == x) {
                    System.out.print(person);
                } else if (castleX == x && castleY == y) {
                   System.out.print(castle);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(rightBlock);
        }
        System.out.println(wall);
        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("Ваш ответ:\t" + answer);
        switch (answer) {
            case "ДА" -> {
                System.out.println("Выбери сложность игры(от 1 до 5):");
                int difficultGame = sc.nextInt();
                System.out.println("Выбранная сложность:\t" + difficultGame);
System.out.println("Сколько жизней будет у персонажа?");
 personLive = sc.nextInt(); // здесь необходимо рассказать о возможных ошибках(неверный тип, переполнение - еще раз и тд)

                System.out.println(gamingField);
                System.out.println("Количество жизней:\t" + personLive + "\n");
                System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;" +
                        "\nКоординаты персонажа - (x: " + personX + ", y: " + personY + "))");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(x + ", " + y);

                if (x != personX && y != personY) {
                    System.out.println("Неккоректный ход");
                } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                    personX = x;
                    personY = y;
                    step++;
                    System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY +
                            "\nХод номер: " + step);
                } else {
                    System.out.println("Координаты не изменены");

                }
            }
            case "НЕТ" -> System.out.println("Жаль, приходи еще!");
            default -> System.out.println("Данные введены неккоректно");
        }

    }
}
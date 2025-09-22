import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        int choice;
        System.out.print("Введите номер задания от 1 до 20 (для завершения введите 0): ");
        choice = lab1.inputInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    lab1.task1();
                    break;
                case 2:
                    lab1.task2();
                    break;
                case 3:
                    lab1.task3();
                    break;
                case 4:
                    lab1.task4();
                    break;
                case 5:
                    lab1.task5();
                    break;
                case 6:
                    lab1.task6();
                    break;
                case 7:
                    lab1.task7();
                    break;
                case 8:
                    lab1.task8();
                    break;
                case 9:
                    lab1.task9();
                    break;
                case 10:
                    lab1.task10();
                    break;
                case 11:
                    lab1.task11();
                    break;
                case 12:
                    lab1.task12();
                    break;
                case 13:
                    lab1.task13();
                    break;
                case 14:
                    lab1.task14();
                    break;
                case 15:
                    lab1.task15();
                    break;
                case 16:
                    lab1.task16();
                    break;
                case 17:
                    lab1.task17();
                    break;
                case 18:
                    lab1.task18();
                    break;
                case 19:
                    lab1.task19();
                    break;
                case 20:
                    lab1.task20();
                    break;
                default:
                    System.out.println("Такого задания нет");
                    break;
            }
            System.out.print("Введите номер задания от 1 до 20 (для завершения введите 0): ");
            choice = lab1.inputInt();
        }
    }
}

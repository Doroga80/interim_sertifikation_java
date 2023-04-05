package ToyShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Розыгрыш приза");
            System.out.println("3. Выйти");
            System.out.print("Введите номер действия: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    store.addToy();
                    break;
                case "2":
                    store.play();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Некорректный ввод.");
                    break;
            }
        }
    }
    
}

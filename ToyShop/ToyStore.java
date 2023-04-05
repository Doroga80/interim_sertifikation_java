package ToyShop;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class ToyStore {
    private List<Toy> toys;
    private Random random;

    public ToyStore() {
        toys = new ArrayList<>();
        random = new Random();
    }

    public void addToy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название игрушки: ");
        String name = scanner.nextLine();
        System.out.print("Введите вес игрушки (в граммах): ");
        int weight = scanner.nextInt();
        toys.add(new Toy(name, weight));
        System.out.println("Игрушка добавлена.");
    }

    public void play() {
        if (toys.isEmpty()) {
            System.out.println("Список игрушек пуст.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес приза (в граммах): ");
        int prizeWeight = scanner.nextInt();
        List<Toy> eligibleToys = new ArrayList<>();
        int totalWeight = 0;
        for (Toy toy : toys) {
            if (toy.getWeight() <= prizeWeight) {
                eligibleToys.add(toy);
                totalWeight += toy.getWeight();
            }
        }
        if (eligibleToys.isEmpty()) {
            System.out.println("Нет подходящих игрушек для розыгрыша.");
            return;
        }
        int winningIndex = random.nextInt(eligibleToys.size());
        Toy winningToy = eligibleToys.get(winningIndex);
        System.out.println("Выигрышная игрушка: " + winningToy.getName());
        System.out.println("Общий вес игрушек: " + totalWeight + " г");
        
    }
    

}
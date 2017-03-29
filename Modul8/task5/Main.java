package task5;

import task1.Country;
import task1.IdGenerator;
import task2.Food;
import task3.IManageSystem;
import task4.IManageSystemImpl;

/**
 * Created by Aleksandr on 27.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Food food1 = new Food(IdGenerator.randId(), "Egg", Country.UKRAINE, 20);
        Food food2 = new Food(IdGenerator.randId(), "Butter", Country.CANADA, 15);
        Food food3 = new Food(IdGenerator.randId(), "Bread", Country.POLAND, 3);
        Food food4 = new Food(IdGenerator.randId(), "Potatoes", Country.MOLDOVA, 12);
        Food food5 = new Food(IdGenerator.randId(), "Carrot", Country.USA, 18);
        Food food6 = new Food(IdGenerator.randId(), "Carrot", Country.USA, 18);
        Food food7 = new Food(IdGenerator.randId(), "Carrot", Country.USA, 18);
        Food food8 = new Food(11111, "Carrot", Country.USA, 18);

        IManageSystem<Food> manager = new IManageSystemImpl();

        manager.save(food1, 20.20);
        manager.save(food2, 15.20);
        manager.save(food3, 10.1);
        manager.save(food4);
        manager.save(food5);
        manager.save(food6);
        manager.save(food7);
        manager.save(food8);
        System.out.println();

        System.out.println("Sorted catalog of food by name: ");

        manager.printProductsSortedByName();
        System.out.println();

        System.out.println("Save food with price: ");
        manager.save(food4, 17);
        System.out.println();

        System.out.println("Save food with usual price:");
        manager.save(food1);
        System.out.println();

        System.out.println("Delete certain food: ");
        manager.delete(food3);
        System.out.println();

        System.out.println("Delete food by id: ");
        manager.deleteById(555);
        System.out.println();

        System.out.println("Get food by id: ");
        System.out.println(manager.get(11111));
        System.out.println();

        System.out.println("Get price of certain food: ");
        System.out.println(manager.getPrice(food4));
        System.out.println();

        System.out.println("Get all food: ");
        manager.getProducts();
        System.out.println();

        System.out.println("Get all prices: ");
        System.out.println(manager.getPrices());
        System.out.println();

        System.out.println("Sorted catalog of food by price: ");
        manager.printProductsSortedByPrice();
    }
}

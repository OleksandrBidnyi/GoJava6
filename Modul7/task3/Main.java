package task3;

import task1.Currency;
import task1.Order;
import task1.User;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Aleksandr on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        User aleks = new User(11111, "Aleks", "White", "London", 3500);
        User vasya = new User(11112, "Vasya", "Green", "Kyiv", 2200);
        User oksana = new User(11113, "Oksana", "Gray", "Odesa", 1200);
        User dmitriy = new User(11114, "Dmitriy", "Orange", "Odesa", 6200);
        User masha = new User(11115, "Masha", "Yellow", "London", 12200);
        User anatoliy = new User(11116, "Anatoliy", "Purple", "London", 1500);
        User oles = new User(11117, "Oles", "Brown", "Kyiv", 7200);
        User peter = new User(11118, "Peter", "Blue", "London", 4400);
        User nikolay = new User(11119, "Nikolay", "Black", "Kyiv", 24200);
        User natali = new User(11120, "Natali", "Pink", "Odesa", 19000);

        TreeSet<Order> setOrder = new TreeSet<Order>();

        setOrder.add(new Order(22221, 15, Currency.USD, "FlashCard", "Mall", aleks));
        setOrder.add(new Order(22222, 20, Currency.UAH, "Light", "Mall", vasya));
        setOrder.add(new Order(22223, 12, Currency.USD, "Battery", "Shop", oksana));
        setOrder.add(new Order(22224, 250, Currency.USD, "Mobile phone", "Shop", dmitriy));
        setOrder.add(new Order(22225, 2500, Currency.UAH, "Ford", "CarShop", masha));
        setOrder.add(new Order(22226, 5, Currency.USD, "Bananas", "Mall", anatoliy));
        setOrder.add(new Order(22227, 222, Currency.USD, "Tablet", "Shop", oles));
        setOrder.add(new Order(22228, 1005, Currency.USD, "Tour", "Tour operator", peter));
        setOrder.add(new Order(22230, 2000, Currency.USD, "Notebook", "Shop", natali));
        setOrder.add(new Order(22230, 2000, Currency.USD, "Notebook", "Shop", natali));

        System.out.println("check if set contain Order where User’s lastName is - “Petrov”: ");
        for (Order i : setOrder) {
            if (i.getUser().getLastName().equals("Petrov")) {
                System.out.println(i);
            } else
                System.out.println("TreeSet hasn`t user with last name Petrov ");
            break;
        }
        System.out.println();

        System.out.println("print Order with largest price using only one set method - get: ");
        System.out.println(setOrder.last());
        System.out.println();

        System.out.println("delete orders where currency is USD using Iterator: ");
        TreeSet<Order> treeSetWithoutUsd = new TreeSet<>();
        Iterator<Order> dellUsdIterator = setOrder.iterator();
        Order countOrders;
        while (dellUsdIterator.hasNext()) {
            countOrders = dellUsdIterator.next();
            if (countOrders.getCurrency() != Currency.USD) {
                treeSetWithoutUsd.add(countOrders);
            }
        }
        for (Order i : treeSetWithoutUsd) {
            System.out.println(i);
        }

        //The way to delete orders where currency is USD without creating new TreeSet
       /* Iterator<Order> dellUsdIterator = setOrder.iterator();
        while (dellUsdIterator.hasNext()){
            Order countOrders = dellUsdIterator.next();
            if (countOrders.getCurrency() == Currency.USD){
                dellUsdIterator.remove();
            }
        }
        for (Order i : setOrder) {
            System.out.println(i);
        }*/
    }
}

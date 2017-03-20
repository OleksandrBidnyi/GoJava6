package task2;

import task1.Currency;
import task1.Order;
import task1.User;

import java.lang.reflect.Array;
import java.util.*;


/**
 * Created by Aleksandr on 14.03.2017.
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

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(22221, 15, Currency.USD, "FlashCard", "Mall", aleks));
        orders.add(new Order(22222, 20, Currency.UAH, "Light", "Mall", vasya));
        orders.add(new Order(22223, 12, Currency.USD, "Battery", "Shop", oksana));
        orders.add(new Order(22224, 250, Currency.USD, "Mobile phone", "Shop", dmitriy));
        orders.add(new Order(22225, 2500, Currency.UAH, "Ford", "CarShop", masha));
        orders.add(new Order(22226, 5, Currency.USD, "Bananas", "Mall", anatoliy));
        orders.add(new Order(22227, 222, Currency.USD, "Tablet", "Shop", oles));
        orders.add(new Order(22228, 1005, Currency.USD, "Tour", "Tour operator", peter));
        orders.add(new Order(22230, 2000, Currency.USD, "Notebook", "Shop", natali));
        orders.add(new Order(22230, 2000, Currency.USD, "Notebook", "Shop", natali));


        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println("sort list by Order price in decrease order: ");
        for (Order i : orders) {
            System.out.println(i);
        }
        System.out.println();

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int priceCompare = o1.getPrice() - o2.getPrice();
                if (priceCompare != 0) {
                    return priceCompare;
                }
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        System.out.println("sort list by Order price in increase order AND User city: ");
        for (Order i : orders) {
            System.out.println(i);
        }
        System.out.println();

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int itemCompare = o1.getItemName().compareTo(o2.getItemName());
                if (itemCompare != 0) {
                    return itemCompare;
                }
                int idOrderCompare = (int) (o1.getId() - o2.getId());
                if (idOrderCompare != 0) {
                    return idOrderCompare;
                }
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        System.out.println("sort list by Order itemName AND ShopIdentificator AND User city");
        for (Order i : orders) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Extra: ");

        System.out.println("delete duplicates from the list: ");
        HashSet deleteDublicates = new HashSet();
        deleteDublicates.addAll(orders);
        for (Object i : deleteDublicates) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("delete items where price less than 1500");
        ArrayList<Order> lessPrice = new ArrayList<>();
        lessPrice.addAll(orders);
        for (int i = 0; i < lessPrice.size(); i++) {
            if (lessPrice.get(i).getPrice() < 1500) {
                lessPrice.remove(i);
                i--;
            }
        }
        for (Order i : lessPrice) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("separate list for two list - orders in USD and UAH: ");

        ArrayList<Order> uahList = new ArrayList<>();
        uahList.addAll(orders);
        for (int i = 0; i < uahList.size(); i++) {
            if (uahList.get(i).getCurrency() == Currency.USD) {
                uahList.remove(i);
                i--;
            }
        }
        System.out.println("UAH list: ");
        for (Order i : uahList) {
            System.out.println(i);
        }

        ArrayList<Order> usdList = new ArrayList<>();
        usdList.addAll(orders);
        for (int i = 0; i < usdList.size(); i++) {
            if (usdList.get(i).getCurrency() == Currency.UAH) {
                usdList.remove(i);
                i--;
            }
        }
        System.out.println("USD list: ");
        for (Order i : usdList) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("separate list for as many lists as many unique cities are in User: ");
        ArrayList<Order> kyivList = new ArrayList<>();
        ArrayList<Order> londonList = new ArrayList<>();
        ArrayList<Order> odesaList = new ArrayList<>();
        for (Order i : orders) {
            if (i.getUser().getCity() == "Kyiv") {
                kyivList.add(i);
            }
            if (i.getUser().getCity() == "London") {
                londonList.add(i);
            }
            if (i.getUser().getCity() == "Odesa") {
                odesaList.add(i);
            }
        }
        System.out.println("Kyiv list: ");
        for (Order i : kyivList) {
            System.out.println(i);
        }
        System.out.println("London list: ");
        for (Order i : londonList) {
            System.out.println(i);
        }
        System.out.println("Odesa");
        for (Order i : odesaList) {
            System.out.println(i);
        }
    }

}

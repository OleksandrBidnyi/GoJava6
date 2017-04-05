package task2;

import task1.Currency;
import task1.Order;
import task1.User;

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
        User peter = new User(11118, "Peter", "Petrov", "London", 4400);
        User nikolay = new User(11119, "Nikolay", "Black", "Kyiv", 24200);
        User natali = new User(11120, "Natali", "Pink", "Odesa", 19000);

        List<Order> orders = new ArrayList<>();

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

        //sort list by Order price in decrease order:
        System.out.println("sort list by Order price in decrease order: ");
        orders = Sort.sortByPriceDecrease(orders);
        orders.stream().forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("sort list by Order price in increase order AND User city: ");
        orders = Sort.sortByPriceIncreaseVsCity(orders);
        orders.stream().forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("sort list by Order itemName AND ShopIdentificator AND User city");
        orders = Sort.sortByItemVsIdVsCity(orders);
        orders.stream().forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("Extra: ");

        System.out.println("delete duplicates from the list: ");
        ArrayList<Order> deleteDublList = new ArrayList<>();
        deleteDublList.addAll(orders);
        deleteDublList = (ArrayList<Order>) Sort.deleteDublicates(orders);
        deleteDublList.stream().forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("delete items where price less than 1500");
        ArrayList<Order> lessPrice = new ArrayList<>();
        lessPrice.addAll(orders);
        lessPrice = (ArrayList<Order>) Sort.lessPrice(lessPrice);
        lessPrice.stream().forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("separate list for two list - orders in USD and UAH: ");
        Map<Currency,List<Order>> orderCurrencyMap = Sort.separateBy(orders,x->x.getCurrency());
        orderCurrencyMap.entrySet().stream().forEach(x-> System.out.println(x));
        System.out.println();

        System.out.println("separate list for as many lists as many unique cities are in User: ");
        Map<String ,List<Order>> orderCityMap = Sort.separateBy(orders,x->x.getUser().getCity());
        orderCityMap.entrySet().stream().forEach(x-> System.out.println(x));

        System.out.println("check if orders contain Order where User’s lastName is - “Petrov”: ");
        ArrayList<Order> checkByLastNameList = new ArrayList<>();
        checkByLastNameList.addAll(orders);
        checkByLastNameList = (ArrayList<Order>) Sort.checkByLastName(checkByLastNameList);
        checkByLastNameList.stream().forEach(x-> System.out.println(x));
        System.out.println();

        System.out.println("delete orders where currency is USD: ");
        ArrayList<Order> removeByCurrencyList = new ArrayList<>();
        removeByCurrencyList.addAll(orders);
        removeByCurrencyList = (ArrayList<Order>) Sort.removeByCurrency(removeByCurrencyList,Currency.USD);
        removeByCurrencyList.stream().forEach(x-> System.out.println(x));
        System.out.println();

    }
}

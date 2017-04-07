package task2;

import task1.Currency;
import task1.Order;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Aleksandr on 03.04.2017.
 */
public class Sort {
    //sort list by Order price in decrease order:
    static List<Order> sortByPriceDecrease(List<Order> list) {
        list = list.stream().sorted(((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice()))).collect(Collectors.toList());
        return list;
    }

    //sort list by Order price in increase order AND User city
    static List<Order> sortByPriceIncreaseVsCity(List<Order> list) {
        list = list.stream().sorted((o1, o2) ->
                (Integer.compare(o1.getPrice(), o2.getPrice())) != 0 ? Integer.compare(o1.getPrice(), o2.getPrice()) :
                        o1.getUser().getCity().compareTo(o2.getUser().getCity())).collect(Collectors.toList());
        return list;
    }

    //sort list by Order itemName AND ShopIdentificator AND User city
    static List<Order> sortByItemVsIdVsCity(List<Order> list) {
        list = list.stream().sorted((o1, o2) -> {
            int itemCompare = o1.getItemName().compareTo(o2.getItemName());
            if (itemCompare != 0) {
                return itemCompare;
            }
            int idOrderCompare = (int) (o1.getId() - o2.getId());
            if (idOrderCompare != 0) {
                return idOrderCompare;
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());

        }).collect(Collectors.toList());
        return list;
    }

    //delete duplicates from the list
    static List<Order> deleteDublicates(List<Order> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    //delete items where price less than 1500
    static List<Order> lessPrice(List<Order> list, int minValueFilter) {
        return list.stream().filter(o -> o.getPrice() > minValueFilter).collect(Collectors.toList());
    }

    //separate list for parameters
    static <T> Map<T, List<Order>> separateBy(List<Order> list, Function<Order, T> function) {
        return list.stream().collect(Collectors.groupingBy(function));
    }

    static List<Order> checkByLastName (List<Order> list, String lastName){
        return list.stream().filter(o -> o.getUser().getLastName().equals(lastName)).collect(Collectors.toList());
    }

    //delete orders by currency
    static List<Order> removeByCurrency(List<Order> list, Currency currency) {
        return list.stream().filter(o -> o.getCurrency() != currency).collect(Collectors.toList());
    }
}

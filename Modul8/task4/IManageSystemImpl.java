package task4;

import task2.Food;
import task3.IManageSystem;

import java.util.*;

/**
 * Created by Aleksandr on 27.03.2017.
 */
public class IManageSystemImpl implements IManageSystem<Food> {

    private  Map<Food, Double> database = new LinkedHashMap<>();
    private static final double USUALLY_PRICE = 5.0;

    @Override
    public Food save(Food obj, double price) {
        database.put(obj, price);
        System.out.println("Food has been saved with price");
        return obj;

    }

    @Override
    public Food save(Food obj) {
        database.put(obj, USUALLY_PRICE);
        System.out.println("Food has been saved without price");
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
        System.out.println("Certain food has been deleted");
    }

    @Override
    public void deleteById(int id) {
        if (this.get(id) != null) {
            database.remove(this.get(id));
        } else {
            System.out.println("This catalog doesn`t have this id");
        }
    }

    public Food get(int id) {
        Set<Map.Entry<Food, Double>> findFoodById = database.entrySet();
        for (Map.Entry<Food, Double> i : findFoodById) {
            if (i.getKey().getId() == id) {
                return i.getKey();
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        return database.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<Double>(database.values());
    }

    @Override
    public void printProductsSortedByName() {
        List<Map.Entry<Food, Double>> sortDB = new ArrayList<>(database.entrySet());
        Collections.sort(sortDB, Map.Entry.comparingByKey(Comparator.comparing(Food::getName)));
        for (Map.Entry<Food, Double> i : sortDB) {
            System.out.println("Product: " + i.getKey() + " Price currency: " + i.getValue());
        }
    }
    //Other way without using lambda
    /*@Override
    public void printProductsSortedByName(){
        List<Map.Entry<Food,Double>> sortDB = new ArrayList<>(database.entrySet());
        sortDB.sort(new Comparator<Map.Entry<Food, Double>>() {
            @Override
            public int compare(Map.Entry<Food, Double> o1,
                               Map.Entry<Food, Double> o2) {
                return o1.getKey().getName().compareTo(o2.getKey().getName());
            }
        });
        for (Map.Entry<Food, Double> sortByPrice : sortDB) {
            System.out.println(sortByPrice.getKey() + " " + sortByPrice.getValue());
        }
    }*/

    @Override
    public void printProductsSortedByPrice() {
        List<Map.Entry<Food, Double>> sortDB = new ArrayList<>(database.entrySet());
        Collections.sort(sortDB, Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<Food, Double> i : sortDB) {
            System.out.println("Product: " + i.getKey() + " Price currency: " + i.getValue());
        }
    }

    //Other way without using lambda
    /*public void printProductsSortedByPrice(){
        List<Map.Entry<Food,Double>> sortDB = new ArrayList<>(database.entrySet());
        sortDB.sort(new Comparator<Map.Entry<Food, Double>>() {
                        @Override
                        public int compare(Map.Entry<Food, Double> o1,
                                           Map.Entry<Food, Double> o2) {
                            return o1.getValue().compareTo(o2.getValue());
                        }
        });
        for (Map.Entry<Food, Double> sortByPrice : sortDB) {
            System.out.println(sortByPrice.getKey() + " " + sortByPrice.getValue());
        }
    }*/
}

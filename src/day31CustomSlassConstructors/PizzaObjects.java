package day31CustomSlassConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {

    public static void main(String[] args) {


        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza smallPizza = new Pizza('S', 2, 3);

            Pizza mediumPizza = new Pizza('M', 3, 4);
            Pizza largePizza = new Pizza('L', 4, 5);
            pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza));
        }
        System.out.println(" Total pizzas number = " + pizzas.size());

        double TotalPrice=0;
        for (Pizza pizza : pizzas) {
           TotalPrice+= pizza.calculateOfPizza();
        }
        System.out.println("TotalPrice = " + TotalPrice);
       
            
        
    }
}

package day30CustomClass;


import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setInfo("Toyota", "Cambry","White", 2021, 35000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW","Cambry", "Black", 2022, 12.500);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Purple", 2021, 3000);
        System.out.println(car3);

        //Car[] cars= { car1, car2,car3 };

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));
        for( Car each:carsList){
            System.out.println(each.brand+" : "+each.price);
        }

        System.out.println("-----------------");
        /* BMW: 2005-2008;
          Toyota: 1998-200;
         */

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year>=1998 && p.year<=2000);


    }
}

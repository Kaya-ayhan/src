package day31CustomSlassConstructors;

public class Pizza {
    public char size;
    public int numBerOFChesetopping, numBerOFPepperonitopping;

    public Pizza(char size, int numBerOFChesetopping, int numBerOFPepperonitopping) {
        this.size = size;
        this.numBerOFChesetopping = numBerOFChesetopping;
        this.numBerOFPepperonitopping = numBerOFPepperonitopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numBerOFChesetopping=" + numBerOFChesetopping +
                ", numBerOFPepperonitopping=" + numBerOFPepperonitopping +
                ", Total Price= $" + calculateOfPizza()+
                '}';
    }


    public double calculateOfPizza() {
        double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;
        double totalPrice = startingPrice + (numBerOFChesetopping + numBerOFPepperonitopping) * 2;
        return totalPrice;
    }

}

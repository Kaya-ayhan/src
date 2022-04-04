package day32CustomClass;

public class carpetExe {

    public double width, length;
    public double unitPrice;
    public boolean isPersian;

    public carpetExe(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }



    public double calcCost(){
        double totalPrice=(width*length)*unitPrice;
        if(isPersian)
            totalPrice+=200;
        return totalPrice;
    }

    public String toString() {
        return "carpetExe{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Price= $" + calcCost() +
                '}';
    }
}

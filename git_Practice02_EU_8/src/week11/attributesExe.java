package week11;

public class attributesExe {

    /*
    The class Atts holds a few attributes and has a method called asString.
    The attributes are name and color -both are strings and amount which is an int.
    Their visibility is public. asString returns a string showing all the Atts in a format.
     */


    public String color,name;
    public int amount;


    public String asString(){
        return "name: "+ name+ "color: "+ color;
    }

    public String toString() {
        return "attributesExe{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public attributesExe(String color, String name, int amount) {
        this.color = color;
        this.name = name;
        this.amount = amount;
    }
}

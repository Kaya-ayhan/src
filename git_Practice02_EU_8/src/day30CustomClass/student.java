package day30CustomClass;

public class student {

    public String name;
    public char gender;
    public  int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }
/* public void setInfo(String name, char gender, int age, int ID, char grade){
        this.name =name;
        this.gender = gender;
        this.age =age;
        this.ID = ID;
        this.grade =grade; */

        // setınfo yu yapmanın kısayolu: ilk olarak sağ tıkla generate i seç enter yap,
        // çıkanları işaretle select hepsini sonra ok de.
        // classname i void ve setInfo olarak değiştir.
    // this. instance variable ı kendi koyuyor. this. instance variable ve local variable isimleri aynı ise kullanılabiliyyor.





    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
    public void  code() {
        System.out.println(name +" is coding");
    }
    public void  sleep() {
        System.out.println(name +" is sleeping");
    }


}

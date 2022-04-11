package week13;

public class Db {

    private String data;
    private int yint;

    public void insertData(String data, int yint) {
       setData(data);
       setYint(yint);
        //this.data = data; // we can use this keyword if the instance variable name and local variable name is same
      // yint=1;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}

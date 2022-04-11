package week13.phone;

public class CameraPhone extends Phone{

    int imageSize;
    int memorySize;
    public CameraPhone(int x, int y){
      //  this();//  super();
      // super();
        imageSize=x;
       memorySize=y;
        //  super(); compiler error, it has to be at the first line
    }
    public CameraPhone(){}

    public int numPictures(){
       return memorySize*1000/imageSize;
    }
}

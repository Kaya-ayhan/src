package week09reviewOscar;

public class etsySearch {
    public static void main(String[] args) {
        System.out.println("U are testing tetsy browser");

        openBrowser("Crome");
        navigateTour("http.www.tetsy.com");
        searchForItem("Java");
        //System.out.println(verifyItemDisplay());
        if(verifyItemDisplay()=="Pass"){
            System.out.println("Your test case is passed");
        }else{
            System.out.println("Your test is failed");
        }


    }


    public static void openBrowser(String browser){
        System.out.println("Launching"+browser+"browser");
    }
    public static void navigateTour(String url){
        System.out.println("Navigating to "+url);
    }
    public static void searchForItem(String item){
        System.out.println("PASS item exits "+item+ " exist");
        System.out.println("Click on" + item);
    }
    public static String verifyItemDisplay(){
        String result="Pass";
        return result;
    }
}

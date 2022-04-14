package day27Wrappers;

public class wrapperClassMethods {
    public static void main(String[] args) {
        String str = "123456";
        int num = Integer.parseInt(str);
        System.out.println(num);
        System.out.println(str);
        System.out.println(num + 1);
        System.out.println(str + 1);
        System.out.println("--------------");
        String s = "10.5";

        double d = Double.parseDouble(s);
        System.out.println(d);
        System.out.println(s);

        System.out.println("-----------");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long maxx = Long.MAX_VALUE;
        long minn = Long.MIN_VALUE;
        String bol = "true";
        boolean boll = Boolean.parseBoolean(bol);
        String bil = "false";
        boolean bill = Boolean.parseBoolean(bil);
        System.out.println(max);
        System.out.println(min);
        System.out.println(maxx);
        System.out.println(minn);

        System.out.println(boll);
        System.out.println(bill);
        System.out.println("----------------");
        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        System.out.println("---------------");
        String s3 = "1.5";
        Double d1 = Double.valueOf(s3);
        System.out.println(d1);
        System.out.println("----------------");

        //is digit  ,is letter
        char ch = '0';
        char ch1 = 'A';

        boolean r2 = Character.isDigit(ch);
        boolean r3 = Character.isLetter(ch1);
        boolean r4 = !Character.isLetter(ch1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println("---------");

        // special char
        boolean r5 = !Character.isLetterOrDigit(ch1);
        System.out.println(r5);

        System.out.println("-----------");
//  upper case or lower case
        boolean r6 = Character.isUpperCase(ch1);
        boolean r7 = Character.isLowerCase(ch1);
        System.out.println(r6);
        System.out.println(r7);

        System.out.println("-----------------");

        // find a some of  all the digit in the a string

        String str3 = "a1bc2de4";

        int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }

            System.out.println("sum = " + sum);


        }
    }
}

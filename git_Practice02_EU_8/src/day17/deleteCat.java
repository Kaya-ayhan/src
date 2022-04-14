package day17;

public class deleteCat {
    public static void main(String[] args) {
        String s2 = "Cat Cat Cat Dog Cat";
        int countcat = 0;
        s2 = s2.toLowerCase();
        while (s2.contains("cat")) {
            s2 = s2.replaceFirst("cat", "");
            countcat++;
        }
        System.out.println(countcat);
        System.out.println(s2);
        System.out.println("----------------------");
        String s = "java java java phython phython phython";
        int countjava = 0;
        int countPhyton = 0;
        while (s.contains("java") || s.contains("phyton")) {
            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countjava++;

                if (s.contains("phython")) {
                    s = s.replaceFirst("phython", "");
                    countPhyton++;

                }

            }
        }
        System.out.println("countjava: " + countjava);
        System.out.println("count phyton: " + countPhyton);
    }
}
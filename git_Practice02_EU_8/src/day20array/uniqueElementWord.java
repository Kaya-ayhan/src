package day20array;

public class uniqueElementWord {
    public static void main(String[] args) {
        String[] word = {"Java", "Java", "Java", "Phyton", "Phyton", "C++"};

        for (int j = 0; j < word.length; j++) {     // önce her bir elementin tekrar sayısını bulmak için inner loopu yaptık sonra herbir elementle karşılaştırmsk için outer loopu yaptık


            String element = word[j];   ///buradan freq++ ya kadar arraydaki bir tane elemanın tekrar sayısını gösteriyor.
            int freq = 0;
            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(element)) {
                    freq++;
                }

            }
            if(freq==1){    // outer loopun içine uniqe elementi bulmak için freq 1 e eşit olanı println yaptık
                System.out.println(element);
            }
        }
    }
}

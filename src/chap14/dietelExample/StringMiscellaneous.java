package chap14.dietelExample;

public class StringMiscellaneous {
    public static void main(String[] args) {


        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "   spaces  ";

        System.out.println(s1.replace('l','L'));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.trim());

        char[] s = s1.toCharArray();
        for (char charArray: s) {
            System.out.println(charArray);
        }
        System.out.println();

    }
}

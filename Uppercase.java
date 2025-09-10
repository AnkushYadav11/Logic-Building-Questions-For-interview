import java.util.Arrays;

public class Uppercase {
    public static char upperCase(char c) {
        // 65 to 90 small letter.
        // 96 to 122 large latter.
        if (c >= 'a' && c <= 'z') { // if(c>=65 && c<=90)
            int num = c; // c = 67 
            c = (char) (num - 32); // 67-32
        }
        return c;
    }

    public static void main(String[] args) {
        String str = "hello world"; // length 11 = 0-10
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == 0 || i == c.length - 1) {
                c[i] = upperCase(c[i]);
            } else if (c[i] == ' ') {
                c[i - 1] = upperCase(c[i - 1]);
                c[i + 1] = upperCase(c[i + 1]);

            }
        }
        System.out.println("upperCase array:- "+Arrays.toString(c));
    }
}

public class Count {
    public static void main(String[] args) {
        String str = "Hello i Am Ankush";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (str.charAt(i + 1) == 'A') {
                    count++;
                }
            }
        }
        System.out.println("Number of words with char 'A' is:-"+count);
    }
}

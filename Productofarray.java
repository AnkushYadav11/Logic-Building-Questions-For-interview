public class Productofarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int pro = arr[0];
        for(int i=1;i<arr.length;i++){
            pro *= arr[i];
        }
        System.out.println("Product of array:- "+pro);
    }
}

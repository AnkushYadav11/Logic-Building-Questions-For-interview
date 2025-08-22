import java.util.*;
class Acending{
	public static void main(String[] args){
		int arr[] = {1,5,3,4,2};
		System.out.println("...Before Sorting...");
		for(int n=0;n<arr.length;n++){
			System.out.print(arr[n] + " ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println("\n...After Sorting...");
		for(int a=0;a<arr.length;a++){
			System.out.print(arr[a] +" ");
		}
	}
}

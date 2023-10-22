import java.util.*;

public class JAVA_A_shuffleAnArray
{
	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5, 6, 7};
	    
	    for(int i = 0; i<arr.length;i++){
		   //generate a random number from 0 to maximum index of given array
	       int a = (int) (Math.random() * (arr.length-1));
	       if(i!=a){
	           int temp2 = arr[i];
	           arr[i] = arr[a];
	           arr[a] = temp2;
	       }
	    }
		
		//print the fetched array
		System.out.print("{");
		for(int j=0;j<arr.length;j++){
		   if(j==arr.length-1){
		      System.out.print(arr[j] + "}"); 
		   }else{
		       System.out.print(arr[j]+", ");
		   }
		}
	}
}
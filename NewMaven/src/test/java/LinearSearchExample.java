import java.util.Scanner;

public class LinearSearchExample {
	
	
	public static int linearSearch(int[] arr, int key){    
		for(int i=0;i<arr.length;i++){    
			if(arr[i] == key){    
				return i;    
			}    
		}    
		return -1;    
	} 

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int[] a1= {10,20,30,50,70,90};   
		System.out.println("Enter the element to find: "); 		
		int key = sc.nextInt();
		
		int result = linearSearch(a1, key);
		
		if(result != -1){
			System.out.println(key+" is found at index: "+result);  
		} else {			
			System.out.println(key+" is not found in the array: ");  
		}

	}

}

import java.util.Scanner;

public class BinarySearch {
	// 재귀함수
	public static void BinarySearchRecursively(int[] arr, int left, int right, int key){
		if(left >right)
			return;
		else{
			int mid = (left + right)/2;
			
			if(arr[mid] < key)
				BinarySearchRecursively(arr, mid+1, right, key);
			else if(key < arr[mid])
				BinarySearchRecursively(arr, left, mid+1, key);
			else	// arr[mid] == key
				System.out.println("Find Key("+arr[mid]+")!");
		}
	}
	// 일반함수
	public static void BinarySearchFunc(int[] arr, int left, int right, int key){
		while(left<=right){
			int mid = (left + right)/2;
			
			if(arr[mid] < key)
				right = mid-1;
			else if(key < arr[mid])
				left = mid+1;
			else{
				System.out.println("Find Key("+arr[mid]+")!");
				return;
			}
		}
		System.out.println("Key(" + key + ") doesn't find..");
		return;
	}
	
	public static void main(String[] args) {
		int n = 7;
		int[] array = {80, 40, 70, 10, 50, 90, 60};
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input Key : ");
		int key = keyboard.nextInt();
		
		BinarySearchRecursively(array, 0, n, key);
		BinarySearchFunc(array, 0, n, key);
	}

}

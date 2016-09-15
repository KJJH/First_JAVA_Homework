public class BubbleSort {
	public static void main(String[] args) {
		int n = 7;
		int[] array = {80, 30, 70, 10, 50, 90, 60};
		
		// �����ϱ� �� �迭
		System.out.print("Before\t: ");
		for(int i=0; i<n; i++)
			System.out.print(array[i] + " ");
		System.out.println("");
		
		// Bubble sort
		int temp;
		for(int i=0; i<(n-1); i++){
			for(int j=1; j<n; j++){
				if(array[j] < array[j-1]){
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		
		// ���� �� �迭
		System.out.print("After\t: ");
		for(int i=0; i<n; i++)
			System.out.print(array[i] + " ");
		System.out.println("");
	}
}

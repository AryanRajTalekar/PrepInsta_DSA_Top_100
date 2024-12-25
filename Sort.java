public class Sort{
	public static void bubble_sort(int[] arr,int n){
		for(int i=n-1;i>=0;i--){
			int didSwapp = 0;
			for(int j=0;j<=i-1;j++){
				if(arr[j]>arr[j+1]){
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					didSwapp = 1;
				}
			}

			if(didSwapp == 0){
				break;
			}
			

		}

		System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

	}

	public static void main(String [] args){
		int [] arr = {13, 46, 24, 52, 20, 9};
		int n = arr.length;
		
		System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr,n);
	}
}
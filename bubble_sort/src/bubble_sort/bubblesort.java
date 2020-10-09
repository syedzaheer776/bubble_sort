package bubble_sort;

public class bubblesort {
	public static void Bubblesort(int array[]) {
		for(int i= array.length -1; i>=0; i--) {
			for(int j=1;j<=i;j++) {
				if(array[j-1]>array[j]) {
					int tmp=array[j-1];
					array[j-1]=array[j];
					array[j]= tmp;
				}
			}
		}
		
	}
public static void printArray(int array[]) {
	for(int i=0;i<array.length;i++)
		System.out.println(array[i] +",");
}
	public static void main(String[] args) {
		int[]array = {7,5,9,3,2};
		printArray(array);
		Bubblesort(array);
		printArray(array);
	}
}

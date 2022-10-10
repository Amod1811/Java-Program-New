package arrayProgram;

public class ReplaceArrayElement {

	public static void main(String[] args) {
		System.out.println("Original Array Element");
		int arr[] = {10, 20, 30, 40, 50};
		for(int i =0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
		}
		int index_pos = 3;
		int element = 100;
		for(int i = arr.length-1; i < index_pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[index_pos]=element;
		System.out.println("After Replace Array element postion ");
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}

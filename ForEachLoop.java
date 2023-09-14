//find bigger number from array by using for each loop
public class ForEachLoop {
	public static void main(String[] args) {
		int [] numbers = {10, 5, 7, 21, 3, 14, 25, 8};
		int l = Integer.MIN_VALUE; 
        for (int n : numbers) {
            if (n > l) {
                l = n;
            }
        }
        System.out.println("The largest number is: " + l);
	}
}

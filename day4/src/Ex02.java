import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int array[] = new int [9];
		array[0] = s.nextInt();
		int max = array[0];
		int count = 0;
		for(int i=1; i<array.length; i++) {
			array[i] = s.nextInt();
			if(array[i]>max) {
				max = array[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.print(count);
	}

}

package ejc88_lab7;
import java.util.Scanner;  // Import the Scanner class
public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("how long would you like your array to be?");
		int arrayLength = scan.nextInt();
		double[] data = new double[arrayLength];
		for (int i=0; i<arrayLength; i++) {
			data[i] = Math.random();
		}
		double max = max(data);
		System.out.println(max);
		double min =min(data);
		System.out.println(min);
		double sum =sum(data);
		System.out.println(sum);
		double ave =ave(data);
		System.out.println(ave);
		
	}

	public static double max(double[] data) {
		double max = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	public static double min(double[] data) {
		double min = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	public static double sum(double[] data) {
		double sum = 0;

		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	public static double ave(double[] data) {
		double ave = 0;

		for (int i = 0; i < data.length; i++) {
			ave += data[i];
		}
		ave = ave / (data.length);
		return ave;
	}
}

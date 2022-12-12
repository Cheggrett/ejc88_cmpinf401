package ejc88_lab10;

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =234;
		System.out.println(sumOfDigits(num));
		int array[]= {1,2,3,4,5,6,7,8,9};
		printArrayElements(array,0);
	}
	public static int sumOfDigits(int x) {
		if(x==0) {
			return 0;
		}
		return (x%10+sumOfDigits(x/10));
	}
	public static void printArrayElements(int a[],int index) {
		System.out.println(a[index]);
		index++;
		if(index !=a.length) {
			printArrayElements(a,index);
		}
	}
	public static void printCombos1(int a[],String out, int startIndex, int k) {
	if(k<=(a.length)){
		printCombos2(a,out,startIndex,k);
		printCombos1(a,out,startIndex,k-1);
	}
	
	}
	public static void printCombos2(int a[],String out, int startIndex, int k) {
		if(startIndex+k<=(a.length)){

		}
		
		}
}

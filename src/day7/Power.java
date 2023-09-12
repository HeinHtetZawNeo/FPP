package day7;

public class Power {

	public static void main(String[] args) {
		System.out.print(power(10));
	}
	
	public static int power(int x) {
		if(x<=1) return 1;
		
		return x*power(x-1);
	}
}

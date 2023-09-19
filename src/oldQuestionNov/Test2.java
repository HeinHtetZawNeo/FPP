package oldQuestionNov;

public class Test2 {

	public static void main(String[] args) {
		int temp=0;
		for(int i=3;i<=9;i++) {
			for(int j=0;j<=temp;j++) {
				System.out.print(i+""+j+"00 ");
			}
			temp++;
			System.out.println();
		}
		
		System.out.println(findPower(2,0));
		System.out.println("====");
		printPrime();
	}

	public static int findPower(int x,int y) {
		if(y<=0) return 1;
		
		return x * findPower(x,y-1);
	}
	
	public static void printPrime() {
		for(int i=2;i<=50;i++) {
			if(isPrime(i,2))
				System.out.println(i);
		}
	}
	public static boolean isPrime(int n,int i) {
		if(i>=n) return true;
		if(n % i==0) return false;
		
		return isPrime(n,i+1);
	}
}

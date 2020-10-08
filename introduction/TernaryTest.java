package introduction;

public class TernaryTest {

	static boolean isPrime(int n){
		//code stuff to check n is prime or not
		if(n==1)
			return false;
		if(n==2)
			return true;
		for(int d = 2; d<n/2; d++)
		{
			if(n%d == 0)
				return false;				
		}
			
		return true;
	}
	
	public static void main(String[] args) {
		int a = 85;
		
		if(isPrime(a))
			System.out.println(a+" is a prime");
		else
			System.out.println(a+" is a not a prime");
		}

}

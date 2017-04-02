
public class ProjectEuler3 {

//	The prime factors of 13195 are 5, 7, 13 and 29.
//	What is the largest prime factor of the number 600851475143 ?
	
	public static void main(String[] args) {
		
//		for(int x=2; x<1000; x++){
//			if(isPrime(x)){
//				System.out.println( x+ " is a prime.");
//			}
//		}
		
//		my stupid solution that took forever :(
		
//		long testNumber = 600851475143L;
//		long i = (testNumber/2L);
//		for(; i>1; i--){
//			if(isPrime(i)){
//				if(testNumber%i == 0){
//					System.out.println("largest prime factor of " + testNumber + " is : " + i);
//					break;
//				}
//			}
//		}
		
		long n=6008514751430L;

	    for(long i=2;i<n ;++i)
	    {
	        while(n % i==0)
	        {
	            n=n/i;
	        }
	    }
	    System.out.println(n);
		
	}

}

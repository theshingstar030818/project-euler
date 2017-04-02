import java.util.Queue;

public final class Library {

	public static boolean isPrime (long n){
		
		if(n<2)return false;
		if(n==2 || n==3 || n==5 || n==7)return true;
		if(n%5==0)return false;
		
		for(int i=2; i<Math.sqrt(n)+1; i++){
			if(n%i == 0 ){
				return false;
			}
		}
		return true;
	}
	
	public static long getProductOfAllInQueue(Queue<Integer> q){
		long prod = 1;
		
		for(Integer i : q){
			prod*=i;
		}
		return prod;
	}
	
	public static boolean isPalindormic(int n){
		int palindormic = n;
		int reverse = 0;
		while(n>9){
			reverse = (reverse*10) + n%10;
			n=n/10;
		}
		reverse = (reverse*10) + n;		
		return (reverse == palindormic);
	}
	
	public static long GCD(long x, long y) {
        if (x % y == 0) {
            return y;
        }
        return GCD(y, x % y);
    }
	
	//http://stackoverflow.com/questions/13719768/project-euler-5smallest-positive-number-divisible-by-all-numbers-from-1-to-20
	public static long LCM(long a, long b){
		return ((a*b)/GCD(a,b));
	}
	
	public static long sumOfRange(long a, long b){
		
		long sum = 0;
		
		for(long i=a; i<b+1; i++){
			sum+= i;
		}
		return sum;
	}
	
	public static long diffSumAndSumOfSquares(long a, long b){
		
		long sum = 0;
		long sumOfSquares = 0;
		
		for(long i=a; i<b+1; i++){
			sum+= i;
			sumOfSquares+= i*i;
		}
		
		long diff =  power(sum,2) - sumOfSquares;
		
		return diff;
	}
	
	public static long power(long x,long n){
		return (long) (Math.pow(x, n));
	}
	
}


public class ProjectEuler7 {

//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//	What is the 10 001st prime number?
	
	public static void main(String[] args) {
		
		long N=10002, counter=1, i=2;
		
		long start = System.nanoTime();
		
		while(counter<N){
			if(Library.isPrime(i)){
				System.out.println(i + " is "+ counter +"th prime");
				counter++;
			}
			i++;
		}
		
		long stop = System.nanoTime();
        System.out.println("Time: " + (stop - start) / 1000 + " ns");
	}

}

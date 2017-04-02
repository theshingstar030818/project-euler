import java.math.BigInteger;

public class ProjectEuler10 {

	public static void main(String[] args) {

		long sum = 0;
		
		long start = System.nanoTime();
		
		for(int i=0; i <2000000; i++){
			if(Library.isPrime(i)){
				sum+=i;
			}
		}
		System.out.println(sum);
		
		long stop = System.nanoTime();
        System.out.println("\nTime: " + (stop - start) / 1000 + " ns\n\n");
        
//        start = System.nanoTime();
//        
//        Soultion_by_stefan_yes();
//        
//        stop = System.nanoTime();
//        System.out.println("\nTime: " + (stop - start) / 1000 + " ns");
        
	}

//	public static void Soultion_by_stefan_yes()
//	{
//		BigInteger sum = BigInteger.ZERO;
//		for (BigInteger num = BigInteger.valueOf(2); num.compareTo(BigInteger.valueOf(1000000)) < 0; num = num.nextProbablePrime())
//			sum = sum.add(num);
//		System.out.println(sum.toString());
//	}
	
}

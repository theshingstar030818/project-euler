
public class ProjectEuler9 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		double a;
		
		for(int b=1; b<1000; b++){
			
			a = ( (Math.pow(1000, 2) - 2000*b ) / (2000- 2*b) );
			
			if(Math.floor(a) == a) {
				// a is an integer
				double c = Math.sqrt((a*a + b*b));
				System.out.println("a : " + a + " b :" + b + " c : " + c);
				long product = (long) (a*b*c);
				System.out.println("product abc : " + product);
				break;
				
			} else {
			   //a is not an integer.
			}
			
		}
		
		long stop = System.nanoTime();
        System.out.println("\nTime: " + (stop - start) / 1000 + " ns");
		
		
	}

}

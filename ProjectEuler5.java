
public class ProjectEuler5 {

//	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	
	public static void main(String[] args) {

		long y=11, lcm=2520, tmp;
		
		for(;y<21;y++){
			tmp = lcm*y/Library.GCD(lcm,y);
			if(tmp > lcm){lcm = tmp;}
		}
		System.out.println( "lcm : " +  lcm );
	}
}

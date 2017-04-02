
public class ProjectEuler4 {

//	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//	Find the largest palindrome made from the product of two 3-digit numbers.

	
	public static void main(String[] args) {
		
		int x = 999; // largest 3-digit number
		int largestProduct = 0;
		
		for(int y=x; y>0; y--){
			int product = x*y;
			if(Library.isPalindormic(x*y)){
				if(product>largestProduct){
					largestProduct = product;
					System.out.println("3-digit numbers product palindormic number : " + x + " * " + y + " : " + product);
				}
			}
			
			if(y==100 || product < largestProduct){y=x;x--;}
		}
	}
	


}

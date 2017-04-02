
public class ProjectEuler2 {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		
		int sum = 0;
		
		for (int i=0; n2<4000000; i++){
			if(n2%2 == 0){
				sum+= n2;
			}
			int tmp = n1+n2;
			n1 = n2;
			n2 = tmp;
		}
		
		System.out.println(sum);
	}

}

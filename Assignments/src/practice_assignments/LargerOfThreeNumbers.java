package practice_assignments;

public class LargerOfThreeNumbers {

	public static void main(String[] args) {
		double a = 935.878 ;
		double b = 34564326.7676 ;
		double c = 74574.7846456 ;
		
		if (a>=b && a>=c) {
			System.out.println("a is the larger number");
		} else  if (b>a && b>c) {
			System.out.println("b is the larger number");
		}
		else {
			System.out.println("c is the largest number");
		}
	}

}



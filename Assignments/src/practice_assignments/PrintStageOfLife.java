package practice_assignments;

public class PrintStageOfLife {
public static  int age = 12 ;
	public static void main(String[] args) {
		
		if (age > 0 && age < 2) {
			System.out.println("Infant");
			
		}
		if (age >= 2  && age  <= 12) {
			System.out.println("Child");
			
		}
		if (age >=12 && age<=25) {
			System.out.println("Youth");
			
		}
		if (age >=25 && age<=59) {
			System.out.println("Adult");
			
		}
		if (age >=59 && age<=100) {
			System.out.println("Sr.Citizen");
			
		}
		if (age  > 100) {
			System.out.println("Invalid age");
			
		}

	}

}


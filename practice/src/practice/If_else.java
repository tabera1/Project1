package practice;

public class If_else {

	public static void main(String[] args) {
		
		char grade = 'C';  
		
		if (grade== 'A')
			System.out.println(" you earned A  Fantastic job!");
		
		else if (grade=='B') 
		     System.out.println("You earned B  Good job!");
		
		else if (grade=='C')
			System.out.println("You earned C  You are an average student!");
		
		else if (grade=='D')
			System.out.println("You earned D  unsatisfactory!");
		
		else System.out.println("You earned F You Failed!");

	}

}

package practice;


public class Switch_stat {

	public static void main(String[] args) {
		
		char grade='A';
		
		switch(grade) {
		
		case 'A':
			System.out.println("You made an A  Excelent job!");
			break;
		case 'B':
			System.out.println("You made B  Good Job!");
			break;
		case 'C':
			System.out.println("You made C  you did okye");
			break;
		case 'D':
			System.out.println("You made D  Yod did poorly");
			break;
		case 'F':
			System.out.println("You made an F  You failed");
			break;
		default:
			System.out.println("You made an invalid entery"); 
		
		}
		

	}

}

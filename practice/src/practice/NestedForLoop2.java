package practice;

public class NestedForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//i=1
		//j=1 1
		//i=2
		//j= 1 1 2
		//i=3
		//j=1 1 2 3
		//i=4
		//j=1 1 2 3 4
		//i=5
		//j=1 1 2 3 4 5
		
	   for (int i=1; i<=5; i++) {
		   for(int j=1; j<=i; j++) {
			   System.out.print(" * ");
		   }
		   System.out.println();
	   } 
	   
	   System.out.println();
	   for (int i=1; i<=5; i++) {
		   for(int j=1; j<=4; j++) {
			   System.out.print(" * ");
		   }
		   System.out.println();
	}
	   
	   System.out.println();
	   for (int i=1; i<=4; i++) {
		   for(int j=1; j<=4; j++) {
			   if (i==1||i==4 || j==1 || j==4) {
				   System.out.print("*" + " ");
			   } else {
			   System.out.print(" " + " ");
		   }
		   }
		   System.out.println();
	}
}
}
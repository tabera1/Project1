package practice;

public class EvenNumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		for (int i=0; i<=50; i+=2) {   // excute even numbers count 50
			
			System.out.print(i + " ");
		}
		
		 System.out.println();  
		 
		for (int i=1; i<=50; i++) {
			
			if(i%2==0) {
				
				System.out.print(i + " ");
			}
		    }
			System.out.println(); 
			 
				for (int i=1; i<=50; i++) {
					
					if(i%2!=0) {
						
						System.out.print(i + " ");
					
						
			}
		}
	}

}

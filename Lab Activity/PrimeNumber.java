/*
 * @ Author Saurabh Mathe
 */

package SwitchX;

public class PrimeNumber {

	private static void prime() {
		// Declaring the variable
		int i,m=0,flag=0;      
		int n=7;//It is the number to be checked    
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");  
			//Print prime number
		}
		else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");  
					//Print not a prime number
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number");}}
	}
	//End of else  

	public static void main(String args[]) {
		prime();
	}
}
















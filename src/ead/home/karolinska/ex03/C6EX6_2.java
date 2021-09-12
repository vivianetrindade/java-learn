package ead.home.karolinska.ex03;

public class C6EX6_2 {
	
	public static void main(String[] args){
		//Chapter 6 Excersize 6.2
		//If you uswe number 4 and 2, 5 and 3 then you will get the expected reesutl
		
		System.out.println("Is 4 divisible by 2: " + isDivisible(4, 2));
		System.out.println("Is 5 divisible by 3: "+ isDivisible(5, 3));
		//Expected output: Is 4 divisible by 2: true                                                       
        //                  Is 5 divisible by 3: false
		
	
		
	}
	public static boolean isDivisible (int n, int m){
	     return (n % m == 0); 
	     
	} 
	

}

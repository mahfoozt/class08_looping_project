
public class Quiz41_Reverse_NUM {

	public static void main(String[] args) {
//Quiz 27
		int i=13;
	    while(i<=20){
	        if((i==16) || (i==17)){
	        	i=i+1;
	          continue;
	        }     
	    System.out.println(i); 
	     i=i+1;
	        
	    } 
		System.out.println("-----------------");
//		//41 Factorial number 6
//		int x=6;
//	    int result=1;
//	    int i=1;
//	    while(i<7){
//	        
//	        result=(result * i);
//	        i++;
//	    }
//	    System.out.print("Factorial of : "+x+" is "+result);
	   System.out.println();
	//	How to print 100 factorial in Java?
				int x1 = 100; 
				int result1 = 1; 
				for (int i1 = 1; i1 < (x1 + 1); i1++) 
				{ result1 = (result1 * i1); 
				} 
				System.out.println("asasdd"+result1);
		
		
		
//		int n=525;
//		int reverse = 0;
//		int t=n;
//		int remainder = 0;
//		while(t>0) {
//			
//			remainder = t%10;
//			reverse = reverse *10 + remainder;
//			t=t/10;			//t/=10;
//			
//		}
//		System.out.println(reverse);
//quiz 43
		
		int number =34;
		int xxx=2, count1=0;
		while(xxx <= number /2) {
			if(number % xxx ==0) {
			count1++;
			break;
		}
		xxx++;
		}
		if(count1 ==0) {
			System.out.println("Number is primenumber");
		}
		else {
			System.out.println("Number is not prime");
			
		}
		
		
	
	}

}

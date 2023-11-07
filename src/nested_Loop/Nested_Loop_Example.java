package nested_Loop;

public class Nested_Loop_Example {

	public static void main(String[] args) {
//quiz20
		for(int i=1; i<=3; ++i) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				
			}System.out.println("");
		}
		
//quiz19		
		int weeks=2;
		int days=7;
		for( int i=1; i<=weeks; ++i) {
			System.out.println("week: "+i);
			for( int j=1; j<=days; ++j) {
				System.out.println("Days: "+ j);
				
			}
		}
//quiz17	
		for(int i=1; i<=4; ++i) {
			for(int j=1; j<=i; ++j) {
				System.out.print(j+ " ");
				
			}
			System.out.println(i);
		}
		
		
		
//quiz15
		for(int y=1; y<=10; y++) {
			for(int x=1; x<=10; x++) {
				System.out.print((y*x)+" ");
				
			}System.out.println("=table of "+y);
		}
		
////quiz 14
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("");
				
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
				
			}System.out.println();
			
			}	
//quiz 12------print * infinity times 
//		for(int i=1; i<5;) {
//			for(int j =1; j<=5; j++) {
//				System.out.println("*");
//				
//				System.out.println();
//				
//			}
//			
//		}
//quiz 10
//		int outer =1;
//		while(outer<=2) {
//			int day=1;
//			while(day <=5) {
//				System.out.println("weekday");
//				day++;
//			}
//			System.out.println("weekend");
//			outer++;
//		}
		
//pattern Nested loop quiz 9
		
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("");
				
			}
			for(int k=1; k<=i; k++) {
				System.out.print("&");
				
			}System.out.println();
			
			}	

	}

}

package class_08_Method;

public class Quiz_36 {
	public static void main(String[] args) {
//23
		for(int i=2; i<=5; i++) {
			for(int j=7; j<=9; j++) {
				System.out.print("i = "+i);
				System.out.println(" j = "+j);
			}		
		}
		
//7
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			
		System.out.println();
		}
//22
		for(int row=1; row <= 3; row++) {
			for(int col=1; col<=5; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
//21	
		for(int line=1; line<=5; line++) {
			for(int j=1; j<=(-1*line+5); j++) {
				System.out.print(".");		
			}
			System.out.print(line);
			for(int j=1; j<=(line-1); j++ ) {
				System.out.print(".");	
			}
			System.out.println();
			}
		
////quiz36
//		int r=1, c=1;
//		int x;
//		do {
//			x=4;
//			do {
//				System.out.print("");
//				x--;
//			}while(x>=r);
//			c=1;
//		do {
//			System.out.print("*"+" ");
//			c++;
//		}while(c<=r);
//		System.out.println(" ");
//		r++;
//		}while(r<=5);
		
	}

}

package class_08_Method;

public class Quiz_27 {

	public static void main(String[] args) {
//27
		int rows = 5, coef = 1;
	    for(int i = 0; i < rows; i++) {
	      for(int space = 1; space < rows - i; ++space) {
	        System.out.print(" ");
	      }
	      for(int j = 0; j <= i; j++) {
	        if (j == 0 || i == 0)
	          coef = 1;
	        else
	          coef = coef * (i - j + 1) / j;
	        System.out.printf("%2d", coef);
	      }
	      System.out.println();
	    }
		
		
		
//		int space = 5;
//		for(int i=1; i<=6; i++) {
//			for(int k=0; k < space; k++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<i; ++j) {
//				System.out.print(" "+j);
//			}
//			
//			System.out.println();
//			space--;
//		}

	}

}

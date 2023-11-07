
public class Quiz23_do_while {

	public static void main(String[] args) {
		int i=1;
        char a='A';    //A B C D E F G H ----------  
        do{           
            System.out.print(a+" ");
            i++;
            a++;          
        } while(i<=26);
        System.out.println();
//Pattern print 
		int r=1, c=1;
		int x=0;
		do {
			x=4;
			do {
				System.out.print("");
				x--;
			}while(x>=r);
			c=1;
			do {
				System.out.print("*"+" ");
				c++;
			}while(c<=r);
			System.out.println(" ");
			r++;
			
		}while(c<=5);
		
		
		
		
		
		
		
		
		
		
		int f=1;
		int g=0;
		do {
		       System.out.print(f);
		       if (f !=9)
		             System.out.print("+");
		       g=g+f;
		       f+=2;
		       //g=g+f;
		} while(f<10);
		//g=g+f;
		System.out.println("="+ g);

	}

}

package class08_do_while;

public class Do_While_example {

	public static void main(String[] args) {
		//quiz24
		int b=1;
		do {
			System.out.println(b);
			b--;
		}while(b>=10);//b<=10 infinity times 
		
		
		int i=10;
		do {
			//System.out.println(i);
			System.out.print(i);	//012345678910
			i--;
		}while(i>0);
		//int arr[]= {3,4,5,7,8,9};
//		int i1=10;
//		do {
//			//i++;	//error occurd
//			//System.out.println(arr[i]);
//			System.out.println(i1);
//			i1--;
//		}while(i1>1);
		System.out.println();
		int a=1;//print 5 times new york 
		do {		
			System.out.println("New York");
			a++;
			//System.out.print(a);
			//a+=2;
		}while(a<=5);     //while(a<=9);//while(a<=5);
//		//----------------------
//		do {
//			System.out.println("Java");//true--infinity times
//		}while(false); //print 1 times
	}

}

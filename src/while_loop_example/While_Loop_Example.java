package while_loop_example;

public class While_Loop_Example {
	
	public static void main(String [] arg) {
//Quiz31
		int xx=11;
		int ss=0;
		while(xx<=25) {
			System.out.println(ss);
			ss +=xx;
			xx+=2;
		}
		
//Quiz 39
//		 int i=0;
//		    System.out.println("Odd Numbers");
//		    while(i<=11){
//		        System.out.print(i+" ");
//		        i+=3;
//		    
//		             }
		
//QUIZ38
//		int i=0;
//	    System.out.println("Even Numbers");
//	    while(i<=10){
//	        System.out.print(i+" ");
//	        i+=2;
//	         }
	    
//Quiz36		it will print 4 times SkyItSchool
//		int x2=0;
//		while(x2++ <20) {
//			if(x2%2==0)
//				System.out.println("SkyItSchool");
//			else if (x2==9)
//				break;
//			else
//				continue;
//				
//			//}
//			
//		}
		
////quiz35
		int u=1, z=1;
		while(u<=5) {
			//System.out.print("u= "+u);
			z=z*u; u++;
			//System.out.print(" z= "+z+"  ");
			System.out.print(z+" ");
		}
//quiz33
//		int k1=1, i1=2;
//		while(++i1<6)
//			k1*=i1;
//		System.out.println(k1);
////quiz32
//		int x1=10;
//		int y1=100;
//		while(x1<=y1) {
//			y1=y1/x1;
//			System.out.print(y1);
//		}
		//quiz 28///1+3+5+7+9=25
//		 int i=1;
//		    int sum=0;		    
//		    while(i<9){
//		        sum=sum+i;
//		        System.out.print(i);
//		        i=i+2;
//		        System.out.print("+");
//		       }
//		       sum=sum+i;
//		       System.out.print(i+"="+sum);
//quiz 24;;;;;;;;multiplication table of 4
//		int i = 4;
//		int j = 1;
//		while (j <= 10) {
//			System.out.println(i + " * " + j + " = " + i * j);
//			j++;
//		}
//		System.out.println("multiplication table of 4");
////quiz 23
//		int i=0;
//		while(i<10) {
//			if(i==4) {
//				i++;
//				continue;
//			}
//			System.out.print(i);
//			i++;		
//		}
////quiz21
//		int x=0;
//		while(x<10) {
//			System.out.print(x);
//			x++;
//			if(x==4) {
//				break;
//			}
//		}
		//System.out.println("loop finished");
//		System.out.println();
//	//quiz18
//		int count =90;
//		while(count<100) {
//			System.out.print(count);
//			count=count+1;
//		}
//		
//		System.out.println();
//		//quiz 5
//		int i=5, Sum=0;
//		
//		while(i!=0) {
//			Sum=Sum+i;
//			--i;
//		}
//		System.out.println("Sum ="+Sum);
//		
	
	

//	public static void main(String[] args) {
//		int arr[]= {2,45,78,90,80};
//		int j=0;
//		while(j<=4) {
//			System.out.println(arr[j]);
//			j++;
//			
//		}
//		
//		
//		int i1=1;
//		while(i1<=5) {
//			
//			System.out.println("Dallas");
//			i1++;
//			}
		int p1=5;
		while(p1>1) {  //infinite loop p>1 is always positive
			System.out.println("Java");
			break;
		}
		
	}
	
}

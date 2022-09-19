/*
 print:*
 code:
 
public class Pattern {

	public static void main(String[] args) {
		System.out.print("*");
	}

}
*/

/*
 print:*****
 code:
 
public class Pattern {

	public static void main(String[] args) {
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
	}
}
*/

/*
print:*
	  *
	  *
	  *
	  *
code:

public class Pattern {

	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
	}
}
*/


/*print:*****(using loop)
code:

public class Pattern {

	public static void main(String[] args) {
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print("*");
		}
	}
}
*/

/*
//print:*(using loop)
		*
		*
		*
		*
//code:

public class Pattern {

	public static void main(String[] args) {
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("*");
		}
	}
}
*/

/*
//print:*****
		*****
		*****
		*****
		*****
//code:

public class Pattern {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/

/*
//print:*****
 		*   *
 		*   *
 		*   *
 		*****
//code:

public class Pattern {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==0 || i==4 || j==0 || j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
*/

/*
//print:11111
		22222
		33333
		44444
		55555
//code:

public class Pattern {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}
*/

/*
//print:12345
		12345
		12345
		12345
		12345
//code:

public class Pattern {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}
*/

/*
//print:1 2 3 4 5 
		2 3 4 5 6 
		3 4 5 6 7 
		4 5 6 7 8 
		5 6 7 8 9 
//code:

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
				System.out.print(i+j+1 + " ");	
				}
				System.out.println();
			}
	}		
}
*/

/*
//print:*
		**
		***
		****
		*****
//code:

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
				for(int j=0;j<=i;j++) {
						System.out.print("*");
				}
				System.out.println();
			}
	}		
}
*/

/*
//print:1
		12
		123
		1234
		12345
//code:

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
						System.out.print(j);
				}
				System.out.println();
			}
	}		
}
*/

/*
//print:1
		22
		333
		4444
		55555
//code:

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
						System.out.print(i);
				}
				System.out.println();
			}
	}		
}
*/

/*
//print: *
   	    **
   	   ***
   	  ****
   	 *****
//code:

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) 
				{
					for(int k=0;k<(n-1)-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++) 
					{
						System.out.print("*");
					}
					System.out.println();
				}
	}		
}
*/

/*
//print: *
   	    * *
   	   * * *
   	  * * * *
   	 * * * * *
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) 
				{
					for(int k=0;k<(n-1)-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++) 
					{
						System.out.print("*" + " ");
					}
					System.out.println();
				}
	}		
}
*/

/*
//print:    * 
		   * * 
		  *   * 
		 *     * 
		* * * * *  
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) 
				{
					for(int k=0;k<(n-1)-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++) 
					{
						if (j==0 || j==i || i==n-1)
							System.out.print("*"+ " ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
	}		
}
*/

/*
//print: 1 2 3 4 5 
		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1  
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) 
				{
					
					for(int j=0;j<n-i;j++) 
					{
						
							System.out.print(j+1 + " ");
						
					}
					System.out.println();
				}
	}		
}
*/

/*
//print:1 2 3 4 5 
		2     3 
		3   4 
		4 5 
		5  
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
				{
					int count=i;
					for(int j=1;j<=(n-i)+1;j++) 
					{
						if (i==1 || j==1 || j==(n-i)+1)
							System.out.print(count++ + " ");
						else 
							System.out.print("  ");
					}
					System.out.println();
				}
	}		
}
*/

/*
//print:*
		***
		*****
		*******
		********* 
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
				{
					
					for(int j=1;j<=(2*i)-1;j++) 
					{
						System.out.print("*");
					}
					System.out.println();
				}
	}		
}
*/

/*
//print:1
		123
		12345
		1234567
		123456789
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
				{
					
					for(int j=1;j<=(2*i)-1;j++) 
					{
						System.out.print(j);
					}
					System.out.println();
				}
	}		
}
*/

/*
//print:1 
		1 2 1 
		1 2 3 2 1 
		1 2 3 4 3 2 1 
		1 2 3 4 5 4 3 2 1
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
			{
				int count=1;
				for(int j=1;j<=(2*i)-1;j++) 
					{
						if(j<i)
							System.out.print(count++ +" ");
						else
							System.out.print(count-- + " ");
					
					}
					System.out.println();
				}
	}		
}
*/

/*
//print:       1 
		     1 2 1 
		   1 2 3 2 1 
		 1 2 3 4 3 2 1 
		1 2 3 4 5 4 3 2 1
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
			{    
			int count=1;
			for (int k=1;k<=n-i;k++)
					System.out.print("  ");
				
				for(int j=1;j<=(2*i)-1;j++) 
					{
						if(j<i)
							System.out.print(count++ +" ");
						else
							System.out.print(count-- + " ");
					
					}
					System.out.println();
				}
	}		
}
*/

/*
//print:111112
		322222
		333334
		544444
		555556
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
			{   
				if (i%2==0)//i=even
					System.out.print(i+1);
				for (int j=1;j<=n;j++)
					System.out.print(i);
				if(i%2!=0)//i=odd
					System.out.print(i+1);
					System.out.println();
				}
	}		
}
*/

/*
//print:1
		22
		333
		4444
		55555
		4444
		333
		22
		1
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
			{   
				for (int j=1;j<=i;j++)
					System.out.print(i);
					System.out.println();
			}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(n-i);
				System.out.println();
		}
	}		
}
*/

/*
//print:1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++)
				System.out.print(count++ + " ");
				System.out.println();
		}
	}		
}
*/

/*
//print:1 
		3 2 
		6 5 4 
		10 9 8 7 
		15 14 13 12 11 
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int count=i*(i+1)/2;
			for(int j=1;j<=i;j++)
				System.out.print(count-- + " ");			
			System.out.println();
		}
	}		
}
*/

/*
//print:1
		3*2
		6*5*4
		10*9*8*7
		15*14*13*12*11 
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int count=i*(i+1)/2;
			for(int j=1;j<=i;j++) {
				System.out.print(count--);
			if(j<=i-1)
				System.out.print("*");
			}
			System.out.println();
		}
	}		
}
*/

/*
//print:A 
		B B 
		C C C 
		D D D D 
		E E E E E 
 
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch +" ");
			}
			ch++;
			System.out.println();
		}
	}		
}
*/

/*
//print:A 
		A B 
		A B C 
		A B C D 
		A B C D E
 
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}		
}
*/

/*
//print:A 
		B C 
		D E F 
		G H I J 
		K L M N O
 
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}		
}
*/

/*
//print:A 
		C B 
		D E F 
		J I H G 
		K L M N O
 
//code:
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				char chRev=(char)(ch+i-1);
				for(int j=1;j<=i;j++)
				{
					System.out.print(chRev-- + " ");
					ch++;
				}
				System.out.println();
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();
			}
		}
	}		
}
*/
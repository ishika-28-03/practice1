import java.util.Scanner;

/* number pyaramid
import java.util.*;
public class practice
{
     public static void main(String[] args) {
        int i,j;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
//hollow square

import java.util.Scanner;

public class practice {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if(i==0|| j==0|| i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
half number pyaramid
import java.util.Scanner;

public class practice{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

public class practice{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }System.out.println();
        }
    }
}
import java.util.Scanner;
public class practice{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

    }
}
import java.util.*;

public class practice {
	public static void printPattern(int n)
	{
		int i, j;
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 2; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
    	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}

import java.util.Scanner;
public class practice 
{    public static void main(String args[])
    {
            int i,j;
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(i=1;i<=n;i++){
                for(j=1;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            } 
    }
}
public class practice 
{    public static void main(String args[])
    {
            int i,j;
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for (i = 1; i <= n; i++)
            {
                    for (j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
public class practice 
{    public static void main(String args[])
    {
            int i,j;
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(i=0;i<=n;i++){
                for(j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(i=n-1;i>=1;i--){
                for(j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    
    
    }
}
//pascal's triangle
public class practice 
{    public static void main(String args[])
    {
            int i,j;
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(i=1;i<=n;i++){
                for(j=0;j<=n-i;j++){
                    System.out.print(" ");
                }
                int x=1;
                for(int k=1;k<=i;k++){
                    System.out.print(x+" ");
                    x=x*(i-k)/k;
                }
            System.out.println();

            }
    }
}*/


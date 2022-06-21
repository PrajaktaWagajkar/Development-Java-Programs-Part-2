//Accept N numbers from user and display all such elements which are even and divisible by 5

import java.util.*;

class Program3
{
	public static void main(String str[])
	{
	   Scanner sobj = new Scanner(System.in);
	   int iSize = 0;
	   int iCnt = 0;

	   System.out.println("Enter number of elements");
	   iSize = sobj.nextInt();
       
       int Arr[] = new int[iSize];

       System.out.println("Enter elements");
       for(iCnt = 0; iCnt < Arr.length; iCnt++)
       {
          Arr[iCnt] = sobj.nextInt();
       }

       Prajakta pobj = new Prajakta();
       pobj.Display(Arr);
       
	}
}

class Prajakta
{
	public void Display(int Arr[])
	{
	    int iCnt = 0;

	    for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	       if(Arr[iCnt] % 2 == 0 && Arr[iCnt] % 5 == 0)
	       {
	           System.out.println(Arr[iCnt]);
	       }
	    }
	}
}
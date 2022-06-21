/*Write a Java program which accept N number from user and return the count of even numbers.*/

import java.util.*;

class Program6
{
	public static void main(String str[])
	{
	    Scanner sobj = new Scanner(System.in);
	    int iSize = 0; 
	    int iCnt = 0;
	    int iRet = 0;

	    System.out.println("Enter number of elements");
	    iSize = sobj.nextInt();

	    int Arr[] = new int[iSize];

	    System.out.println("Enter elements");
	    for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	       Arr[iCnt] = sobj.nextInt();
	    }

	    Prajakta pobj = new Prajakta();
	    iRet = pobj.CountEven(Arr);

	    System.out.println("Number of even numbers are "+iRet);
	}
}
class Prajakta
{
	public int CountEven(int Arr[])
	{
	   int iCnt = 0;
	   int iCount = 0;

	   for(iCnt = 0; iCnt < Arr.length; iCnt++)
	   {
	       if(Arr[iCnt] % 2 == 0)
	       {
	          iCount++;
	       }
	   }

	   return iCount;
	}
}
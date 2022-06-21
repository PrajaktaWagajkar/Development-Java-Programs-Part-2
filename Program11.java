/*Write a Java program which accept number from user and return difference between summantion of even and summation of odd digits.*/

import java.util.*;

class Program11
{
	public static void main(String str[])
	{
	    Scanner sobj = new Scanner(System.in);
	    int iValue = 0;
	    int iRet = 0;

	    System.out.println("Enter number");
	    iValue = sobj.nextInt();

	    Prajakta pobj = new Prajakta();
	    iRet = pobj.SumDiff(iValue);

	    System.out.println("Difference is :"+iRet);

	}
}
class Prajakta
{
	public int SumDiff(int iNo)
	{
	   int iDigit = 0;
	   int iSumEven = 0;
	   int iSumOdd = 0;
	   int iDiff = 0;

	   while(iNo != 0)
	   {
	      iDigit = iNo % 10;
	      if(iDigit % 2 == 0)
	      {
	         iSumEven = iSumEven + iDigit;
	      }
	      else
	      {
	         iSumOdd = iSumOdd + iDigit;
	      }

	      iDiff = iSumEven + iSumOdd;
	      
	   }
        return iDiff;
	}
}
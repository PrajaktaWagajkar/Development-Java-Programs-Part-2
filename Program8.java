/* Write a program which accept number from user and return the count of odd digits.*/

import java.util.*;

class Program8
{
	public static void main(String str[])
	{
	    Scanner sobj = new Scanner(System.in);
	    int iValue = 0,iRet = 0;

	    System.out.println("Enter number");
	    iValue = sobj.nextInt();

	    Prajakta pobj = new Prajakta();
	    iRet = pobj.CountOdd(iValue);

	    System.out.println("Number of odd digits are :"+iRet);

	}
}
class Prajakta
{
	public int CountOdd(int iNo)
	{
	   int iCnt = 0;
	   int iCount = 0;
	   int iDigit = 0;

	   while(iNo != 0)
	   {
	      iDigit = iNo % 10;

	      if(iDigit % 2 != 0)
	      {
	         iCount++;
	      }
	      iNo = iNo /10;
	   }

	   return iCount;
	}
}
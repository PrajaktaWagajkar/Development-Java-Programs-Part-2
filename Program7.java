/* Write a java program which accept number from user and return the count of even digits. */

import java.util.*;

class Program7
{
	public static void main(String str[])
	{
	  
	   Scanner sobj = new Scanner(System.in);
	   int iValue= 0;
	   int iRet = 0;

	   System.out.println("Enter number");
	   iValue = sobj.nextInt();

       Prajakta pobj = new Prajakta();
       iRet = pobj.CountEven(iValue);

       System.out.println("Number of even digits are :"+iRet);
	}
}
class Prajakta
{
	public int CountEven(int iNo)
	{
	   int iCnt = 0;
	   int iDigit = 0;
	   int iCount = 0;

	   while(iNo != 0)
	   {
	      iDigit = iNo % 10;

	      if(iDigit % 2 == 0)
	      {
	         iCount++;
	      }

	      iNo = iNo /10;
	   }

	   return iCount;
	}
}
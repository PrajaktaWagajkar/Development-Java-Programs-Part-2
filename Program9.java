/*Write a program which accept number from user and return the count of digits in between 3 and 7.*/

import java.util.*;

class Program9
{
	public static void main(String str[])
	{
	    Scanner sobj = new Scanner(System.in);
	    int iValue = 0;
	    int iRet = 0;

	    System.out.println("Enter number");
	    iValue = sobj.nextInt();

	    Prajakta pobj = new Prajakta();
	    iRet = pobj.CountRange(iValue);

	    System.out.println("Number of digits are :"+iRet);

	}
}
class Prajakta
{
	public int CountRange(int iNo)
	{
	   int iCnt = 0;
	   int iDigit = 0;
	   int iCount = 0;

	   while(iNo != 0)
	   {
	      iDigit = iNo % 10;
	      if(iDigit > 3 && iDigit < 7)
	      {
	         iCount++;
	      }
	      iNo = iNo / 10;
	   }

	   return iCount;
	}
}
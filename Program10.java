/* Write a program which accept number from user and return multiplication of all digits.*/

import java.util.*;

class Program10
{
	public static void main(String str[])
	{
	   Scanner sobj = new Scanner(System.in);
	   int iValue = 0;
	   int iRet = 0;

	   System.out.println("Enter number");
	   iValue = sobj.nextInt();

	   Prajakta pobj = new Prajakta();
	   iRet = pobj.Mult(iValue);

	   System.out.println("multiplication is :"+iRet);

	}
}
class Prajakta
{
	public int Mult(int iNo)
	{
	   int iMult = 1;
	   int iDigit = 0;

	   while(iNo != 0)
	   {
	      iDigit = iNo % 10;

	      iMult = iMult * iDigit;

	      iNo = iNo /10;
	   }
	   return iMult;
	}
}
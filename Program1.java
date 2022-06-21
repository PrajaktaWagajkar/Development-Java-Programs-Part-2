// Accept N numbers from user and return difference between summation of even elements and odd elements

import java.util.*;

class Program1
{
	public static void main(String str[])
	{
	   Scanner sobj = new Scanner(System.in);
	   int iSize = 0;
	   int iRet = 0;
	   int iCnt = 0;

	   System.out.println("Enter number of elemnts");
	   iSize = sobj.nextInt();

	   int Arr[] = new int[iSize];

	   System.out.println("Enter elements");
	   for(iCnt = 0; iCnt < Arr.length; iCnt++)
	   {
	      Arr[iCnt] = sobj.nextInt();
	   }

	   ArrayDemo dobj = new ArrayDemo();
	   iRet = dobj.Diff(Arr);

	   System.out.println("Difference is :"+iRet);

	}
}
class ArrayDemo
{
	public int Diff(int Arr[])
	{
	   int iCnt = 0;
	   int iEven = 0;
	   int iOdd = 0;
	   int iDiff = 0;

	   for(iCnt = 0; iCnt < Arr.length; iCnt++)
	   {
	      if(Arr[iCnt] % 2 == 0)
	      {
	         iEven = iEven + Arr[iCnt];
	      }

	      else
	      {
	         iOdd = iOdd + Arr[iCnt];
	      }
	   }

	   iDiff = iEven - iOdd;

	   return iDiff;

	}
}
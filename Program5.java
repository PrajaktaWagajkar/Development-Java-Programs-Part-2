/*Write Java program which accept N numbers from user and display all such elements which are multiples of 11.*/

import java.util.*;

class Program5
{
	public static void main(String str[])
	{
	   Scanner sobj = new Scanner(System.in);
	   int iSize = 0 , iCnt = 0;

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
	      if(Arr[iCnt] % 11 == 0)
	      {
	         System.out.println(Arr[iCnt]);
	      }
	   }
	}
}
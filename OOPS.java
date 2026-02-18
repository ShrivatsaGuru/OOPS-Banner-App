/**
 *This class demonstrates a simple java application that displayed OOPS and also printed it using 
 *String.join() method, making use of delimiter to print a sentence with spaces and OOPS.
 *@author Developer
 *@version 3
 */


class Message
{
	public static void main(String[] args)
	{
		System.out.println(String.join("", "    ***    " , " " , "    ***    "  , " " , "*********  " , " " , "***********"));
		System.out.println(String.join("","   *** ***  " , " " , "  *** ***  "  , " " , "*        * " , " " , "*          "));
		System.out.println(String.join("", " ***   *** " , " " , " ***   *** "  , " " , "*         *" , " " , "*          "));
		System.out.println(String.join("", "***     ***" , " " , "***     ***"  , " " , "*         *" , " " , "*          "));
		System.out.println(String.join("", "***     ***" , " " , "***     ***"  , " " , "*        * " , " " , "*          "));
		System.out.println(String.join("", "***     ***" , " " , "***     ***"  , " " , "*       *  " , " ", "***********"));
		System.out.println(String.join("", "***     ***" , " " , "***     ***"  , " " , "********   " , " " , "          *"));
		System.out.println(String.join("", "***     ***" , " " , "***     ***"  , " " , "*          " , " " , "          *"));
		System.out.println(String.join("", " ***   *** " , " " , " ***   *** "  , " " , "*          " , " " , "          *" ));
		System.out.println(String.join("", "  *** ***  " , " " , "  *** ***  "  , " " , "*          " , " " , "          *" ));
		System.out.println(String.join("", "    ***    " , " " , "    ***    "  , " " , "*          " , " " , "***********" ));
		System.out.println(String.join(" ", "Hi","My","Name","Is","Shrivatsa"));
		}
}
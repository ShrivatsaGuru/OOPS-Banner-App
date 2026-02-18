/**
 *This class demonstrates a simple java application that displayed OOPS using an array of strings and flower brackets.
 *@author Developer
 *@version 5
 */
class OOPSstar
{
	public static void main(String[] args)
	{
		String [] lines={"    ***    " , " " , "    ***    "  , " " , "*********  " , " " , "       *******","\n"
        ,"  *** ***  " , " " , "  *** ***  "  , " " , "*        * " , " " , "    **   ","\n",
        " ***   *** " , " " , " ***   *** "  , " " , "*         *" , " " , "  ***     ","\n",
        "***     ***" , " " , "***     ***"  , " " , "*         *" , " " , " **          ","\n",
        "***     ***" , " " , "***     ***"  , " " , "*        * " , " " , " *          ","\n",
        "***     ***" , " " , "***     ***"  , " " , "*       *  " , " ", "   *****","\n",
        "***     ***" , " " , "***     ***"  , " " , "********   " , " " , "       **","\n",
        "***     ***" , " " , "***     ***"  , " " , "*          " , " " , "         ***","\n",
        " ***   *** " , " " , " ***   *** "  , " " , "*          " , " " , "            ***","\n",
        "  *** ***  " , " " , "  *** ***  "  , " " , "*          " , " " , "           **","\n",
        "    ***    " , " " , "    ***    "  , " " , "*          " , " " , "***********"};

		for(String s:lines)
		{
			System.out.print(s);
		}
	}
}
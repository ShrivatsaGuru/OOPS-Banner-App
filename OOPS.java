/**
 *This class demonstrates a simple java application that displayed OOPS using an array of strings.
 *@author Developer
 *@version 4
 */
class OOPSstar
{
	public static void main(String[] args)
	{
		String [] lines=new String[11];
		
		lines[0]=String.join("", "    ***    " , " " , "    ***    "  , " " , "*********  " , " " , "       *******");
		lines[1]=String.join("", "  *** ***  " , " " , "  *** ***  "  , " " , "*        * " , " " , "    **   ");
		lines[2]=String.join("", " ***   *** " , " " , " ***   *** "  , " " , "*         *" , " " , "  ***     ");
		lines[3]=String.join("", "***     ***" , " " , "***     ***"  , " " , "*         *" , " " , " **          ");
		lines[4]=String.join("", "***     ***" , " " , "***     ***"  , " " , "*        * " , " " , " *          ");
		lines[5]=String.join("", "***     ***" , " " , "***     ***"  , " " , "*       *  " , " ", "   *****");
		lines[6]=String.join("", "***     ***" , " " , "***     ***"  , " " , "********   " , " " , "       **");
		lines[7]=String.join("", "***     ***" , " " , "***     ***"  , " " , "*          " , " " , "         ***");
		lines[8]=String.join("", " ***   *** " , " " , " ***   *** "  , " " , "*          " , " " , "            ***" );
		lines[9]=String.join("", "  *** ***  " , " " , "  *** ***  "  , " " , "*          " , " " , "           **" );
		lines[10]=String.join("","    ***    " , " " , "    ***    "  , " " , "*          " , " " , "***********" );

		for(String s:lines)
		{
			System.out.println(s);
		}
	}
}
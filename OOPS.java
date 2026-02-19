/**
* This class is a simple java function that prints oops using a differet static method fuction with each letter being printed seperately
* @author Developer
* @version 6.0
**/
class OOPS{
	public static void main(String[] args){
		String letterO[]=PrintLetter.printOLetter();
		String letterP[]=PrintLetter.printPLetter();
		String letterS[]=PrintLetter.printSLetter();
		for(int i=0;i<9;i++){
			System.out.println(letterO[i]+"  "+letterO[i]+"  "+letterP[i]+"  "+letterS[i]);
		}
	}
}
class PrintLetter{
	public static String[] printOLetter(){
		String lines[]={"     ***   ",
						"   **   ** ",
						"  **     **",
						"  **     **",
						"  **     **",
						"  **     **",
						"  **     **",
						"   **   ** ",
						"     ***   "};
		return lines;
	}
	public static String[] printPLetter(){
		String lines[]={"*******",
						"**    *",
						"**    *",
						"**    *",
						"*******",
						"**     ",
						"**     ",
						"**     ",
						"**     "};
		return lines;
	}
	public static String[] printSLetter(){
		String lines[]={"   ***** ",
						" **      ",
						"**       ",
						" **      ",
						"   ***   ",
						"      ** ",
						"       **",
						"      ** ",
						" *****   "};
		return lines;
	}
}
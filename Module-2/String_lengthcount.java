public class String_lengthcount 
{

		public static void main(String[] args) 
		{
			
			String  a ="sdsdgewfhwg42464242";
			
			count(a);
		}
		private static void count(String a)
		{
			char[] ch = a.toCharArray();
			int letter = 0;
			int space = 0;
			int number = 0;
			int other = 0;
			for(int i = 0;i<a.length();i++)
			{
				if(Character.isLetter(ch[i]))
				{
		
					letter++;
				}
				if(Character.isDigit(ch[i]))
				{
					number++;
				}
				if(Character.isSpaceChar(ch[i]))
				{
					space++;
				}
				else
				{
					other++;
				}
			}
			 System.out.println(a);
			   System.out.println("Letter : "+letter);
			   System.out.println("Space : "+space);
			   System.out.println("Number : "+number);
			   System.out.println("Other : "+other);
		}

	}



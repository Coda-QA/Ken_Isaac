package reusables;

public class stringreverse {

	public static void reverse(String stringnew) {
		// TODO Auto-generated method stub

		String[] str=stringnew.split(" ");
		
		String reversedString="";
		for (int i=0;i< str.length;i++)
		{
			String word=str[i];
			String reversedWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reversedWord=reversedWord + word.charAt(j);
				
			}
			reversedString =reversedString + reversedWord +" ";
				
		}
		System.out.println(reversedString);
		
	}
	
	public static void main(String[] args)
	{
		stringreverse obj=new stringreverse();
		obj.reverse("hello");
	}
	

}

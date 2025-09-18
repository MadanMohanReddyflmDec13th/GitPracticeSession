
public Class ReverseCharactersOfEachWordInAString 
{

	public static void main(String[] args) 
	{
		String ip="Lead the life with joy";
		String op="";
		String words[]=ip.split(" ");

		for(int i=0; i<words.length-1; i++)
		{
			String reversedWord="";

	        for( int j=words[i].length()-1; j>=0; j--)
		{
			reversedWord+=words[i].charAt(j);
		}
	
		op=op+reversedWord;

        	if(i!=words.length-1);
        	{
            		op=op+ " ";
		}
		}

	}	

}

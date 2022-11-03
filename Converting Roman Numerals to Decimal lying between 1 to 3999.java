package src;


public class sumoftwoarrays {
	
	static int value(char r)
	{
		if(r=='I')
			return 1;
		if(r=='V')
			return 5;
		if(r=='X')
			return 10;
		if(r=='L')
			return 50;
		if(r=='C')
			return 100;
		if(r=='D') 
			return 500;
		if(r=='M')
			return 1000;
		return -1;
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MCMIV";
		int res=0;
		for(int i=0;i<str.length();i++)
		{ 
			int s1,s2 = 0;
			s1=value(str.charAt(i));
			if(i+1<str.length())
				s2=value(str.charAt(i+1));

			if(s1>=s2)
			{
				res=res+s1; 
			}
			else
			{ 
				res=res+s2-s1;
			    i++;
			}
		}
		System.out.println(res);
	}
}     
   


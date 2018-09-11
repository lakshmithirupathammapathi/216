import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static boolean isIsomorphic(String X,String Y)
	{
		if(X.length()!=Y.length())
		{
			return false;
		}
		Map<Character,Character> map=new HashMap<>();
		Set<Character> set=new HashSet<>();
		for(int i=0;i<X.length();i++)
		{
			char x=X.charAt(i),y=Y.charAt(i);
			if(map.containsKey(x))
			{
				if(map.get(x)!=y)
				return false;
			}
			else
			{
				if(set.contains(y))
				return false;
				map.put(x,y);
				set.add(y);
			}
		}
		return true;
	}
	
			
	public static void main (String[] args) throws java.lang.Exception
	{
String X="aab";
String Y="xxy";
if(isIsomorphic(X,Y))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}

	}
}

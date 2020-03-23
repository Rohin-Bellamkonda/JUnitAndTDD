package com.epam.JUnitAndTDD;

public class DeleteAFromString {
	
	public String deleteA(String str)
	{
		String str3="";
	    if(str.length()<=2)
	    {
	      for(int i=0;i<str.length();i++)
	      {
	        if(str.charAt(i)!='A')
	          str3+=str.charAt(i);
	      }
	      return str3;
	    }
	    else
	    {
	      for(int i=0;i<2;i++)
	      {
	        if(str.charAt(i)!='A')
	          str3+=str.charAt(i);
	      }
	      str3+=str.substring(2);
	      return str3;
	    }
	}

}

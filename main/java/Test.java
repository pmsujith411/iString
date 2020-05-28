package main.java;

public class Test 
{
	public static void main(String[] args)
	{
		IString iString1 = new IString();
		iString1.inverseString("abcdefg");
		
		IString iString2 = new IString();
		iString2.inverseString("axcxexg");
		
		System.out.println(iString1.equals(iString2));
	}

}

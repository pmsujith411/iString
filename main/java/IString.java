package main.java;

public class IString 
{
	private String reverse;
	
	public void inverseString(String input)
	{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(input);
		stringBuilder  = stringBuilder.reverse();
		reverse = stringBuilder.toString();
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reverse == null) ? 0 : reverse.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IString other = (IString) obj;
		if (reverse == null) {
			if (other.reverse != null)
				return false;
		} 
		else 
		{
			if(reverse.length()!=other.reverse.length())
				return false;
			
			int i;
			
			for(i=0;i<reverse.length();i+=2)
			{
				if(reverse.charAt(i)!=other.reverse.charAt(i))
					break;
			}
			
			if(i >= reverse.length())
				return true;
		}
		
		return false;
	}
}

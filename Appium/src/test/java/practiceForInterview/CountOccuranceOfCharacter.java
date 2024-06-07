package practiceForInterview;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CountOccuranceOfCharacter {

	@Test
	public void countOccurranceOfCharacter()
	{
		String s= "Testyantra";
		s = s.toLowerCase();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			if(hmap.containsKey(s.charAt(i)))
			{
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
			}
			else
			{
				hmap.put(s.charAt(i), 1);
			}
		}
		
		for(Entry<Character, Integer> emap:hmap.entrySet())
		{
			if(emap.getValue()>=1)
			{
				System.out.print(emap.getKey()+""+emap.getValue());
			}
		}

	
	}
}

import java.util.ArrayList;
import java.util.HashMap;

public class test2
{
	public static void main(String[] args)
	{
		boolean test = test("abba", "dog cat cat dog");
		System.out.println(test);
	}
	public static boolean test(String pattern, String s) {
		String[] str= s.split(" ");
		if(pattern.length()!=str.length)
			return false;
		HashMap<Character, String> map = new HashMap<>();
		for(int i=0;i<pattern.length();i++) {
			char key=pattern.charAt(i);//a   b
			if(map.containsKey(key) && !map.get(key).equals(str[i])){
					return false;	
			}else{
				map.put(key, str[i]); //a-> dog    b->cat
			}
			
		}
		return true;
	}
	
}

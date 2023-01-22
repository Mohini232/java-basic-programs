package computerDB;

import java.util.ArrayList;

public class Array {
	
	public static void main(String []args)
	{
	
	ArrayList<String> a= new ArrayList();
	a.add("Hello");
	a.add("This");
	a.add("is");
	a.add("new");
	a.add("World");
	System.out.println(a.size());
	
    int largeStr=a.size();
	for(String m:a)
	{
		if(m.length()>=largeStr)
		{
			System.out.println(m.toUpperCase());
		}
	}
}
}

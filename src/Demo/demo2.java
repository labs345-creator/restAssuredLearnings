package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class demo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('a');
		al.add(true);
		al.add("hello world");
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.remove(1); //index
		//al.remove(("welcome"); //object
		System.out.println(al);
		
		//add()
		al.add(2, "python");
		System.out.println(al);
		
		//retrieve specific element
		System.out.println(al.get(3));
		al.set(2, "c#");
		System.out.println(al);
		
		//search
		System.out.println(al.contains("c#"));
		System.out.println(al.contains("java"));
		
		//isEmpty
		System.out.println(al.isEmpty());
		
		
		//reading data
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) +" ");
		}
		
		
		for(Object o : al) {
			System.out.print(o + " ");
		}
		
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

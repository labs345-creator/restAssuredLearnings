package Demo;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("c");
		al.add("b");
		
		ArrayList al_dup = new ArrayList<>();
		
		al_dup.addAll(al);
		
		System.out.print(al_dup +" ");
		System.out.println();
		al_dup.removeAll(al);
		System.out.print(al_dup +" ");
		
		//sort list
		Collections.sort(al);
		System.out.println();
		System.out.print(al +" ");
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println();
		System.out.print(al +" ");
		
		//shuffling
		Collections.shuffle(al);
		System.out.println();
		System.out.print(al +" ");
		Collections.sort(null, null);
		

	}

}

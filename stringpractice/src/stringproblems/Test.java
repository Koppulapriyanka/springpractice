package stringproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test implements Comparator<Test>{
	
	public void display(Object obj){
		System.out.println("Object method");
	}

	public void display(String str){
		System.out.println("String method");
	}
	
	public void strTst(String str){
		str = "summer";
	}
	
	public void arrTst(String[] s){
		s[1] = "Changed";
	}
	
	public void entryTst(Entry<Integer, String> e){
		e.setKey(2);
	}
	
	public static void main(String[] args){
		Test t = new Test();
		t.display(null);
		List<Entry<Integer, String>> l = new ArrayList<Entry<Integer, String>>();
		l.add(new Entry<Integer, String>(1, "Priya"));
		l.add(new Entry<Integer, String>(2, "Venky"));
		l.add(new Entry<Integer, String>(3, "Raju"));
		l.add(new Entry<Integer, String>(4, "Navi"));
		l.add(new Entry<Integer, String>(5, "Barath"));
		l.add(new Entry<Integer, String>(7, "Jayadeep"));
		l.add(new Entry<Integer, String>(8, "Harshi"));
		int count = 1;
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);num.add(2);num.add(3);num.add(4);num.add(5);num.add(6);
		Iterator itr =num.iterator();
		java.util.LinkedList<Integer> ll = new java.util.LinkedList<Integer>();
		while(itr.hasNext()){
			if((Integer)itr.next()%2 == 0)
				itr.remove();
		}
		System.out.println(num);
		for(Entry<Integer, String> e: l){
			System.out.println(e);
			count++;
		}
		
		System.out.println(l);
		
		AbstractTest at = new Subclass();
		at.display();
		String str = "winter";
		t.strTst(str);
		System.out.println(str);
		String[] a = new String[2];
		a[0] = "first";
		a[1] = "second";
		t.arrTst(a);
		System.out.println(a[0]+" "+a[1]);
		Entry<Integer,String> entry = new Entry<Integer,String>(1, "first");
		t.entryTst(entry);
		System.out.println(entry.getKey());
				
	}

	@Override
	public int compare(Test o1, Test o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

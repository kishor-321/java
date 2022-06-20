package basicOfJavas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Books {
	int nos;
	String s1;
	public Books (int nos, String s1 ) {
		this.nos=nos;
		this.s1=s1;
	}
}
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> m1 = new ArrayList<String>();
		ArrayList D2 =new ArrayList();
		D2.add("Callig mo1 index");
		System.out.println("call list from array is: "+D2.size());
		D2.add("Index is 2 ");
		D2.add(2, "Index 3");
		D2.add(3, "Index4");
		D2.set(1, "Index");
		System.out.println("Call all index is: "+D2.size());
		for (int i = 0; i<D2.size(); i++ ) {
			System.out.println("call get all index is: "+D2.get(i));
		}
		D2.add("CAll last ");
		System.out.println("CAll all indexs list is  :"+D2.get(4));
		System.out.println("call all indexexs is : "+D2.size());
		for ( Object Ob : D2) {
			System.out.println("For each loop :"+ Ob);
		}
		m1.add("A String List index 1");
		m1.add("B String list index 2");
		m1.add("C String list index 3");
		for ( Object PL : m1) {
			System.out.println(PL);
		}
		System.out.println("CAll the String index is : "+m1.size());
		D2.addAll(m1);
		System.out.println(D2);
		D2.removeAll(m1);
		System.out.println(D2);
		D2.clone();
		System.out.println("CAll Clone is :"+m1.clone());
		Collections.sort(m1);
		System.out.println("CAlling sort size is "+m1.size());
		System.out.println("Calling list :"+m1);
		Collections.reverse(m1);
		System.out.println(m1);
		List REversenme = new ArrayList();
		REversenme.add("hello");
		REversenme.add("JAva");
		System.out.println(REversenme);
		Collections.reverse(REversenme);
		System.out.println(REversenme);
		REversenme.clear();
		System.out.println(REversenme);
		D2.retainAll(m1);
		System.out.println(D2);// because nothing is common beween them
		Iterator Irt = D2.iterator();
		System.out.println(Irt.hasNext());



		List <Books > Bk = new ArrayList<Books>();
		Books List1 =new Books(5,"String Objects ");
		Books List2 = new Books (9, "String Obj1");
		Bk.add(List1);
		Bk.add(List2);
		//			System.out.println(List1);
		for ( Books IK : Bk) {
			System.out.println(IK.s1+" "+IK.nos);
		}
		Queue<Integer> Numbers = new PriorityQueue();
		System.out.println(Numbers);
		Numbers.add(12);
		Numbers.add(13);
		Numbers.add(14);
		Numbers.add(15);
		System.out.println(Numbers);
		for (Object Nos :Numbers) {
			System.out.println(Nos);
		}
		Iterator Nos1 =Numbers.iterator();
		while (Nos1.hasNext()) {
			System.out.println(Nos1.next());
		}
		System.out.println(Numbers.isEmpty());
		System.out.println(Numbers.peek());
		System.out.println(Numbers);
		System.out.println(Numbers.poll());
		System.out.println(Numbers);
		System.out.println(Numbers.peek());
		System.out.println(Numbers);
		System.out.println(Numbers.remove());
		System.out.println(Numbers);
		System.out.println(Numbers);

		
		
		
		
	}
}

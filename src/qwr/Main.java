package qwr;

import java.util.Stack;

public class Main {
	public  static boolean  prnq(String s){System.out.println(s); return true;}
	public  static boolean  prnt(String s){System.out.print(s); return true;}
	public  static boolean  prne(String s){System.err.println(s); return true;}

    public static void main(String[] args) {
//	    Stek st = new Stek(5);
//	    st.push(1);
//	    st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
////        st.push(6);
//        System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
////		System.out.println(st.pop());
//		System.out.println(st.getLastIndex());
////		Stack
		SetofStacks<Integer> q = new SetofStacks<>(3);
		q.push(11);
		q.push(12);
		q.push(13);
		q.push(14);
		q.push(15);
		q.push(16);
		q.push(17);
		q.push(18);
		q.pop();
		q.pop();
		q.pop();
		q.print();
		prnq("~"+q.peek());
		prnq("?"+q.search(12));
		q.pop();
		q.pop();
		q.pop();
		q.pop();
		q.pop();
//		q.pop();
    }
}//class Main

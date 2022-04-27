package qwr;

import java.util.EmptyStackException;

public class Stek {
	private int[] arr;
	private int size;
	private int lastIndex;

	public Stek(int size) {
		this.size = size;
		arr = new int[size];
		lastIndex=-1;
	}
	public void push(int value) throws IndexOutOfBoundsException {
		lastIndex++;
		if (lastIndex>arr.length){
			throw new IndexOutOfBoundsException();
		}
		arr[lastIndex]=value;
	}
	public int pop() throws IndexOutOfBoundsException {
		if (lastIndex<0){
			throw new IndexOutOfBoundsException();
		}
		return arr[lastIndex--];
	}

	public int getLastIndex() { return lastIndex; }
//----------------------------------------
	public int peek() {
		if (lastIndex < 0) throw new EmptyStackException();
		return arr[lastIndex];
	}

	public boolean empty() {
		return lastIndex < 0;
	}

	public int search(int x) {
		for (int i = 0; i < arr.length; i++)  if (arr[i] ==x) return i;
		return -1;
	}

}//class Stek

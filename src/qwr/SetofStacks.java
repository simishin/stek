package qwr;
/*
    Как известно, слишком высокая стопка тарелок может развалиться.
    Следовательно, в реальной жизни, когда высота стопки превысила бы
    некоторое пороговое значение, мы начали бы складывать тарелки в
    новую стопку. Реализуйте структуру данных SetofStacks,
    имитирующую реальную ситуацию. Структура SetofStacks должна состоять
    из нескольких стеков, новый стек создается, как только предыдущий
    достигнет порогового значения. Методы SetofStacks.push() и
    SetofStacks.pop() должны вести себя так же, как при работе с
    одним стеком (то есть метод pop() должен возвращать те же значения,
    которые бы он возвращал при использовании одного большого стека).
    Реализуйте функцию popAt(int index), которая осуществляет операцию
    pop c заданным внутренним стеком.
 */

import java.util.EmptyStackException;
import java.util.LinkedList;

import static qwr.Main.prnq;
import static qwr.Main.prnt;

public class SetofStacks <E> {
	private int size;
	private int lastIndex;
	LinkedList<E[]> ul = new LinkedList<E[]>();

	public SetofStacks(int size) {
		this.size = size;
		lastIndex=0;
	}
	public void push(E value) throws IndexOutOfBoundsException {
		int j = lastIndex % size;
		if (j == 0) ul.add((E[]) new Object[size]);
		int k = (int) lastIndex / size;
		assert prnq(">> "+ul.size()+"  "+lastIndex+"^ j "+j+"\tk "+k+"\tv "+value);
		ul.get(k)[j]=value;
		lastIndex++;
	}//push
	public E pop() throws IndexOutOfBoundsException {
		if (lastIndex==0) throw new EmptyStackException();
		lastIndex--;
		int j = lastIndex % size;
		int k = (int) lastIndex / size;
		E z = ul.get(k)[j];
		if (j == 0) ul.remove(k);
		assert prnq("<< "+ul.size()+"  "+lastIndex+"^ j "+j+"\tk "+k+"\tv "+z);
		return z;
	}//pop
	public int getLastIndex() { return lastIndex; }
	public E peek() {
		return ul.get((int) lastIndex / size)[lastIndex % size];
	}//peek
	public boolean empty() {
		return lastIndex < 1;
	}
	public int search(E x) {
		for (int i = 0; i < lastIndex; i++)
			if (ul.get((int) i / size)[i % size].equals(x)) return i;
		return -1;
	}//search
	public void print(){
		int j,k;
		for (int i = 0; i <= lastIndex; i++){
			j = i % size;
			k = (int) i / size;
			prnq(i+" ("+k+" "+j+" )\t "+ul.get(k)[j]);
		}
	}//print
	public void printEl(){
		prnt(lastIndex+" ("+(int) lastIndex / size+" "+lastIndex % size+" )\t ");
	}
}//SetofStacks


public class ArrayBoundedDeque <T> implements BoundedDeque{

	// Implement a Java class called ArrayBoundedDeque that implements your BoundedDeque interface using an
	// array based implementation. The constructor to your class should accept one integer parameter to be used 
	// as the capacity of the deque
	
	private T[] arrayDeque;
	private static int capacity = 50;
	private int front = 0;
	private int back = 0;
	private int size = 0;
	private T element;
	
	public ArrayBoundedDeque(int capacity){
		if (capacity <= 0 ){
			throw new IllegalArgumentException("Invalid Capacity!");
		}
		arrayDeque = (T[]) new Object[capacity];
	}
	
	@Override
	public void addFront(Object x){ // throws FullDequeException{
	//	if (size == arrayDeque.length){
	//		throw new FullDequeException();
	//	}
	//	if (isEmpty()){
	//		arrayDeque[front] = element;
	//	}
	//	else{
	//		front = (front - 1 + arrayDeque.length)  % arrayDeque.length;
	//		arrayDeque[front] = element;
	//	}
		size++;
	}

	@Override
	public void addBack(Object x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object removeFront() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFull() {
		if (size == capacity){
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0){
		return true;
		}
		return false;
	}
	
}

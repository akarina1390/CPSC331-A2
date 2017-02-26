import java.math.BigInteger;

/**
 * The Deque interface represents the deque ADT as described
 * CPSC 331.
 * Assignment 2
 * @author  Ana Carrocci
 * @version 1.0
 */

public interface BoundedDeque <T>{
	
	public void addFront(T x);
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * 	b) The deque is not full
	 * Postcondition:
	 * 	a) The object x is added at the front of the queue (which otherwise unchanged)
	 * @exception: A FullDequeException if the deque is full when the method is called
	 */
	
	public void addBack(T x);
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * 	b) The deque is not full
	 * Postcondition:
	 * 	a) The object x is added at the back of the queue (which otherwise unchanged)
	 * @exception: A FullDequeException if the deque is full when the method is called
	 */
	
	public T removeFront();
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * 	b) The deque is not empty
	 * Postcondition:
	 *  a) Value returned is the object at the front of the deque
	 *  b) This front element has been removed from the deque
	 *  
	 * @return: new object without the first element
	 * @exception: A EmptyDequeException if the deque is empty when the method is called
	 */
	
	public T removeBack();
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * 	b) The deque is not empty
	 * Postcondition:
	 *  a) Value returned is the object at the back of the deque
	 *  b) This back element has been removed from the deque
	 *  
	 * @return: new object without the last element
	 * @exception: A EmptyDequeException if the deque is empty when the method is called
	 */
	
	public T getFront();
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * 	b) The deque is not empty
	 * Postcondition:
	 *  a) Value returned is the object at the front of the deque
	 *  b) This deque has not been changed
	 *  
	 * @return: new object without the first element
	 * @exception: A EmptyDequeException if the deque is empty when the method is called
	 */
	
	public T getBack();
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * 	b) The deque is not empty
	 * Postcondition:
	 *  a) Value returned is the object at the back of the deque
	 *  b) This back element has been removed from the deque
	 *  
	 * @return: new object without the last element
	 * @exception: A EmptyDequeException if the deque is empty when the method is called
	 */
	
	public boolean isFull();
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * Postcondition:
	 *  a) The deque has not been changed
	 *  b) The value returned is true if the deque is full and false otherwise
	 *  
	 * @return: true if the deque is full
	 */
	
	public boolean isEmpty();
	/**
	 * Precondition:
	 * 	a) Interface invariant
	 * Postcondition:
	 *  a) The deque has not been changed
	 *  b) The value returned is true if the deque is empty and false otherwise
	 *  
	 * @return: true if the deque is empty
	 */
}

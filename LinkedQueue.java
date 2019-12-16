/**
 * Queue - Exercise 1
 * @author srakibul99
 * 2/12/19
 *
 * @param <T>
 */
public final class LinkedQueue<T> implements QueueInterface<T> {
	
	private Node firstNode; // References node at front of queue
	private Node lastNode; // References node at back of queue
	
	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
	} // end default constructor
	
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if(isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);
		lastNode = newNode;
	} // end enqueue
	
	public T dequeue() {
		T front = getFront(); // May throw EmptyQueueException
		assert firstNode != null;
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();
		if(firstNode == null)
			lastNode = null;
		return front;
	} // end dequeue
	
	public T getFront() {
		if(isEmpty())
			throw new EmptyQueueException();
		else
			return firstNode.getData();
	} // end getFront
	
	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	} // end isEmpty
	
	public void clear() {
		firstNode = null;
		lastNode = null;
	} // end clear
	
	public class Node {
		private T data; // Entry in List
		private Node next; // Link to next node
		
		private Node(T dataPortion)
		{
			this(dataPortion, null);
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
		} // end constructors
		
		private T getData()
		{
			return data;
		} // end getData
		
		private void setData(T newData)
		{
			data = newData;
		} // end setData
		
		private Node getNextNode()
		{
			return next;
		} // end getNextNode
		
		private void setNextNode(Node nextNode)
		{
			next = nextNode;
		} // end setNextNode
	} // end Node
} // end LinkedQueue

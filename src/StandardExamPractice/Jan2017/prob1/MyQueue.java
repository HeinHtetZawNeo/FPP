package StandardExamPractice.Jan2017.prob1;

public class MyQueue {
	private int[] arr;
	private int front;
	private int rear;

	public MyQueue() {
		arr = new int[10];
		front = -1;
		rear = 0;
	}

	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	public int size() {
		return rear - front - 1;
	}

	public void enqueue(int t) {
		// over arr size
		if (rear > arr.length - 1) {
			int[] temp = new int[arr.length + 1];

			for (int i = 0; i < arr.length; i++)
				temp[i] = arr[i];

			arr = temp;
		}

		arr[this.rear] = t;
		this.rear++;
	}

	public int dequeue() throws Exception {
		if (size() == 0)
			throw new Exception("Out of queue space cant dequeue");
		front++;
		return arr[front];
	}

	public int peek() throws Exception {
		if (size() == 0)
			throw new Exception("Nothing to peek");
		return arr[front + 1];
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		for(int i=0;i<=20;i++)
			myQueue.enqueue(i);

		System.out.println("Before peek size :"+myQueue.size());
		
		try {
			System.out.println("PEEK : "+myQueue.peek());
			System.out.println("After peek size :"+myQueue.size());
			System.out.println("Dequeue Start Here");
			while (!myQueue.isEmpty()) {
				System.out.println(myQueue.dequeue());
			}
			System.out.println("Dequeue End Here");
			System.out.println("Dequeue Again");
			myQueue.dequeue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Message from the catch");
			System.out.println(e.getMessage());
		}
		System.out.println("After dequeue all :"+myQueue.size());
		try {
			myQueue.peek();
		}catch (Exception e) {
			System.out.println("Error Message from the catch");
			System.out.println(e.getMessage());
		}
	}
}

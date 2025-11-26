package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		q.offer(2);
		q.offer(2);
		q.add(3);
		q.offer(21);
		q.offer(23);
		q.add(11);
		q.offer(21);
		q.offer(244);
		q.remove(222);

		System.out.println(q);

		q.peek(); // remove the in last

		q.poll();

		System.out.println(q);

		System.out.println(q.peek());

		System.out.println(q.size());

		System.out.println(q.isEmpty());

		System.out.println(q.contains(23));

		Iterator<Integer> it = q.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
}

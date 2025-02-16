package java4_JavaCollections_3_Queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String string1, String string2) {
		return Integer.compare(string2.length(), string1.length());
	}
	
}

public class Ex1_QueueRunner {
	public static void main(String[] args) {
		/* Arrange in the order of processing..
		 * Supports all the collection methods
		 * 	a. add
		 * 	b. offer
		 * 	c. remove
		 * 	d. poll
		 * 	e. peek
		 * 
		 * In PriorityQueue elements are stored in 'Natural SOrted Order'
		 * Custom Comparator is build to change the order
		 */
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Banana","Orange","Apple","Pomegranate","Mango","Kiwi"));
		System.out.println("Priority Queue Created==>"+queue);
		
		queue.offer("Apple1");
		System.out.println("Offer method executed ==>"+queue + " Size:" + queue.size());
		
		System.out.print("\tPrinting using poll method\n\t\t==>");
		int queueLength = queue.size();
		for(int i=0;i<queueLength+1;i++) {
			System.out.print(queue.poll()+", ");
		}
		System.out.println();
		System.out.println("\tPrinted in Natural Sorted Order..!!");
		
		System.out.println("\nChanging the Order of Processing based on element's length >>");
		Queue<String> queue1 = new PriorityQueue<>(new StringLengthComparator());
		queue1.addAll(List.of("Banana","Orange","Apple","Pomegranate","Mango111","Kiwi","Apple11"));
		System.out.println("Priority Queue Created==>"+queue1);
		
		System.out.print("\tPrinting using poll method\n\t\t==>");
		queueLength = queue1.size();
		for(int i=0;i<queueLength+1;i++) {
			System.out.print(queue1.poll()+", ");
		}

	}
}

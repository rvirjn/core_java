package sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListExample {

	public static void main(String[] args) {

		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());

		syncList.add("one");
		syncList.add("two");
		syncList.add("three");

		// when iterating over a synchronized list, we need to synchronize access to the synchronized list
		synchronized (syncList) {
			Iterator<String> iterator = syncList.iterator();
			while (iterator.hasNext()) {
				System.out.println("item: " + iterator.next());
			}
		}

	}

}
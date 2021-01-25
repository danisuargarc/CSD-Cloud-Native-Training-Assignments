import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Test fail-fast & fail-safe iterators within multithreaded environment.
 * Note example of fail fast iterator is Vector, ArrayList, HashSet etc.
 * And fail-safe is ConcurrentHashMap, CopyOnWriteArrayList etc.
 * 
 * What example would you like to see the result to?
 * 
 * Simply change the collection in the method vectorExample();
 * 
 * @author dgarci11
 *
 */
public class Question8 {

	public static void main(String[] args) {
		vectorExample();
	}

	public static void vectorExample() {
		Vector<Integer> collection = new Vector<>();

		for (int x = 1; x < 6; x++) {
			collection.add(x);
		}

		System.out.println(collection);

		Iterator<Integer> iterator = collection.iterator();

		Thread t1 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 2) {
					collection.remove(2);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 4) {
					collection.remove(4);
				}
			}
		});

		t1.start();
		t2.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(collection);
	}

	public static void arrayListExample() {
		ArrayList<Integer> collection = new ArrayList<>();

		for (int x = 1; x < 6; x++) {
			collection.add(x);
		}

		System.out.println(collection);

		Iterator<Integer> iterator = collection.iterator();

		Thread t1 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 2) {
					collection.remove(2);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 4) {
					collection.remove(4);
				}
			}
		});

		t1.start();
		t2.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(collection);
	}

	public static void hashSetExample() {
		HashSet<Integer> collection = new HashSet<>();

		for (int x = 1; x < 6; x++) {
			collection.add(x);
		}

		System.out.println(collection);

		Iterator<Integer> iterator = collection.iterator();

		Thread t1 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 2) {
					collection.remove(2);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 4) {
					collection.remove(4);
				}
			}
		});

		t1.start();
		t2.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(collection);
	}

	public static void concurrentHashMapExample() {
		ConcurrentHashMap<Integer, Integer> collection = new ConcurrentHashMap<>();

		for (int x = 1; x < 6; x++) {
			collection.put(x, x * 100);
		}

		System.out.println(collection);

		Iterator iterator = collection.keySet().iterator();

		Thread t1 = new Thread(() -> {
			while (iterator.hasNext()) {
				for (int x = 6; x < 11; x++) {
					collection.put(x, x * 100);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (iterator.hasNext()) {
				for (int x = 11; x < 16; x++) {
					collection.put(x, x * 100);
				}
			}
		});

		t1.start();
		t2.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(collection);
	}

	public static void copyOnWriteArrayListExample() {
		CopyOnWriteArrayList<Integer> collection = new CopyOnWriteArrayList<>();

		for (int x = 1; x < 6; x++) {
			collection.add(x);
		}

		System.out.println(collection);

		Iterator<Integer> iterator = collection.iterator();

		Thread t1 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 2) {
					collection.remove(2);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (iterator.hasNext()) {
				if (iterator.next() == 4) {
					collection.remove(4);
				}
			}
		});

		t1.start();
		t2.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(collection);
	}

}

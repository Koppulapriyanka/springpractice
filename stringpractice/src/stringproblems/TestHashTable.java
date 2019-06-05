package stringproblems;


public class TestHashTable<K,V> {

	public static void main(String[] args){
		HashTable h = new HashTable(10);
		h.put(new Entry<Integer, String>(1, "Priyanka"));
		h.put(new Entry<Integer, String>(2, "Raju"));
		h.put(new Entry<Integer, String>(3, "Venky"));
		
		System.out.println(h);
		
	}
}

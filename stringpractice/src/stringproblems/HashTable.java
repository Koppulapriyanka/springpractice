package stringproblems;

public class HashTable {
	
	LinkedList[] hashtable ;
	int length;

	public HashTable(int length) {
		super();
		this.length = length;
		hashtable = new LinkedList[10];
	}

	public HashTable(LinkedList[] hashtable,int length) {
		super();
		this.hashtable = hashtable;
		this.length = length;
	}

	public LinkedList[] getHashtable() {
		return hashtable;
	}

	public void setHashtable(LinkedList[] hashtable) {
		this.hashtable = hashtable;
	}
	
	public int getLenth(){
		return this.length;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	
	public int hashCode(Integer key){
		return  key % this.length;
	}
	
	public void put(Entry<Integer,String> entry){
		if(null == hashtable[hashCode(entry.getKey())])
			hashtable[hashCode(entry.getKey())] = new LinkedList();
		hashtable[hashCode(entry.getKey())].append(entry);
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(LinkedList ll: this.hashtable){
			if(null != ll)
				sb.append(ll.toString()).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("}");
		return sb.toString();
	}
}

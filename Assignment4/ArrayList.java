public class ArrayList implements List {

	private Person[] storage;
	private int numElements;
	
	public ArrayList(int size) {
		this.storage = new Person[size];
		this.numElements = 0;
	}
	
	public ArrayList(Person[] array) {
		this.storage = array;
		numElements = array.length;
	}
	
	public void expandAndCopy() {
		Person[] newStorage = new Person[storage.length*2];
		for (int i = 0; i < storage.length; i++) {
			newStorage[i] = storage[i];
		}
		this.storage = newStorage;
	}
	
	public void add(Person p) {
		while (numElements >= storage.length) {
			expandAndCopy();
		}
		storage[numElements++] = p;
	}
		
	public int size() {
		return this.numElements;
	}
			
	public Person get(int index) {
		return storage[index];
	}

	public int find(Person p) {
		int index = -1;
		int cur = 0;
		while (cur < numElements && index == -1) {
			if (storage[cur].equals(p)) {
				index = cur;
			}
			cur++;
		}
		return index;
	}
	
}
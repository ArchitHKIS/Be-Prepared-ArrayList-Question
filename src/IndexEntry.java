import java.util.ArrayList;

class IndexEntry implements Comparable<IndexEntry> {
	private String word;
	private ArrayList<Integer> numsList;

	public IndexEntry(String s) {
		word = s.toUpperCase(); // to uppercase
		numsList = new ArrayList<Integer>(); // arraylist
	}

	public void add(int num) {
		if (numsList.contains(num) == false) // if it doesn't have it
			numsList.add(num); // Add it
	}

	public String getWord() {
		return word;
	}

	public String toString() {
		String s = word + " ";
		for (Integer i : numsList) // for each
			s += i + ", ";
		return s;
	}

	public int compareTo(IndexEntry entry) {
		return word.compareTo(entry.toString()); // compares
	}
}
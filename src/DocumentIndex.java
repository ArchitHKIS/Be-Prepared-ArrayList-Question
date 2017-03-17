import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {
	public DocumentIndex() {
		super(); // Calls default constructor of ArrayList
	}

	public DocumentIndex(int n) {
		super(n);
	}

	public void addWord(String str, int num) {
		boolean found = false; // Set a boolean to false
		IndexEntry gg = new IndexEntry(str); // new index entry
		gg.add(num); // Add a number to the IndexEntry
		for (IndexEntry i : this) // for each
			if (str.toUpperCase().equals(i.getWord())) {
				i.add(num); // adds
				found = true; // found is true since if is executed
			}
		if (found == false && size() > 0){ // word is not found
			if (get(size() - 1).getWord().compareTo(str.toUpperCase()) < 0){ // compares
			
				add(gg); // DocumentIndex adds the IndexEntry
				return; // stops
			}
			for (IndexEntry dd : this) {// for each
			
				if (dd.getWord().compareTo(str.toUpperCase()) > 0){ // sorts
				
					add(indexOf(dd), gg); // adds
					return; // quit
				}
			}
		} else if (found == false) // not found
			add(gg); // adds
	}

	public void addAllWords(String str, int num) {
		String[] s = str.split("\\W+");
		for (String words : s) {
			if (words.length() > 0) {
				this.addWord(words, num);
			}
		}
	}

}
package com.work.tieimplementations;

public class MainTrie {

	public static void main(String[] args) {
		var trie=new TrieWithImp();
		Node child=new Node();
		child.children.put("Sarmad", new Node());
		child.children.put("Rashid", new Node());

		
		Node parent=new Node();
		parent.children.put("Systems", child);
		
		trie.findPhrases(parent, "Systems Rashid");
//		trie.addPhrase(parent, "Limited", 2);
	
	}

}

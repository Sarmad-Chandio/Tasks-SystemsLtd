package com.work.tieimplementations;
import java.util.List;
import java.util.ArrayList;
public class TrieWithImp {
	
	public void addPhrase(Node root, String phrase, int id)
	{
	    // a pointer to traverse the trie without damaging
	    // the original reference
	    Node node = root;

	    // break phrase into words
	    String[] word=phrase.split(" ") ;

	    // start traversal at root
	    for (int i = 0; i < word.length; ++i)
	    {
	        // if the current word does not exist as a child
	        // to current node, add it
	        if(node.children.containsKey(word[i])==false ){
	        	node.children.put(word[i], new Node());
	        }
	        // move traversal pointer to current word
	        node=node.children.get(word[i]);

	        // if current word is the last one, mark it with
	        // phrase Id
	        if (i == word.length - 1)
	            node.id = id;
	        
	    }
	}
	
	public void findPhrases(Node root, String textBody)
	{
	    // a pointer to traverse the trie without damaging
	    // the original reference
	    Node node = root;

	    // a list of found ids
	    List<Integer> foundPhrases = new ArrayList<Integer>();

	    // break text body into words
	    String[] words = textBody.split(" ");

	    // starting traversal at trie root and first
	    // word in text body
	    for (int i = 0; i < words.length;)
	    {
	        // if current node has current word as a child
	        // move both node and words pointer forward
	        if (node.children.containsKey(words[i]))
	        {
	            System.out.println(words[i]);
	            // move trie pointer forward
	            node = node.children.get(words[i]);
	            // move words pointer forward
	            ++i;
	        }
	        else
	        {
	            // current node does not have current
	            // word in its children

	            // if there is a phrase Id, then the previous
	            // sequence of words matched a phrase, add Id to
	            // found list
	            if (node.id != -1)
	                foundPhrases.add(node.id);


	            if (node == root)
	            {
	                // if trie pointer is already at root, increment
	                // words pointer
	                ++i;
	            }
	            else
	            {
	                // if not, leave words pointer at current word
	                // and return trie pointer to root
	                node = root;
	            }
	                
	        }
	    }

	    // one case remains, word pointer as reached the end
	    // and the loop is over but the trie pointer is pointing to
	    // a phrase Id
	    if (node.id != -1)
	        foundPhrases.add(node.id);
	}
	
	

}

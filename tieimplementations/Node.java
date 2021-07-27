package com.work.tieimplementations;
import java.util.HashMap;

public class Node
{
    int id = -1;
    HashMap<String, Node> children = new HashMap<String, Node>();
   

    public Node() {
    	
    }
    
    public Node(int id)
    {
        this.id = id;
    }
}
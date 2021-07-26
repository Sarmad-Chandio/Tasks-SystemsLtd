package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLinkedList {
	
	//Creating Node
	public NodeA root=null;
	public void insertNode(int data){
		NodeA node=new NodeA(data);
		if(root==null)
			{
				root=node;
				return;
			}
		// end of if
		else
			{
			Queue<NodeA> queue=new LinkedList<NodeA>();
				queue.add(root);

				NodeA nod=queue.remove();
				while(true){
					if(nod.left!=null && nod.right!=null)
					{
						queue.add(nod.left);
						queue.add(nod.right);
					}//end of if
					else
					{
						if(nod.left==null)
						{
							nod.left=node;
							queue.add(nod.left);
						}
						else
						{
							nod.right=node;
							queue.add(nod.right);
						}
					   break;
					}// end of else
				}
			}
	}
	// end of insertNode
	public void inorderTravarsal(NodeA node){
		if(root==null)
		{
			return;
		}else{
			if(node.left!=null)
				inorderTravarsal(node.left);
			System.out.print(node.data+" ");
			if(node.right!=null)
				inorderTravarsal(node.right);
		}

	}
	// end of inorderTrav...
	public static void main(String arg[]){
		BinaryTreeUsingLinkedList obj=new BinaryTreeUsingLinkedList();
			obj.insertNode(5);
			System.out.println("binary tree after insertion");
			obj.insertNode(35);
			obj.insertNode(65);
			obj.inorderTravarsal(obj.root);


	}
}
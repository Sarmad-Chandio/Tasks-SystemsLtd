import java.util.Arrays;
import java.util.ArrayList;
public class BubbleSort{
	public static void bubbleSortToArrayList(ArrayList<Integer> myList){
		for(int i=0;i<myList.size();i++){
			for(int j=0;j<(i+1);j++){
				if(myList.get(i)<myList.get(j)){
					//swap 2 elements from list
					myList.set(i,(myList.get(i)+myList.get(j)));
					myList.set(j,(myList.get(i)-myList.get(j)));
					myList.set(i,(myList.get(i)-myList.get(j)));
				}
			}
		}
		System.out.println(myList);
	}
	
	public static void main(String...args){
		
		var myList=new ArrayList<Integer>();
		myList.add(2);
		myList.add(7);
		myList.add(4);
		myList.add(1);
		myList.add(5);
		myList.add(3);
		bubbleSortToArrayList(myList);
	}

}
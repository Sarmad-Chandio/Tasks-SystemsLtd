import java.util.Arrays;
public class Array{
	private int myArray[];
	private int index=0;
	private int count;
	//created constructor, which will decide size of array
	public Array(int length){
		myArray =new int[length];
	}
	public void insert(int item){
		//if the array is full, resize array
		if(myArray.length==count){
			//create new array ,which will increase size of Previous array (twice) of times
			int newArray[]=new int [count*2];
			//copy existing items 
			for(int i=0;i<count;i++){
				newArray[i]=myArray[i];
			}
			//set new items to already created array
			myArray=newArray;
		}
		//adding item to resized index
		myArray[count++]=item; //count++;
		
	}
	public void print(){
		for(int i=0;i<count;i++){
			System.out.println(myArray[i]);
		}
	}
	
	public void removeAt(int index){
		int tempItem=myArray[index];
		if(index<0 || index>=count)
			throw new IllegalArgumentException();
		
		for(int i=index;i<count-1;i++){
			myArray[i]=myArray[i+1];
		}
		System.out.println(tempItem+" is Deleted");
		count--;
	}
	public int indexOf(int item){
		for(int i=0;i<count;i++){
			if(item==myArray[i]){
				return i;
			}
		}
		return -1;
	}
	public void sort(){
		for(int i=0;i<count;i++){
			for(int j=0;j<(i+1);j++){
				if(myArray[i]<myArray[j] ){
					myArray[i]=myArray[i]+myArray[j];
					myArray[j]=myArray[i]-myArray[j];
					myArray[i]=myArray[i]-myArray[j];
				}
			}
		}
		//System.out.println(Arrays.toString(myArray)); :Reason of not using this because It will give us also deleted items
		for(int i=0;i<count;i++){
			if(myArray[i]!=0){
				System.out.print(myArray[i]+",");
			}
		}
		System.out.println("]");
	}
}
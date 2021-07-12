public class ArrayShirking{
	public static void main (String [] args){
		//Use Simple Array, but it will behave as Dynamic Array
		Array number=new Array(3);
		//calling insert method of Array class
		number.insert(30);
		number.insert(25);
		number.insert(10);
		number.insert(34);
		number.insert(1);
		number.insert(100);

		//calling print method of Array class
		number.print();
	
		//indexOf(element) will tell us about index of element
		System.out.println("item is at index "+number.indexOf(25));

		//calling removeAt method of Array class
		number.removeAt(2);
		
		//sorting array
		System.out.print("Sorted Array: [") ;
		number.sort();
		
	}
}
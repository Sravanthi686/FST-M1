package Activity;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main(String[] args){
		//create an ArrayList
		List<String> myList = new ArrayList<>();
		
		//Add 5 values to the list
		myList.add("Apple");
		myList.add("watermelon");
		myList.add("Bananas");
		myList.add(1,"Pineapple");
		myList.add(3,"Kiwi");
		
		//Print all the values using a loop
		System.out.println(myList);
		for(String name: myList) {
			System.out.println(name);
		}
		//Print the 3rd element
		System.out.println("Third element: "+ myList.get(2));
		
		//search for  Name
		System.out.println("Is Pineapple in the list?: "+ myList.contains("Pineapple"));
		
		//remove a value
		myList.remove(1);
		myList.remove("Kiwi");
		
		//Print the size
		System.out.println("No. of elementsare: " + myList.size());
		System.out.println(myList);
	}

}

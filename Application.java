/*
 * Tyler Lerics
 * Dr. Johnston
 * CS215
 * ASSIGNMENT
 */
public class Application {

	public static void main(String[] args) {
		
		/*
		 * Instantiated Generic Type objects
		 */
		Item<String>item = new Item<String>();
		Item<Integer>item2 = new Item<Integer>();
		SmallBag<Item>smallBag = new SmallBag<Item>();
		
		//===============================================
		//SETTERS
		//===============================================
		item.setE("Tyler");
		item2.setE(1);
		
		//===============================================
		//Printing/ GETTERS
		//===============================================
		smallBag.setItem(item);
		
		System.out.println(smallBag.getItem().getE());
		
		smallBag.setItem(item2);
		
		System.out.println(smallBag.getItem().getE());
		
		
		
		
		
		

	}

}

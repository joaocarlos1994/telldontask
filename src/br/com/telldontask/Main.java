package br.com.telldontask;

public class Main {

	//Example for Tell, don't ask. Martin Fouler
	public static void main(String[] args) {
		 
		ShoppingCart instance = new ShoppingCart();

	    Item a = new Item("gloves", 23.43);
	    instance.addItem(a);

	    Item b = new Item("hat", 10.99);
	    instance.addItem(b);

	    Item c = new Item("scarf", 5.99);
	    instance.addItem(c);
	    
	    Item d = new Item("pants", 7.99);
	    instance.addItem(c);

	    double totalCost = instance.calcTotal();
	    System.out.println("Total do preço: " + totalCost);
	    //assertEquals(40.41, totalCost, 0.0001);
		

	}

}

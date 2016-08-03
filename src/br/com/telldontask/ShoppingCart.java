package br.com.telldontask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
	
	private final List<Item> itens;

	public ShoppingCart() {
		super();
		this.itens = new ArrayList<>();
	}
	
	public void addItem(Item item){
		this.itens.add(item);
	}
	
	public List<Item> getAllItens(){
		return Collections.unmodifiableList(itens);
	}
	
	public double calcTotal(){
		double total = 0.0;
		for (Item item : itens) {
			total += item.getPrice();
		}
		return total;
	}

}

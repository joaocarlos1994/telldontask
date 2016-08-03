package br.com.telldontask2;

public class Contato {
	
	private final String name;

	public Contato(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean isStartWithLetter(String letter){
		boolean exits = this.name.startsWith(letter);
		return exits; 
	}
}

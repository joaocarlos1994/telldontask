package br.com.telldontask.example2;

import java.util.ArrayList;
import java.util.List;

public class Telefone {
	
	private final List<Contato> listContato;

	public Telefone() {
		super();
		this.listContato = new ArrayList<>();
	}

	public List<Contato> getListContato() {
		return listContato;
	}
	
	public void addContato(Contato contato){
		this.listContato.add(contato);
	}
	
	public List<Contato> returnListContactWithLetter(String letter){
		
		List<Contato> listContactWithLetter = new ArrayList<>();
		
		for (Contato contato : this.listContato) {
			if(contato.isStartWithLetter("A")){
				listContactWithLetter.add(contato);
			}
		}
		return listContactWithLetter;
	}
	
}

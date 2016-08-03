package br.com.telldontask2;

public class Main {
	
	/** 
	 * Example two implements...
	 * 
	 * */

	public static void main(String[] args) {
		
		Telefone telefone = new Telefone();
		
		Contato contato = new Contato("João");
		Contato contato2 = new Contato("Daniel");
		Contato contato3 = new Contato("Augusto");
		Contato contato4 = new Contato("Guilherme");
		Contato contato5 = new Contato("Inácio");
		
		telefone.addContato(contato);
		telefone.addContato(contato2);
		telefone.addContato(contato3);
		telefone.addContato(contato4);
		telefone.addContato(contato5);
		
		for (Contato contatoLetter : telefone.returnListContactWithLetter("A")) {
			System.out.println(contatoLetter.getName());
		}
		
		
	}

}

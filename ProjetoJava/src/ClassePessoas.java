
public class ClassePessoas {

	//atributo
	String nomeAt;
	int idadeat;
	
	public ClassePessoas(String n, int i) {
		this.nomeAt = n;
		this.idadeat = i;
	}
	
	public ClassePessoas() {
		
	}
	
	public void receberNome(String name) {
		this.nomeAt = name;
	}

	public void receberIdade(int age) {
		this.idadeat = age;
	}

	public void mostrarNome() {
		System.out.println(this.nomeAt);
		
	}
	
	public void mostrarIdade() {
		System.out.println(this.idadeat);
		
	}
	
	public String retornarNome() {
		return this.nomeAt;
	}
	
	public int retornarIdade() {
		return this.idadeat;
	}


















}



public class ClassePrincipal {

	//Método chamado main
	public static void main(String[] args) {
		
		String nome = "rafael";
		
		System.out.println(nome); //sysout, CTRL + SPACE
		
		//usarClassePessoas
		ClassePessoas alunoObj = new ClassePessoas();
		
		alunoObj.nomeAt = "Luiz";
		alunoObj.rendaAt = 15_000;
		
		System.out.println(alunoObj.nomeAt);
		System.out.println(alunoObj.rendaAt);
		
		
		
	}

}


public class ClasseAlunos extends ClassePessoas{
	float notaAt;
	String cursoAt;
	
	public ClasseAlunos(String name, int age, int grade, String course) {
		super(name, age);
		this.notaAt = grade;
		this.cursoAt = course;
	}
}

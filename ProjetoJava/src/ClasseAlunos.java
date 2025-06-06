
public class ClasseAlunos {
	float notaAt;
	String cursoAt;
	
	public ClasseAlunos(String name, int age, int grade, String course) {
		super(name, age);
		this.notaAt = grade;
		this.cursoAt = course;
	}
}

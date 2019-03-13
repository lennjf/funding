
public class Student {
	String name ;
	int num;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public int getNum() {
		return num;
	}
	public Student setNum(int num) {
		this.num = num;
		return this;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + "]";
	}
	public Student(StudentBuilder studentBuilder) {
		this.name=studentBuilder.name;
		this.num=studentBuilder.num;
	}

	static class StudentBuilder{
		String name ;
		int num;
		public StudentBuilder setName(String name) {
			this.name=name;
			return  this;
		}
		public StudentBuilder setNum(int num) {
			this.num=num;
			return  this;
		}
		public Student build() {
			return new Student(this);
		}
	}
	public static void main(String[] args) {
		Student student = new StudentBuilder().setName("ning").setNum(1).build();
		System.out.println(student);
		Student s2 = new Student().setName("111").setNum(0);
		System.out.println(s2);
	}
	
}

package ejc88_lab9;

public class Student extends Person {
String program;
int year;
double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		setProgram(program);
		setYear(year);
		setFee(fee);
	}
	public String toString() {
		String sentence;
		sentence = getName() + " \nAddress: "+getAddress()+"\nProgram: "+getProgram()+"\nYear: "+getYear()+"\nFee"+getFee();
		return sentence;
	}
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}

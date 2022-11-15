package ejc88_lab9;

public abstract class Person {
String name;
String address = "String";

public Person(String name, String address) {
	setName(name);
	setAddress(address);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}

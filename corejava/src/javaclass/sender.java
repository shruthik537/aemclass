package javaclass;

public class sender {
private String name;
private int sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "sender [name=" + name + ", sal=" + sal + "]";
}

}

package CLASSESOBJECT;

import java.util.Objects;

class Person{
	String name;
	String city;
	int age;
	Person(String name,String city,int age){
		this.name=name;
		this.city=city;
		this.age=age;
	}
	public boolean equals(Object obj) {
		Person nob=(Person)obj;
		if(nob.name==this.name&&nob.city==this.city&&nob.age==this.age) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return Objects.hash(name,city,age);
	}
}
public class Q4 {

	public static void main(String[] args) {
		Person p1=new Person("Anirban Sukul","Bishnupur",18);
		Person p2=new Person("Anirban Sukul","Bankura",18);
		System.out.println(p1.equals(p2));
		System.out.println("Hash code of the first object is:"+p1.hashCode());
		System.out.println("Hash code of the second object is:"+p2.hashCode());
		

	}

}

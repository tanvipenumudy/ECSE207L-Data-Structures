package E18CSE187lab9;
public class CustomerTree {
	
	String name;
	int age;
	CustomerTree left,right;
	
	CustomerTree(String name,int age){
		
		this.name = name;
		this.age = age;
		left = right = null;
		
	}

}

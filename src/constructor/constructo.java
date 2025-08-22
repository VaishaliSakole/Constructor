package constructor;

public class constructo {
	String name;
	int age;
	int marks;
	int roll;
constructo(){
	System.out.println("welcome");
}
constructo(String n){
	name=n;
	System.out.println(name);
	
}
constructo(String n,int a){
	name=n;
	roll=a;
	System.out.println(name+roll);
		
	}

}


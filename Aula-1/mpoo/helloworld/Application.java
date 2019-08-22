package mpoo.helloworld;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld lucas = new HelloWorld(); 
		HelloWorld spicollys = new HelloWorld();
		lucas.setName("Lucas");
		lucas.print();
		spicollys.print(); //chamada do método de impressão sem ter chamado o método set
							//Nesse caso, será impresso "null" no lugar do nome 
		}
	}

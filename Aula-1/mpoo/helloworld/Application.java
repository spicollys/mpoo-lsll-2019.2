package mpoo.helloworld;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld lucas = new HelloWorld(); 
		HelloWorld spicollys = new HelloWorld();
		lucas.setName("Lucas");
		lucas.print();
		spicollys.print(); //chamada do m�todo de impress�o sem ter chamado o m�todo set
							//Nesse caso, ser� impresso "null" no lugar do nome 
		}
	}

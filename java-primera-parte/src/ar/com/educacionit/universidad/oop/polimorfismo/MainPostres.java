package ar.com.educacionit.universidad.oop.polimorfismo;

public class MainPostres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flan f = new Flan();
		Gelatina g = new Gelatina();
		
		//Aca casi se da el polimorfismo
		f.temblar();
		g.temblar();

	}

}

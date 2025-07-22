package ar.com.educacionit.universidad.interfaces;

public class Espaniol extends IdiomaBase implements IIdioma{

	

	public Espaniol() {
		super("Espaniol");
		
	}

	@Override
	public void decir(String algo){
		// TODO Auto-generated method stub
		System.out.println("Decir:" + algo);
	}

}

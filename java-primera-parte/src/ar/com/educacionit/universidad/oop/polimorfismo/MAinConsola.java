package ar.com.educacionit.universidad.oop.polimorfismo;

public class MAinConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playstation play1 = new Playstation("1324","Gris",1,false,32,false);
		Playstation play2 = new Playstation("13245","Negro",2,false,64,false);
		Playstation play6 = new Playstation("132456","Blanco",5,true,64,true);
		
		Xbox360 xbox360 = new Xbox360("223456","Negro",true,500,false);
		
		//Ahora puedo invocar los metodo
		 
		play1.play();
		play2.play();
		play6.play();
		
		xbox360.play();
		
		Consola[] consolas = new Consola[] {play1,play2,play6,xbox360};
		
		for(Consola o : consolas) {
			
			//No se si hay play o xbox , pero , no importa!
			o.play();
			
			if(o instanceof Playstation p) {
				p.getMemoria();
			}
			if(o instanceof Xbox360 x) {
				x.getFabricante();
			}
			
			if(o.getClass().isAssignableFrom(Playstation.class)) {
				Playstation p = (Playstation)o;
			}
		}
		
	}

}

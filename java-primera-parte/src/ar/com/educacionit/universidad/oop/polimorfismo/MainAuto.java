package ar.com.educacionit.universidad.oop.polimorfismo;

import ar.com.educacionit.universidad.oop.Auto;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto = new Auto("Ford","Falcon",1986,"Negro","S00001");
		
		//
		System.out.println(auto.getVelocidad());
		auto.acelerar();
		System.out.println(auto.getVelocidad());
		auto.acelerar(5);
		System.out.println(auto.getVelocidad());

	}

}

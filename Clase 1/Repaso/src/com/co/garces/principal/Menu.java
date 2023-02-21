package com.co.garces.principal;

import java.util.Scanner;

import com.co.garces.principal.implementaciones.Dividir;
import com.co.garces.principal.implementaciones.Multiplicar;
import com.co.garces.principal.implementaciones.Restar;
import com.co.garces.principal.implementaciones.Sumar;
import com.co.garces.principal.uno.OperacionInterface;

public class Menu {

	Scanner sc = new Scanner(System.in);
	public void mostrarMenu() {
		
		System.out.println("Digite el numero uno: ");
		double numUno = sc.nextDouble();
		
		System.out.println("Digite el numero dos: ");
		double numDos = sc.nextDouble();
		
		
		System.out.println("¿Que operacion desea hacer?: ");
		int seleccion = sc.nextInt();
		
		switch (seleccion) {
		case 1:
			
			Sumar sm = new Sumar();
			System.out.println(sm.sumar(numUno, numDos));
			break;
		
		case 2:
			
			Restar rs = new Restar();
			System.out.println(rs.restar(numUno, numDos));
			break;
			
		case 3:
			
			Multiplicar mt = new Multiplicar();
			System.out.println(mt.multiplicar(numUno, numDos));
			break;
		
		case 4:
			
			Dividir div = new Dividir();
			System.out.println(div.dividir(numUno, numDos));
			break;
		default:
			break;
		}
		
	}
	
}

package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>(); 
		int numero;
		int suma=0;
		double media;
		int contador=0;
		System.out.println("Introduzca cadena de eneteros (0=fin)");
		numero = sc.nextInt();
		while(numero!=0)
		{
			lista.add(numero);
			numero = sc.nextInt();
		}
		for(Integer n:lista)
			suma +=n;
		media = suma/lista.size();
		
		for(Integer n:lista)
			if(n>media)
				contador++;
		
		System.out.println("La suma vale: "+suma);
		System.out.println("La media vale "+media);
		System.out.println("La cantidad de numero que superan la media es: "+contador);
		
		lista.sort(null);
		
		System.out.println(lista);
		
	}

}

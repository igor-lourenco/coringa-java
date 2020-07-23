package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3 ,4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printLista(myObjs);
		copy(myDoubles, myObjs);
		printLista(myObjs);
	}
	
	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for(Number n : origem) {
			destino.add(n);
		}
	}
	
	public static void printLista(List<?> lista) {
		for(Object o: lista) {
			System.out.print(o + " ");
		}
		System.out.println();
	}

}

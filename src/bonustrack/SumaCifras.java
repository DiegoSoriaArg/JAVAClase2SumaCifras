package bonustrack;

public class SumaCifras {
	
	public int sumarCifras(int numero) {
		int suma = 0;
		int cifras = cuantasCifrasTiene(numero);
		/*
		int unidad = numero % 10;
		int decena = numero / 10 % 10;
		int centena = numero / 100 % 10;
		int uniMil = numero / 1000;
		suma = unidad + decena + centena + uniMil;
		*/
		if(numero < 10) {
			return numero;
		}
		for(int i=0; i < cifras; i++) {
			suma += numero / Math.pow(10, i) % 10;
		}
		/*
		int unidad, decena;
		while (suma >= 10) {
			unidad = suma % 10;
			decena = suma / 10;
			suma = unidad + decena;
		}
		*/
		return sumarCifras(suma);
	}

	private int cuantasCifrasTiene(int numero) {
		int div = numero;
		int cifras = 0;
		
		while(div != 0) {
			div = div/10;
			cifras ++;
		}
		return cifras;
	}
	
	public static void main(String[] args) {
		SumaCifras cs = new SumaCifras();
		System.out.println(cs.sumarCifras(3899));
		System.out.println(cs.sumarCifras(111111));
	}

}

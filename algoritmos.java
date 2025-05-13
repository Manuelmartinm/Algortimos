package entornos;

public abstract class algoritmos {
	/**
	 * Este método realiza el calculo de fibonacci
	 * @param n es el numero con el que se va a trabajar para calcular fibonacci
	 * @return f: el resultado de fibonacci
	 */
	
	public int fibonacci(int n) {
		if(n<0) {
			throw new IllegalArgumentException("numero menor a 0");
		}
		int f0 = 0;
		int f1 = 1;
		int f = 0;
		for (int i = 0; i < n-1; i++) {
			f = f1 + f0;
			f0 = f1;
			f1 = f;
		}
		return f;
	}
	/**
	 * Este método realiza el factorial
	 * @param n para pedir el numero al que le vamos a calcular el factorial
	 * @return Todos los numeros que tiene el factorial del n
	 */
	public int factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("numero menor a 0");
		}
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans*=i;
		}
		return ans;
	}
	/**
	 * Este metodo calcula si es primo o no
	 * @param n para saber que numero tenemos que comprobar si es primo
	 * @return boolean true si es primo, false si no es primo.
	 */
	public boolean primo(int n) {
		if (n<2){
			throw new IllegalArgumentException("numero menor a 2");
			
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}



package controller;

public class FatDuplo {

	public FatDuplo() {
		super();
	}
	public int fat(int n1) {
		//se o fator "n1" for igual a 1, retorna 1 - valor neutro da multiplicacao
		if (n1 <= 1) {
				return 1;
			} else {
				//qd o fator n1 não é igual a 1, multiplica o n1 por n1 = 2 até que o fator n1 seja igual a 1
				return n1 * fat(n1-2);
			}
	}
}
//fatorial duplo. Inteiro impar de 1 até n, onde o N é impar 

package aplication;

import exemplos.Conta;

public class Teste2 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Danilo";
		c1.saldo = 100;
		
		Conta c2 = new Conta();
		//c2.titular = "Danilo";
		//c2.saldo = 100;
		c2 = c1;
		
		if (c1 == c2) {
		System.out.println("iguais");
		} else {
		System.out.println("diferentes");
		}

	}

}

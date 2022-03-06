package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		Gato gato = new Gato();
		Livro livro= new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}

}

class Livro{
	public String livro;
	public Integer numPaginas;
}
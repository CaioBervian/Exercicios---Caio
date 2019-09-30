package com.aula;

public class MainLista07 {

public static void main(String[] args) {
		
		Lista LL = new Lista();
		int IL,FL=0;
		Registro nodo;
		boolean achou ;
		String  nomeBuscar = "item5";
		int I;
		for(int i=1; i<9; i++) {
			nodo = new Registro();
			nodo.setCodigo(i);
			nodo.setNome("item"+i);
			nodo.setPreco(3.4f*i);
			LL.arr[i]=nodo;
			FL = i;
		}
		
		IL = 0;
		
		System.out.println(LL);
		
		nodo = new Registro();
		nodo.setCodigo(0);
		nodo.setNome("item"+9);
		nodo.setPreco(3.4f*9);
	
		achou = false;
		I=IL;
	
		while ((I <= FL)&&(achou = false))
			if(LL.arr[I].getNome() == nomeBuscar ) {
				achou = true;
			}else {
				I=I+1;
			}
		System.out.println(LL);
		System.out.println(achou);


	}
}

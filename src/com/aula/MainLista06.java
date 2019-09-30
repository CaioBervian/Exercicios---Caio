package com.aula;

public class MainLista06 {

public static void main(String[] args) {
		
		Lista LL = new Lista();
		int IL,k=5, FL=0;
		Registro nodo;
		boolean sucesso; 
		
		
		for(int i=1; i<9; i++) {
			nodo = new Registro();
			nodo.setCodigo(i);
			nodo.setNome("item"+i);
			nodo.setPreco(3.4f*i);
			LL.arr[i]=nodo;
			FL = i;
		}
		
		IL = 1;
		
		System.out.println(LL);
		
		nodo = new Registro();
		nodo.setCodigo(0);
		nodo.setNome("item"+9);
		nodo.setPreco(3.4f*9);
		
		
		if((k < 0) || (k >  FL-IL+1) || (IL == 0)) {
			sucesso=false;
		}else {
				nodo.setCodigo(IL+k-1);
				nodo.setNome("item"+(IL+k-1));
				nodo.setPreco(20);
				LL.arr[IL+k-1]= nodo;
			sucesso = true;
		}
		
		System.out.println(LL);
		System.out.println(sucesso);

	}

}

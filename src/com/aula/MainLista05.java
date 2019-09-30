package com.aula;

public class MainLista05 {

public static void main(String[] args) {
		
		Lista LL = new Lista();
		int IL,k=6, FL=0;
		Registro nodo;
		int ind;
		
		
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
		
		
		if((k < 0) || (k >  FL-IL+1)) {
		}else {
				for(ind = IL+k-1; ind<FL+1; ind++) {
					LL.arr[ind] = LL.arr[ind+1];
				}
				FL = FL-1;	
			}
		if(FL == IL-1) {
			IL = FL = 0;
		}
		
		System.out.println(LL);

	}
}

package com.aula;

public class MainLista01 {
	
	public static void main(String[] args) {
		
		
		Lista LL = new Lista();
		int IA=0, FA=LL.arr.length-1, IL, FL=0;
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
		nodo.setPreco(3.4f*2);
		
		
		if((IA == IL) && (FA == FL)) {
		}else {
			if(IL == 0) {
				IL = FL = IA;
			}else if(IL > IA) {
				IL = IL-1;
			}else {
				for(ind = FL; ind>IL; ind--) {
					LL.arr[ind+1] = LL.arr[ind];
				}
				FL = FL+1;
			}
			LL.arr[IL] = nodo;
		}
		
		System.out.println("\n"+LL);

	}

}


package com.aula;

public class MainLista04 {

public static void main(String[] args) {
		
		Lista LL = new Lista();
		int IA=0, FA=LL.arr.length-1, IL,k=2, FL=0;
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
		nodo.setNome("item"+10);
		nodo.setPreco(3.4f*2);
		
		
		if((IA == IL) && (FA == FL) || (k >  FL-IL+2) || (k < 0)||(IL==0 && k != 0)) {
		}else {
			if(IL == 0) {
				IL = FL = ((FA-IA+1)/2);
			}else if(((FL != FA) && (k > ((FL-IL+2)/2))) || (IL == IA))  {
				for(ind = FL; ind>IL+k-1; ind--) {
					LL.arr[ind+1] = LL.arr[ind];
				}
				FL = FL+1;
			}else {
				for(ind = IL; ind>IL+k-2; ind++) {
					LL.arr[ind-1] = LL.arr[ind];
				}
				IL = IL-1;
				
			}
			LL.arr[IL+k-1] = nodo;
		}
		
		System.out.println(LL);

	}
	
}

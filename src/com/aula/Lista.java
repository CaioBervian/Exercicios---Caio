package com.aula;


public class Lista {
	public Registro arr[] = new Registro[10];

	public Registro[] getArranjo() {
		return arr;
	}

	public void setArranjo(Registro[] arranjo) {
		this.arr = arranjo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lista [arranjo=");
		for(int i=0; i<arr.length; i++) {
			builder.append(arr[i]);
			builder.append("\n");
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
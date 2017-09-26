package br.com.db1.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ColecoesSet {
	
	private Set<String> nomesDb1Start = new HashSet<String>();

	public void adicionarNomes(String nome){
		nomesDb1Start.add(nome);
	}
	
	public void removerNomes(String nome){
		nomesDb1Start.remove(nome);
	}
	
	public Boolean estaNaLista(String nome){
		return nomesDb1Start.contains(nome);
	}
	
	public void percorrerList(){
		Iterator lista = nomesDb1Start.iterator();
		while (lista.hasNext()){
			System.out.println(lista.next());
		}
		
	}
	
	public Integer tamanhoLista(){
		return nomesDb1Start.size();
	}
	
	public Set<String> getLista(){
		return nomesDb1Start;
	}
	
	
	//método gambiarra
	public Set<String> getListaOrdenada(){
		List<String> ordenados = new ArrayList<>();
		ordenados.addAll(nomesDb1Start);
		Collections.sort(ordenados);
		
		return ordenados;
	} 
	
	//método correto
	public Set<String> getListaOrdenada2(){
		Set<String> ordenados = new TreeSet<>();
		ordenados.addAll(nomesDb1Start);
		return ordenados;
	} 
	
}

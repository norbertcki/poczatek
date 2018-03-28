package kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array {
	
	List<String> names;
	List<String> nazwiska;

	public static void main(String[] args) {
		List<String>names=new ArrayList<>();
		List<String>nazwiska=new LinkedList<>();
		names.add("edward");
		names.add("halina");
		names.add("janusz");
		nazwiska.add("beata");
		nazwiska.add("slawek");
		
		dodajDoListy("imiona",names);
		for(String zmienna:names) {
			System.out.println(zmienna);
		}
		
				
	}
	public  static void dodajDoListy(String type,List<String>list) {
		Long czas0=System.currentTimeMillis();
		String s="w";
		for(int i=0;i<30;i++) {
			
			s+=s;
			list.add(s);
		}
		Long czasK=System.currentTimeMillis();
		System.out.println("czas zmierzony "+(czasK-czas0));
				
		
	}

}

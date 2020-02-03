package com.example.demo.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import javax.swing.text.AbstractDocument.BranchElement;

import org.springframework.http.HttpStatus;

public class Permutacao {

	public static void main(String[] args) {
		Integer  i = 436;
		System.out.println(permut(i.toString()).size());
	}
	
	private static void addPermutInSet(String number, Set<Integer> set) {
		set.add(Integer.parseInt(number));
	}
	public static Set<Integer> permut(String text){
		List<String> t =permutTo(text);
		Set<Integer> set = new HashSet<Integer>();
		for (String c : t) {
			if(c.charAt(0) == '0')
				continue;
			addPermutInSet(c,set);
		}
		return set;
	}
	public static List<String> permutTo(String permut) {
		if(permut.length() == 1) {
			return new ArrayList<String>(Arrays.asList(permut));
		}
		
		String charact = Character.toString(permut.charAt(0));
		List<String> permuted = permutTo(permut.substring(1));
		List<String> permutedF = new ArrayList<String>();
		String temp = "";
		for( String p : permuted) {
			for(int i = 0; i < p.length()+1; i++) {
				temp = permuteString(p, charact, i);
				permutedF.add(temp);
			}
		}
		return permutedF;
		}		
		

	public static String permuteString(String t, String charact,  int pos){
		String ant="";
		String post="";

			ant = t.substring(0, pos);
		if (pos  < t.length()) {
			post = t.substring(pos);	
		}	
		return ant+charact+post;
			
	}
}
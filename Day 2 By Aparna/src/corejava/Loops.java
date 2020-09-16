package corejava;

import java.util.ArrayList;
import java.util.List;

public class Loops {
	public static void main(String[] args) {

		// While Loop
		int count =0;
		System.out.println("Making use of break statement in while");
		while(count<=3) {
			count++;
			System.out.println("Count is :"+count);
		}
		
		// Do While Loop		
		System.out.println("\nThis is do while loop");
		do {
			System.out.println("Count : "+count);
			count--;
		}while(count>0);
		
		// For Loop
		// Simple Traditional Loop
		System.out.println("\nExample of Simple for loop");
		for(int i=0;i<5;i++) {
			System.out.println("Iteration : "+i+1);
		}
		
		//Enhanced For Loop
		System.out.println("\nExample of Enhanced For Loop");
		
		List<String> shows = new ArrayList<>();
		shows.add("The 100");
		shows.add("GOT");
		shows.add("Friends");
		shows.add("The Bold Type");
		
		
		for(String names : shows)
			System.out.println(names);
		
		//For Each
		System.out.println("\nFor Each Version :");
		shows.forEach(System.out::printf);
	}

}

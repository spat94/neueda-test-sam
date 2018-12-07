package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class WhaleWatcher {

	public static void main(String[] args) {
		
		Whale right = new Whale("Right Whale", "Atlantic Ocean", 2001, 21, 16);
		Whale blue = new Whale("Blue Whale", "Pacific Ocean", 2001, 23, 16);
		Whale sperm = new Whale("Sperm Whale", "Atlantic Ocean", 1900, 20, 40);
		Whale humpback = new Whale("Humpback Whale", "Antarctic Ocean", 919, 13, 13); //instantiating whale objects
		
		ArrayList<Whale> whaleList = new ArrayList<Whale>(); //Create new arrayList of whale objects called "whaleList"
		
		whaleList.add(right);
		whaleList.add(blue);
		whaleList.add(sperm);
		whaleList.add(humpback); //each whale object is stored in whaleList arraylist
		
			System.out.println(whaleList.toString()); //calls overridden toString method from Whale class to output details of all whales in whaleList
		
		for(int i = 0; i < whaleList.size(); i++)
		{
			if("Atlantic".equals(whale.getMainOcean())) //logic here is to iterate through arraylist and pull out objects for which "main ocean"
														//is "Atlantic" but unsure how- what's here won't work as method can't be called without referring to specific object"
					{
						return;
					}
		}
	}

}

package com.phoenix.demos;

import java.util.HashMap;

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> movies=new HashMap();
		movies.put("MovieName","Shawshank Redemption");
		movies.put("actorName","TimRobbins");
		movies.put("Rating", "4.5");
		
		String rating=movies.get("Rating");

	}

}

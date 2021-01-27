package com.psl.training.collections.city;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class CityStateMapMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File Fileobject = new File("C:\\Program Files (x86)\\eclipse\\CollectionsJava\\src\\com\\collection\\city\\CityState.txt");
		Scanner fileReader = new Scanner(Fileobject);
		Map<String,String> map = new HashMap<>();
		while(fileReader.hasNext())
		{
			String line = fileReader.nextLine();
		    String[] splitText = line.split("-");
		    map.put(splitText[0], splitText[1]);
		}
		CityStateMap cs1 = new CityStateMap();
		cs1.setMap(map);
		cs1.getAllCities(map);
		cs1.getAllStates(map);
		cs1.getAllCitiesForAState("Bihar");
		System.out.println("---------Before addition and deletion in map---------");
		Set<Entry<String, String>> entries =map.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		cs1.addCityState("Mumbai", "Maharastra");
		System.out.println("---------After addition in map---------");
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		cs1.deleteCities("Maharastra");
		System.out.println("---------After deletion in map---------");
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
	}

}


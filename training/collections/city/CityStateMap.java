package com.psl.training.collections.city;

import java.util.*;
import java.util.Map.Entry;

public class CityStateMap{
	private String city;
	private String state;
	
	private Map<String,String> map = new HashMap<>();

	/*public CityStateMap(String city, String state) {
		super();
		this.setCity(city);
		this.setState(state);
		map.put(city, state);
	}*/
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String getStateOfCity(String city)
	{
		return map.get(city);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void getAllCities(Map<String,String> map)
	{
		List<String> keyList=new ArrayList<>(map.keySet());
		System.out.println("All cities are: ");
		for(String k:keyList)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
	
	public void getAllStates(Map<String,String> map)
	{
		List<String> valueList=new ArrayList<>(map.values());
		System.out.println("All states are: ");
		for(String v:valueList)
		{
			System.out.print(v+" ");
		}
		System.out.println();
	}
	
	public void getAllCitiesForAState(String state)
	{
		 Set<Entry<String, String>> entries =map.entrySet();
		 for (Entry<String, String> entry : entries) {
	            if (entry.getValue().equals(state)) {
	                System.out.println(entry.getKey());
	            }
	     }
		/*Set set =map.entrySet();
		Iterator iterator = set.iterator();
		int i=0;
		while(iterator.hasNext()) {
			Map.Entry mEntry = (Map.Entry)iterator.next();
			System.out.println(i++);
			if(mEntry.getValue().equals(state)) {
				System.out.println(mEntry.getKey());
			}
		}*/
	}
	
	public void addCityState(String city, String state) {
		map.put(city, state);
	}
	
	/*public void deleteAllCitiesForAState(String state)
	{
		Set<Entry<String, String>> entries =map.entrySet();
		 for (Entry<String, String> entry : entries) {
	            if (entry.getValue().equals(state)) {
	                map.remove(entry.getKey());
	            }
	     }
	}*/
	
	public void deleteCities(String state) {
		List<String> str = new ArrayList<>();
		Iterator iterator = map.entrySet().iterator();
		int i=0;
		while(iterator.hasNext()) {
			//System.out.println(i++);
			Map.Entry mEntry = (Map.Entry)iterator.next();
			if(mEntry.getValue().equals(state)) {
				//map.remove(mEntry.getKey(), mEntry.getValue());
				str.add((String) mEntry.getKey());
			}
		}
		for(String s:str)
		{
			map.remove(s);
		}
	}
	
}

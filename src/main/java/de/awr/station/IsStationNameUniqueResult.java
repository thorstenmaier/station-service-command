package de.awr.station;

import de.awr.Result;

public class IsStationNameUniqueResult implements Result {

	private String name;
	private boolean unique;

	public IsStationNameUniqueResult(String name, boolean unique) {
		this.name = name;
		this.unique = unique;
	}
	
	

	public String getName() {
		return name;
	}



	public boolean isUnique() {
		return unique;
	}

}

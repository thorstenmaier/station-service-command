package de.awr.station;

import de.awr.Command;

public class IsStationNameUniqueCommand extends Command<IsStationNameUniqueResult> {
	
	private String id;

	private String name;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

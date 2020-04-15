package de.awr.station;

import de.awr.Result;

public class AddStationResult implements Result {

	private final Station station;
	
	public AddStationResult(Station station) {
		this.station = station;
	}

	public Station getStation() {
		return station;
	}
}

package de.awr.station;

import de.awr.Result;

public class StationResult implements Result {

	private final Station station;
	
	public StationResult(Station station) {
		this.station = station;
	}

	public Station getStation() {
		return station;
	}
}

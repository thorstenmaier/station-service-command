package de.awr.station;

import java.util.List;

import de.awr.Result;

public class StationListResult implements Result {

	private final List<Station> stations;

	public StationListResult(List<Station> stations) {
		this.stations = stations;
	}

	public List<Station> getStations() {
		return stations;
	}
	
}

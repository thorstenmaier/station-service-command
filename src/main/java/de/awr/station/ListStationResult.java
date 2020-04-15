package de.awr.station;

import java.util.List;

import de.awr.Result;

public class ListStationResult implements Result {

	private final List<Station> stations;

	public ListStationResult(List<Station> stations) {
		this.stations = stations;
	}

	public List<Station> getStations() {
		return stations;
	}
	
}

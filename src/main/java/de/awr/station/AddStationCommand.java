package de.awr.station;

import de.awr.Command;

public class AddStationCommand extends Command<StationResult> {

	private Station station;

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}
	
}

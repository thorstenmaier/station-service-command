package de.awr.station;

import de.awr.Command;

public class UdpateStationCommand extends Command<StationResult> {

	private Station station;

	public void setStation(Station station) {
		this.station = station;
	}

	public Station getStation() {
		return station;
	}

}

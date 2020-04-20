package de.awr.station;

import de.awr.Command;

public class DeleteStationCommand extends Command<SuccessResult> {

	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}

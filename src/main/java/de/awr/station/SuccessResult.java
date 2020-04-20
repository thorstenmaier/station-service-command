package de.awr.station;

import de.awr.Result;

public class SuccessResult implements Result {

	private boolean success;

	public SuccessResult() {
		this.success = true;
	}

	public boolean isValid() {
		return success;
	}
}

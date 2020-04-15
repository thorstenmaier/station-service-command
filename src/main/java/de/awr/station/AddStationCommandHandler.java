package de.awr.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.awr.CommandHandler;

@Component
public class AddStationCommandHandler implements CommandHandler<AddStationCommand, AddStationResult> {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public AddStationResult execute(AddStationCommand c) {
		Station savedStation = stationRepository.save(c.getStation());
		return new AddStationResult(savedStation);
	}

	@Override
	public Class<AddStationCommand> getCommandType() {
		return AddStationCommand.class;
	}

}

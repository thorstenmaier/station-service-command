package de.awr.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.awr.CommandHandler;

@Component
public class UpdateStationCommandHandler implements CommandHandler<UpdateStationCommand, StationResult> {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public StationResult execute(UpdateStationCommand c) {
		return new StationResult(stationRepository.save(c.getStation()));
	}

	@Override
	public Class<UpdateStationCommand> getCommandType() {
		return UpdateStationCommand.class;
	}

}

package de.awr.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.awr.CommandHandler;

@Component
public class UpdateStationCommandHandler implements CommandHandler<UdpateStationCommand, StationResult> {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public StationResult execute(UdpateStationCommand c) {
		return new StationResult(stationRepository.save(c.getStation()));
	}

	@Override
	public Class<UdpateStationCommand> getCommandType() {
		return UdpateStationCommand.class;
	}

}

package de.awr.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.awr.CommandHandler;

@Component
public class ListStationCommandHandler implements CommandHandler<ListStationCommand, StationListResult> {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public StationListResult execute(ListStationCommand c) {
		return new StationListResult(stationRepository.findAll());
	}

	@Override
	public Class<ListStationCommand> getCommandType() {
		return ListStationCommand.class;
	}

}

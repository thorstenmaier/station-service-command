package de.awr.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.awr.CommandHandler;

@Component
public class ListStationCommandHandler implements CommandHandler<ListStationCommand, ListStationResult> {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public ListStationResult execute(ListStationCommand c) {
		return new ListStationResult(stationRepository.findAll());
	}

	@Override
	public Class<ListStationCommand> getCommandType() {
		return ListStationCommand.class;
	}

}

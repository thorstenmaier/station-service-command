package de.awr.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.awr.CommandHandler;

@Component
public class IsStationNameUniqueCommandHandler implements CommandHandler<IsStationNameUniqueCommand, IsStationNameUniqueResult> {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public IsStationNameUniqueResult execute(IsStationNameUniqueCommand c) {
		int count = stationRepository.countByNameIgnoreCaseAndIdNot(c.getName(), Long.parseLong(c.getId()));
		return new IsStationNameUniqueResult(c.getName(), count == 0);
	}

	@Override
	public Class<IsStationNameUniqueCommand> getCommandType() {
		return IsStationNameUniqueCommand.class;
	}

}

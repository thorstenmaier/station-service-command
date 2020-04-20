package de.awr.station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.awr.CommandHandler;

@Component
public class DeleteStationCommandHandler implements CommandHandler<DeleteStationCommand, SuccessResult> {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public SuccessResult execute(DeleteStationCommand c) {
		stationRepository.deleteById(Long.valueOf(c.getId()));
		return new SuccessResult();
	}

	@Override
	public Class<DeleteStationCommand> getCommandType() {
		return DeleteStationCommand.class;
	}

}

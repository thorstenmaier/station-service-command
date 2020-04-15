package de.awr;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommandController {
	
	private Map<Class<Command<Result>>, CommandHandler<Command<Result>, Result>> handlers = new HashMap<>();
	
	@Autowired
	private ListableBeanFactory beanFactory;
	
	@PostConstruct
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setCommandHandler() {
		for (CommandHandler handler : beanFactory.getBeansOfType(CommandHandler.class).values()) {
			handlers.put(handler.getCommandType(), handler);
		}
	}
	
	@PostMapping("/execute")
	public Result httpCall(@RequestBody Command<Result> command) {
		return handlers.get(command.getClass()).execute(command);
	}

}

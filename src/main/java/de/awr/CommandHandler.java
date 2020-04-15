package de.awr;

public interface CommandHandler<C extends Command<R>, R extends Result> {

	R execute(C c);
	
	Class<C> getCommandType();
}

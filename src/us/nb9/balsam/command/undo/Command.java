package us.nb9.balsam.command.undo;

public interface Command {
	public void execute();
	public void undo();
}

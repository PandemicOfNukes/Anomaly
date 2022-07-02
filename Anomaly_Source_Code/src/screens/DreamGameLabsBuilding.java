package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class DreamGameLabsBuilding implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Abandoned Laboratory to be reopened,1950",1);
		terminal.write("The abandoned laboratory will be reopened by the company DREAMS.",1,3);
		terminal.write("The old laboratory was used by the US Military in the war",1,5);
		terminal.write("and it was abandoned when a gas leak was discovered.",1,6);
		terminal.write("Locals say they saw weird creatures resembling humans",1,8);
		terminal.write("but behaving strangely and aggressively.",1,9);
		terminal.write("The military was gone when the creatures stoped showing up.",1,11);
		terminal.write("'It was a weird time, 5 people disappeared at the same time.', a local said",1,13);
		terminal.write("-- Press [q] to go back --",1,15);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter12FileCabinet() : this;
	}
}

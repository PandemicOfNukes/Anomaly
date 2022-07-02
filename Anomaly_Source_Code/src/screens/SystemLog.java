package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class SystemLog implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("System Log",1,3);
		terminal.write("<Operator 3>HQ! Lab Rat 4 turned in [REDACTED] he attacked Operator 6!",1,5);
		terminal.write("<Operator 3>HQ! Respond! HQ!",1,6);
		terminal.write("<Operator 3>James! Stay Back! James!",1,7);
		terminal.write("<Operator 3>AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",1,8);
		terminal.write("<System>Operator 3, Operator 6, Lab Rat 4 turned in Control Center 2",1,9);
		terminal.write("<System>Quarantining Control Center 2........DONE",1,10);
		terminal.write("<System>Sending Emergency Signal.........DONE",1,11);
		terminal.write("<System>Message from HQ: Several Outbreaks, Await for further instructions",1,12);
		terminal.write("-- Press [q] to go back --",1,14);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter24Computer() : this;
	}
}
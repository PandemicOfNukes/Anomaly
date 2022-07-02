package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Evacuation implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("Evacuation",1,3);
		terminal.write("The higher ups sent a order to evacuate.",1,5);
		terminal.write("We still dont fully know what is happening but",1,6);
		terminal.write("Control Center 2 will be quarantined due to a breach.",1,7);
		terminal.write("Whats happening outside we dont know...",1,8);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter15Computer() : this;
	}
}
package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class PosterEvacuation implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("MANDATORY EVACUATION",1);
		terminal.writeCenter("EVACUATE TO:",4);
		terminal.writeCenter("Niel Army Base, Washighton",6);
		terminal.write("Base Overrun by Anomalies dont go there its a Death Trap",1,10);
		terminal.write("Stay in your place! Streets are dangerous!",1,12);
		terminal.write("-- Press [q] to go back --",1,15);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter16ComeBack() : this;
	}
}
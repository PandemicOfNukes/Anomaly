package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Corridor1Left implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You go to the left.",1,1);
		terminal.write("You see a window to the locked room in the control center...",1,3);
		terminal.write("The room is empty only having a toilet and the strange device...",1,4);
		terminal.write("You see a small drip of blood in the floor of the room...",1,5);
		terminal.write("There is not much here...",1,7);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Corridor1ComeBack() : this;
	}

}

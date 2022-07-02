package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Corridor15Left implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You go to the left.",1,1);
		terminal.write("You see a window to the locked room in the control center...",1,3);
		terminal.write("The room is empty only having a toilet and the strange device...",1,4);
		terminal.write("You see bloody hand imprints in the walls and in the window...",1,5);
		terminal.write("And a corpse shot in the head on the floor...",1,7);
		terminal.write("There is not much here...",1,9);
		terminal.write("-- Press [q] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Corridor15ComeBack() : this;
	}

}

package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Advice1 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		String username = System.getProperty("user.name");
		terminal.write("You can't win so dont fret over it...",1,1);
		terminal.write("Shut Down this program, this universe, end this suffering...",1,2);
		terminal.write("But if you choose to stay... well put your volume down for the next part...",1,3);
		terminal.write("OH! Silly me I don't know anything! Im a stupid character in a game",1,4);
		terminal.write("who follows code.",1,5);
		terminal.write("Right " + username + "?",1,6);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new NuclearBomb1() : this;
	}

}

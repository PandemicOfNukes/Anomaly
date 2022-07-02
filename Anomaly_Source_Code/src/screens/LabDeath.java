package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class LabDeath implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("A sweet scent starts coming out of the sink...",1,1);
		terminal.write("The smell starts to get to your head and you slowly start to fall asleep...",1,3);
		terminal.write("You die a peacefull death...",1,5);
		terminal.write("-- Press [space] to continue --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_SPACE ? new Explanation5() : this;
	}

}

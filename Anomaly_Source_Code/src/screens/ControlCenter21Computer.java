package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter21Computer implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Powering ON... OK",1,1);
		terminal.write("Dream Microsystems SM-SOD OS... OK",1,2);
		terminal.writeCenter("EZ SM-SOD VER. 1.14",4);
		terminal.write("Files",1,6);
		terminal.write("Conversation-Log2",1,8);
		terminal.write("Conversation-Log3",1,9);
		terminal.write("-- Press [q] to read Conversation-Log2 --",1,11);
		terminal.write("-- Press [w] to read Conversation-Log3 --",1,12);
		terminal.write("-- Press [e] to go back --",1,13);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ConversationLog2() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new ConversationLog3() : this;
	}
		return key.getKeyCode() == KeyEvent.VK_E ? new ControlCenter21ComeBack() : this;
	}
}
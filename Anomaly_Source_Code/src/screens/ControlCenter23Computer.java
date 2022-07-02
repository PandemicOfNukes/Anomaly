package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter23Computer implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Powering ON... OK",1,1);
		terminal.write("Dream Microsystems SM-SOD OS... OK",1,2);
		terminal.writeCenter("EZ SM-SOD VER. 1.14",4);
		terminal.write("Files",1,6);
		terminal.write("Conversation-Log2",1,8);
		terminal.write("Conversation-Log3",1,9);
		terminal.write("They are getting crazy",1,10);
		terminal.write("Permission Denied",1,11);
		terminal.write("-- Press [q] to read Conversation-Log2 --",1,13);
		terminal.write("-- Press [w] to read Conversation-Log3 --",1,14);
		terminal.write("-- Press [e] to read They are getting crazy --",1,15);
		terminal.write("-- Press [r] to read Permission Denied --",1,16);
		terminal.write("-- Press [t] to go back --",1,17);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ConversationLog22() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new ConversationLog32() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new GettingCrazy2(): this;
		case KeyEvent.VK_R:
			return key.getKeyCode() == KeyEvent.VK_R ? new PermissionDenied() : this;
	}
		return key.getKeyCode() == KeyEvent.VK_T ? new ControlCenter23ComeBack() : this;
	}
}

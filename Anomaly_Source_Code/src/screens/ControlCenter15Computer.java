package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter15Computer implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Powering ON... OK",1,1);
		terminal.write("Dream Microsystems SM-SOD OS... OK",1,2);
		terminal.writeCenter("EZ SM-SOD VER. 1.14",4);
		terminal.write("Files",1,6);
		terminal.write("Conversation-Log1",1,8);
		terminal.write("Conversation-Log4",1,9);
		terminal.write("No Gossip!",1,10);
		terminal.write("Evacuation",1,11);
		terminal.write("-- Press [q] to read Conversation-Log1 --",1,13);
		terminal.write("-- Press [w] to read Conversation-Log4 --",1,14);
		terminal.write("-- Press [e] ro read No Gossip!",1,15);
		terminal.write("-- Press [r] to read Evacuation --",1,16);
		terminal.write("-- Press [t] to go back --",1,17);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ConversationLog14() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new ConversationLog43() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new NoGossip2() : this;
		case KeyEvent.VK_R:
			return key.getKeyCode() == KeyEvent.VK_R ? new Evacuation() : this;
	}
		return key.getKeyCode() == KeyEvent.VK_T ? new ControlCenter15ComeBack() : this;
	}
}
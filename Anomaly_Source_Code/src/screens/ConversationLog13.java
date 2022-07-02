package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ConversationLog13 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("Conversation-Log1",1,3);
		terminal.write("<Operator1> Hey carter we doing a system check. Can you tell me your server?",1,6);
		terminal.write("<Carter> Of course, its dreamgamelabs.000webhostapp.com",1,7);
		terminal.write("<Carter> The username: carter",1,8);
		terminal.write("<Carter> The password: [REDACTED]",1,9);
		terminal.write("-- Press [q] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter14Computer() : this;
	}
}
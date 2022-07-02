package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ConversationLog42 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("Conversation-Log4",1,3);
		terminal.write("<Operator1> What are you saying thats illegal here!",1,6);
		terminal.write("<Operator2> Oh please dont you think its strange? Bringing Humans here",1,7);
		terminal.write("<Operator2> and treating them like animals!",1,8);
		terminal.write("<Operator1> Yes but you heard the boss we cannot talk about that!",1,9);
		terminal.write("<Operator3> You know you are being recorded right?",1,10);
		terminal.write("-- Press [q] to go back --",1,12);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter14Computer() : this;
	}
}
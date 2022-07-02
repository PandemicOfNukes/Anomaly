package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ConversationLog23 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("Conversation-Log1",1,3);
		terminal.write("<Operator1>Ah... Why I gotta change to SM-SOD?",1,6);
		terminal.write("<Operator2>Because the scientists didn't know how to use XINU",1,7);
		terminal.write("<Operator1>But SM-SOD is slower and buggier!",1,8);
		terminal.write("<Operator2>Just do your work man.",1,9);
		terminal.write("-- Press [q] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter24Computer() : this;
	}
}
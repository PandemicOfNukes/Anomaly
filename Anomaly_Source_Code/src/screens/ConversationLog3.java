package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ConversationLog3 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("Conversation-Log3",1,3);
		terminal.write("<Operator1>Say Carter why do you call your daughter Pumpkin?",1,6);
		terminal.write("<Carter>Because in a halloween night she disguised as a pumpkin",1,7);
		terminal.write("<Carter>So the name pumpkin stuck...",1,8);
		terminal.write("<Carter>as my wife and me started to say its our little pumpkin",1,9);
		terminal.write("<Operator1>Seems like you and your daughter are very close!",1,10);
		terminal.write("<Carter>Yeah... yeah... shes my most precious thing in the world...",1,11);
		terminal.write("-- Press [q] to go back --",1,13);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter21Computer() : this;
	}
}
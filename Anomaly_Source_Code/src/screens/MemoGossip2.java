package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class MemoGossip2 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Memo: Gossip",1);
		terminal.write("To all employees,",1,2);
		terminal.write("All the higher ups want to warn about gossip.",1,4);
		terminal.write("It was know that some of you have been gossiping confidential matters.",1,5);
		terminal.write("Please Stop or you will be fired.",1,6);
		terminal.write("Thank You For Your Understanding!",1,8);
		terminal.write("-- Press [q] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter15FileCabinet() : this;
	}

}

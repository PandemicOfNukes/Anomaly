package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Notebook5 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("DAY 5",1,1);
		terminal.write("Nothing... Absolutely nothing...",1,3);
		terminal.write("Complete radio silence only encoded messages sometimes...",1,5);
		terminal.write("A scientist killed himself today... said there is no hope...",1,7);
		terminal.write("Maybe he is right...",1,10);
		terminal.write("-- Press [q] to continue reading --",1,20);
		terminal.write("-- Press [w] to stop reading --",1,21);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Notebook6() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new Cafeteria16ComeBack() : this;
	}
}
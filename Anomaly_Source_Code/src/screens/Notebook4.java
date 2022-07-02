package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Notebook4 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("DAY 4",1,1);
		terminal.write("Not much today... same things, diferent day...",1,3);
		terminal.write("The radio was more silent than usual...",1,5);
		terminal.write("Everyone is afraid...",1,7);
		terminal.write("Damnmit! Heres the damn helicopter?!",1,10);
		terminal.write("-- Press [q] to continue reading --",1,20);
		terminal.write("-- Press [w] to stop reading --",1,21);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Notebook5() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new Cafeteria16ComeBack() : this;
	}
}
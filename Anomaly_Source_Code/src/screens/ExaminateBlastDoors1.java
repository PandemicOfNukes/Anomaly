package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ExaminateBlastDoors1 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("The doors are made with metal...",1,1);
		terminal.write("The doors are dense made to withstand explosions...",1,2);
		terminal.write("You see the sunlight... You are close to the outside...",1,3);
		terminal.write("A voice tells you: 'Dont go its not safe'.",1,4);
		terminal.write("-- Press [q] to go back --",1,10);
		terminal.write("-- Press [w] to go outside --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Cafeteria1ComeBack() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new Outside1() : this;
	}
}
package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Cafeteria16ComeBack implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You are in the Cafeteria.",1,1);
		terminal.write("The cafeteria is empty... with plates scattered and dirty",1,3);
		terminal.write("and tables turned upside down...",1,4);
		terminal.write("There is three doors with signs saying:",1,6);
		terminal.write("'Control Center 2','LAB' and 'Communications'",1,7);
		terminal.write("They are all locked with heavy doors...",1,8);
		terminal.write("There is 4 body bags on the floor...",1,10);
		terminal.write("There is also a body of a soldier with a notebook on his hand on the floor...",1,11);
		terminal.write("The TV is broken and near it there is a puddle of blood...",1,13);
		terminal.write("You see a Control Panel probably for the blast doors...",1,15);
		terminal.write("The Blast Doors are closed... There is no freedom...",1,16);
		terminal.write("-- Press [q] to investigate the body bags --",1,18);
		terminal.write("-- Press [w] to investigate the soldier --",1,19);
		terminal.write("-- Press [e] to investigate the Control Panel --",1,20);
		terminal.write("-- Press [r] to go back --",1,21);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new BodyBags() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new SoldierBody() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new ExaminateControlPanel16() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_R ? new Corridor16ComeBack() : this;
		}
	}
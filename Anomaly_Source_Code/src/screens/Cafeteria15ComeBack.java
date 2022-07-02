package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Cafeteria15ComeBack implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You are in the Cafeteria.",1,1);
		terminal.write("The cafeteria is empty... with plates scattered and dirty...",1,3);
		terminal.write("Whoever was here they left in a hurry...",1,4);
		terminal.write("There is three doors with signs saying:",1,6);
		terminal.write("'Control Center 2','LAB' and 'Communications'",1,7);
		terminal.write("They are all locked... Except Control Center 2",1,8);
		terminal.write("The Communications room is closed by a heavy door...",1,9);
		terminal.write("The TV is broken and near it there is a puddle of blood...",1,11);
		terminal.write("You see a Control Panel probably for the blast doors...",1,13);
		terminal.write("The Blast Doors are closed... There is no freedom...",1,14);
		terminal.write("-- Press [q] to investigate the Tables --",1,16);
		terminal.write("-- Press [w] to go to Control Center 2 --",1,17);
		terminal.write("-- Press [e] to investigate the Control Panel --",1,18);
		terminal.write("-- Press [r] to go back --",1,19);		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ExaminateTables15() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new ControlCenter24() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new ExaminateControlPanel15() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_R ? new Corridor15ComeBack() : this;
	}
}
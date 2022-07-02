package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Cafeteria1 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("After passing the corridor you go to the cafeteria...",1,1);
		terminal.write("The cafeteria is empty... with plates scattered and dirty...",1,3);
		terminal.write("Whoever was here they left in a hurry...",1,4);
		terminal.write("There is three doors with signs saying:",1,6);
		terminal.write("'Control Center 2','LAB' and 'Communications'",1,7);
		terminal.write("They are all locked...",1,8);
		terminal.write("There is a powered off TV...",1,10);
		terminal.write("You see a Control Panel probably for the blast doors...",1,12);
		terminal.write("You can see light coming out of the blast doors... The Outside is near...",1,14);
		terminal.write("-- Press [q] to investigate the Tables --",1,16);
		terminal.write("-- Press [w] to investigate the TV --",1,17);
		terminal.write("-- Press [e] to investigate the Control Panel --",1,18);
		terminal.write("-- Press [r] to go to the Blast Doors --",1,19);
		terminal.write("-- Press [t] to go to back --",1,20);
}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ExaminateTables1() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new ExaminateTV1() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new ExaminateControlPanel1() : this;
		case KeyEvent.VK_R:
			return key.getKeyCode() == KeyEvent.VK_R ? new ExaminateBlastDoors1() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_T ? new Corridor1ComeBack() : this;
	}
}

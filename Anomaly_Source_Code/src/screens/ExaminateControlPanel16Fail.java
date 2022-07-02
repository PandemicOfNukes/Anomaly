package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ExaminateControlPanel16Fail implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("It didnt work...",1,1);
		terminal.write("The Panel Is saying that the blast doors are closed...",1,2);
		terminal.write("There is a 4 key passcode to open it...",1,3);
		terminal.write("There is three numbers writen in the control panel: '587_'",1,4);
		terminal.write("I need to input a number to the code...",1,6);
		terminal.write("-- Press [q] to input number 0 --",1,10);
		terminal.write("-- Press [w] to input number 1 --",1,11);
		terminal.write("-- Press [e] to input number 2 --",1,12);
		terminal.write("-- Press [r] to input number 3 --",1,13);
		terminal.write("-- Press [t] to input number 4 --",1,14);
		terminal.write("-- Press [y] to input number 5 --",1,15);
		terminal.write("-- Press [u] to input number 6 --",1,16);
		terminal.write("-- Press [i] to input number 7 --",1,17);
		terminal.write("-- Press [o] to input number 8 --",1,18);
		terminal.write("-- Press [p] to input number 9 --",1,19);
		terminal.write("-- Press [a] to go back --",1,20);
		}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Outside2() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_R:
			return key.getKeyCode() == KeyEvent.VK_R ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_T:
			return key.getKeyCode() == KeyEvent.VK_T ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_Y:
			return key.getKeyCode() == KeyEvent.VK_Y ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_U:
			return key.getKeyCode() == KeyEvent.VK_U ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_I:
			return key.getKeyCode() == KeyEvent.VK_I ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_O:
			return key.getKeyCode() == KeyEvent.VK_O ? new ExaminateControlPanel16Fail() : this;
		case KeyEvent.VK_P:
			return key.getKeyCode() == KeyEvent.VK_P ? new ExaminateControlPanel16Fail() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_A ? new ExaminateControlPanel16Fail() : this;
	}
}
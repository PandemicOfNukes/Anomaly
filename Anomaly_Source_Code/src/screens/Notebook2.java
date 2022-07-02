package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Notebook2 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("DAY 2",1,1);
		terminal.write("We killed the Anomalies in the Control Center 2 but we lost a man...",1,3);
		terminal.write("He locked himself in a Lab Rat cell and killed himself because",1,4);
		terminal.write("he was touched by one of that things... Tragic...",1,5);
		terminal.write("Outside it seems that the situation is getting worse by the minute...",1,7);
		terminal.write("As more of that things pop-up more our forces are getting thiner and thiner.",1,8);
		terminal.write("I talked with one of the scientists a guy named Carter told me that his theory",1,10);
		terminal.write("for this outbreak was a MPI that broke out unnoticed...",1,11);
		terminal.write("We received our orders today, the HQ wants to evacuate the scientists and",1,13);
		terminal.write("told us to fortify the building but we dont have much to do because the",1,14);
		terminal.write("blast doors are strong enough to hold...",1,15);
		terminal.write("We dont know when we will evacuate but I hope its soon...",1,17);
		terminal.write("-- Press [q] to continue reading --",1,20);
		terminal.write("-- Press [w] to stop reading --",1,21);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Notebook3() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new Cafeteria16ComeBack() : this;
	}
}

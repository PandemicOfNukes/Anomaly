package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Notebook implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("DAY 1",1,1);
		terminal.write("Well we have been called to action, we arrived to the Dream Game Labs today.",1,3);
		terminal.write("When we arrived the Control Center 2 was already closed because 3 people",1,4);
		terminal.write("turned into Anomalies.",1,5);
		terminal.write("We agreed to kill them because the scientists said that the door",1,7);
		terminal.write("doesnt hold the radiation.",1,8);
		terminal.write("The scientists asked us if we were a cleaner crew we said yes.",1,10);
		terminal.write("We are 5 soldiers so we are outnumbered.",1,11);
		terminal.write("The TV is broken and the communications room is locked by protocol.",1,13);
		terminal.write("We brought a radio to receive commands from HQ",1,14);
		terminal.write("and to know whats happening ouside...",1,15);
		terminal.write("The code to open the blast doors is : 5870",1,17);
		terminal.write("-- Press [q] to continue reading --",1,20);
		terminal.write("-- Press [w] to stop reading --",1,21);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Notebook2() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new Cafeteria16ComeBack() : this;
	}
}
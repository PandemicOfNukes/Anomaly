package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Room31 implements Screen{

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You enter in the room",1,1);
		terminal.write("The room is smaller than the all other rooms...",1,2);
		terminal.write("In the room you see a corpse of a soldier and a gun in the floor...",1,4);
		terminal.write("The door closes behind you... you hear them getting closer...",1,6);
		terminal.write("You hear a voice saying:'You know what to do... do it.'",1,8);
		terminal.write("-- Press [q] to grab the gun --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Gun() : this;
	}

}

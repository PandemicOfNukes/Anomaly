package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Notebook6 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("DAY 6",1,1);
		terminal.write("The evacuation arrived today...",1,3);
		terminal.write("but my squad didnt arrive at the end of the day alive...",1,4);
		terminal.write("The helicopter arrived... the scientists were the priority not us...",1,6);
		terminal.write("A giant horde came and killed my comrades... I had to kill them...",1,8);
		terminal.write("HQ told that we are going to be evacuated but I dont believe it...",1,9);
		terminal.write("I got touched you see... I felt my skin calcify and burn...",1,11);
		terminal.write("I put my comrades bodies in body bags...",1,13);
		terminal.write("But its all over now... the mission was success...",1,15);
		terminal.write("GoodBye.",1,18);
		terminal.write("-- Press [q] to come back --",1,20);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Cafeteria16ComeBack() : this;
	}
}
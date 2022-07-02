package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StartScreenGoodEnding implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		terminal.writeCenter("Anomaly", 1);
		terminal.write("ERROR: NO TEST SUBJECT FOUND UNABLE TO PROCEED WITH PROGRAM EXECUTION",1,5,AsciiPanel.red);
		terminal.write("Lab Rat 4 = DECEASED",1,10);
		terminal.write("Lab Rat 3 = DECEASED",1,11);
		terminal.write("Lab Rat 2 = DECEASED",1,12);
		terminal.write("Lab Rat 1 = MISSING",1,13,AsciiPanel.brightYellow);
		terminal.write("Last Message Received: This is Carter communicating in the fallout shelter",1,18);
		terminal.write("in the artic... Glad to hear people that survived this madness... But",1,19);
		terminal.write("listen the problem isnt with Anomalies... its with us... you see...",1,20);
		terminal.write("We Are All Still Fighting.",1,21);
		terminal.writeCenter("--Press the [X] on your top bar to stop the program --",23);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return null;
	}
}
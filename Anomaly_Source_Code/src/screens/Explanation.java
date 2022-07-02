package testeGUi.screens;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public class Explanation implements Screen {
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Welcome!", 1);
		terminal.write("Dream Game is booting up...OK", 1, 2, AsciiPanel.green);
		terminal.write("Neural Interface Check...OK", 1, 3, AsciiPanel.green);
		terminal.write("REM MODE...OK", 1, 4, AsciiPanel.green);
		terminal.write("Hello Young child! Why are you sad? - said the elder woman",1,6);
		terminal.write("OH! I see you lost your teddy bear and now you can't go to sleep.",1,7);
		terminal.write("I would help you my child but my legs kill me everyday...",1,8);
		terminal.write("But I sense a great power within you!",1,9);
		terminal.write("In the cave you will learn things that will increase your power",1,10);
		terminal.write("So going to the cave might not be bad...",1,11);
		terminal.write("Just don't get Lost in the caves...",1,12);
		terminal.write("Record: [REDACTED] Oppenheiner",1,14,AsciiPanel.green);
		terminal.write("Crime: Murder, Possesion of ilegal firearms",1,15,AsciiPanel.green);
		terminal.write("IQ: 170",1,16,AsciiPanel.green);
		terminal.write("Affected By Artifact Radiation: YES",1,17,AsciiPanel.green);
		terminal.write("Currently In : Dream Game Laboratory [REDACTED], in [REDACTED]",1,18,AsciiPanel.green);
		terminal.write("Occupation: Lab Rat",1,19,AsciiPanel.green);
		terminal.writeCenter("-- press [enter] to start --", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}

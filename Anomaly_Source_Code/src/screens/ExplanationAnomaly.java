package testeGUi.screens;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public class ExplanationAnomaly implements Screen {
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.writeCenter("Welcome!", 1);
		terminal.write("Dream Game is booting up...ERROR", 1, 2, AsciiPanel.red);
		terminal.write("Neural Interface Check...ERROR", 1, 3, AsciiPanel.red);
		terminal.write("REM MODE...ERROR", 1, 4, AsciiPanel.red);
		terminal.write("ERROR",1,6,AsciiPanel.red);
		terminal.write("ERROR",1,7,AsciiPanel.red);
		terminal.write("ERROR",1,8,AsciiPanel.red);
		terminal.write("ERROR",1,9,AsciiPanel.red);
		terminal.write("ERROR",1,10,AsciiPanel.red);
		terminal.write("ERROR",1,11,AsciiPanel.red);
		terminal.write("ERROR",1,12,AsciiPanel.red);
		terminal.write("Record:ERROR",1,14,AsciiPanel.red);
		terminal.write("Crime:ERROR",1,15,AsciiPanel.red);
		terminal.write("IQ:ERROR",1,16,AsciiPanel.red);
		terminal.write("Affected By Artifact Radiation:ERROR",1,17,AsciiPanel.red);
		terminal.write("Currently In :ERROR",1,18,AsciiPanel.red);
		terminal.write("Occupation:ERROR",1,19,AsciiPanel.red);
		terminal.writeCenter("-- press [enter] to RUN --", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayscreenAnomaly() : this;
	}
}

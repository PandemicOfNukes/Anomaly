package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StartScreenBadEnding implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Anomaly", 1);
		terminal.writeCenter("", 2);
		terminal.writeCenter("                                                       ", 3);
		terminal.writeCenter("                                                       ", 4);
		terminal.writeCenter("                                                   ", 5);
		terminal.writeCenter("                                                 ", 6);
		terminal.writeCenter("                                               ", 7);
		terminal.writeCenter("                                             ", 8);
		terminal.writeCenter("                                           ", 9);
		terminal.writeCenter("                                         ", 10);
		terminal.writeCenter("                                      ", 11);
		terminal.writeCenter("                                     ", 12);
		terminal.writeCenter("                                   ", 13);
		terminal.writeCenter("                                 ", 14);
		terminal.writeCenter("  *                              ", 15,AsciiPanel.red);
		terminal.writeCenter("*                               ", 16,AsciiPanel.red);
		terminal.writeCenter("*                                ", 17,AsciiPanel.red);
		terminal.writeCenter("*                                 *", 18,AsciiPanel.red);
		terminal.writeCenter(" *                                   *  ", 19,AsciiPanel.red);
		terminal.writeCenter(" *********************************** ", 20,AsciiPanel.red);
		terminal.writeCenter("-- press [enter] to start --", 22);
		terminal.writeCenter("-- press [s] to enter the survival mode --",23);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_ENTER:
			return key.getKeyCode() == KeyEvent.VK_ENTER ? new Explanation() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_S ? new SurvivalExplanation() : this;
	}
}

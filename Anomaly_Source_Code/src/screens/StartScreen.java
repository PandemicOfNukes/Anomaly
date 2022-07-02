package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		terminal.writeCenter("Anomaly", 1);
		terminal.writeCenter("*", 2);
		terminal.writeCenter("                *   *              The", 3);
		terminal.writeCenter("                   *     *            Artifact", 4);
		terminal.writeCenter("              *       *          Holds", 5);
		terminal.writeCenter("           *         *         The", 6);
		terminal.writeCenter("             *           *          True", 7);
		terminal.writeCenter("             *             *         Power", 8);
		terminal.writeCenter("            *               *          And", 9);
		terminal.writeCenter("           *                 *   Knowledge", 10);
		terminal.writeCenter("          *                   *         Of", 11);
		terminal.writeCenter("         *                     *       The", 12);
		terminal.writeCenter("            *                       *     Universe", 13);
		terminal.writeCenter("*                         *", 14);
		terminal.writeCenter("   *                           * May", 15);
		terminal.writeCenter("   *                             * Be", 16);
		terminal.writeCenter("       *                               * Praised", 17);
		terminal.writeCenter("   *                                 * The", 18);
		terminal.writeCenter("                    *                                   * Sons Of The Artifact", 19);
		terminal.writeCenter(" *********************************** ", 20);
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

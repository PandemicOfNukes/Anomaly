package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class PosterQuarantine implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("QUARANTINE UNDER EFFECT",1);
		terminal.write("Quarantine is under effect due to a Anomaly outbreak.",1,3);
		terminal.write("Await For Further Instructions.",1,4);
		terminal.write("If you think you are in a highly irradiated area please do the following:",1,6);
		terminal.write("->Close all doors and windows and cover the openings with duct tape or plastic",1,7);
		terminal.write("->If possible cover yourself with Clothes, Blankets, etc.",1,8);
		terminal.write("If you see a loved one or a person experiencing these symptoms:",1,10);
		terminal.write("->Black eyes",1,11);
		terminal.write("->Skin rashes",1,12);
		terminal.write("->Calcified Skin",1,13);
		terminal.write("->Aggressive Behavior",1,14);
		terminal.write("Get away immediately.",1,15);
		terminal.write("Thank You For Your Cooperation!",1,17);
		terminal.write("-- Press [q] to go back --",1,20);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter16ComeBack() : this;
	}
}
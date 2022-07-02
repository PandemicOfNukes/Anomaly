package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class LabPoster implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("New exciting chemicals developed by DREAMS", 1);
		terminal.write("NTPO = NitriPocs",1,3);
		terminal.write("POTN = PotresNi",1,4);
		terminal.write("OA = OlgaAcid",1,5);
		terminal.write("NAC = NitriAcidConlignus",1,6);
		terminal.write("PO = Petrioc",1,7);
		terminal.write("NOK = NitriColgavika",1,8);
		terminal.write("'Never heard of these...'",1,10);
		terminal.write("-- Press [q] to go back --",1,12);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Laboratory1ComeBack() : this;
	}
}
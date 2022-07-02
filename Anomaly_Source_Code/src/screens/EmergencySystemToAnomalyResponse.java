package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class EmergencySystemToAnomalyResponse implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("Emergency System To Anomaly Response",1,3);
		terminal.write("In all nation wide Televisions the Emergency Alert System",1,5);
		terminal.write("will fire up in all TV stations.",1,6);
		terminal.write("Next Civil Defense will put a special TV Station",1,8);
		terminal.write("in all states to pass to the public Information.",1,9);
		terminal.write("If the situation gets really bad images of D.C",1,11);
		terminal.write("will be displayed in a special TV station.",1,12);
		terminal.write("And thats where we come in to [REDACTED].",1,13);
		terminal.write("-- Press [q] to go back --",1,20);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter12Computer() : this;
	}
}
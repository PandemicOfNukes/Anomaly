package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Outside1 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("                                                                              ",1,1);
		terminal.write("                                                                              ",1,2);
		terminal.write("                                                                              ",1,3);
		terminal.write("                                                                              ",1,4);
		terminal.write("                                                                              ",1,5);
		terminal.write("                                                                              ",1,6);
		terminal.write("                                                                              ",1,7);
		terminal.write("                                                                              ",1,8);
		terminal.write("                                                                              ",1,9);
		terminal.write("                                                                              ",1,10);
		terminal.write("                                                                              ",1,11);
		terminal.write("                                                                              ",1,12);
		terminal.write("                                                                              ",1,13);
		terminal.write("                                                                              ",1,14);
		terminal.write("                                                                              ",1,15);
		terminal.write("                                                                              ",1,16);
		terminal.write("                                                                              ",1,17);
		terminal.write("                                    @                                         ",1,18);
		terminal.write("______________________________               _________________________________",1,19);
		terminal.write("******************************               *********************************",1,20);
		terminal.write("******************************************************************************",1,21);
		terminal.write("------------------------------------------------------------------------------",1,22);
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_UP ? new NuclearBomb1() : this;
	}

}

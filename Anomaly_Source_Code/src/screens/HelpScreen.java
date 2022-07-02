package testeGUi.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class HelpScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.clear();
		terminal.writeCenter("Dream Game help - Alpha 0.2 (1980)", 1);
		terminal.write("Welcome to Dream Game a classic Roguelike with nothing to fear! ", 1, 3);
		terminal.write("Dont panic but you are dreaming this game! Cool isn't it?",1,4);
		terminal.write("With our new product Dream Game (Bound to release in 1981)",1,5);
		terminal.write("You can dream any game you want! Technology is COOL!",1,6);
		terminal.write("Because this is a alpha you have to find your teddy bear in a series of caves!", 1, 7);
		terminal.write("Then return to the surface and win the game!",1,8);
		terminal.write("But be careful there is monsters and you are getting hungry...",1,9);
		
		int y = 10;
		terminal.write("[g] or [,] to pick up", 2, y++);
		terminal.write("[d] to drop", 2, y++);
		terminal.write("[e] to eat", 2, y++);
		terminal.write("[w] to wear or wield", 2, y++);
		terminal.write("[>] to go downstairs e.g >",2,y++);
		terminal.write("[<] to go upstairs e.g <",2,y++);
		terminal.write("[?] for help", 2, y++);
		terminal.write("[x] to examine your items", 2, y++);
		//terminal.write("[;] to look around", 2, y++);
		terminal.write("[t] to throw an item", 2, y++);
		terminal.write("[q] to quaff a potion", 2, y++);
		terminal.write("[r] to read a spell book", 2, y++);
		terminal.write("[f] to fire bows",2,y++);

		
		terminal.writeCenter("-- press any key to continue --", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return null;
	}
}

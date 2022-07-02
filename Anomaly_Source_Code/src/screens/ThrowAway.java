package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class ThrowAway implements Screen {
	File Clip = new File("Pouring.WAV");
	static Clip clip2;
	
	static void PlaySoundMusic(File Sound){
        try{
            clip2 = AudioSystem.getClip();
            clip2.open(AudioSystem.getAudioInputStream(Sound));
            clip2.start();
            Thread.sleep(clip2.getMicrosecondLength()/1000);
        } catch(Exception e){
            
        }  
    }

	@Override
	public void displayOutput(AsciiPanel terminal) {
		AddPotresNi.potresni = false;
		AddNitriPocs.nitripocs = false;
		AddOlgaAcid.olgaacid = false;
		AddNitriAcidConlignus.nitricacidconlignus = false;
		AddPetrioc.petrioc = false;
		AddNitriColgavika.nitricolgavika = false;
		terminal.write("You throwed away the mix in the sink...",1,1);
		terminal.write("In the table you see several vials containing liquids...",1,2);
		terminal.write("1- NitriPocs",1,3);
		terminal.write("2- PotresNi",1,4);
		terminal.write("3- OlgaAcid",1,5);
		terminal.write("4- NitriAcidConlignus",1,6);
		terminal.write("5- Petrioc",1,7);
		terminal.write("6- NitriColgavika",1,8);
		terminal.write("-- Press [q] to add NitriPocs --",1,10);
		terminal.write("-- Press [w] to add PotresNi --",1,11);
		terminal.write("-- Press [e] to add OlgaAcid --",1,12);
		terminal.write("-- Press [r] to add NitriAcidConlignus --",1,13);
		terminal.write("-- Press [t] to add Petrioc --",1,14);
		terminal.write("-- Press [y] to add NitriColgavika --",1,15);
		terminal.write("-- Press [u] to go back --",1,16);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		class Multi extends Thread{
			public void run() {
				try {
					PlaySoundMusic(Clip);
				} catch (Exception e) {
					
				}
			}
		}
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			Multi t1 = new Multi();
			t1.start();
			return key.getKeyCode() == KeyEvent.VK_Q ? new AddNitriPocs() : this;
		case KeyEvent.VK_W:
			Multi t2 = new Multi();
			t2.start();
			return key.getKeyCode() == KeyEvent.VK_Q ? new AddPotresNi() : this; 
		case KeyEvent.VK_E:
			Multi t3 = new Multi();
			t3.start();
			return key.getKeyCode() == KeyEvent.VK_Q ? new AddOlgaAcid() : this;
		case KeyEvent.VK_R:
			Multi t4 = new Multi();
			t4.start();
			return key.getKeyCode() == KeyEvent.VK_Q ? new AddNitriAcidConlignus() : this;
		case KeyEvent.VK_T:
			Multi t5 = new Multi();
			t5.start();
			return key.getKeyCode() == KeyEvent.VK_Q ? new AddPetrioc() : this;
		case KeyEvent.VK_Y:
			Multi t6 = new Multi();
			t6.start();
			return key.getKeyCode() == KeyEvent.VK_Q ? new AddNitriColgavika() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_U ? new Laboratory1ComeBack() : this;
	}
}
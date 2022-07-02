package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class ExaminateRadio implements Screen {
	File Clip = new File("radio.WAV");
	static Clip clip2;
	static int p = 0;
	static int y = 0;
	
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
		System.out.println(this);

		p = 0;
		y = 0;
		terminal.write("The radio is off but you can change the frequency...",1,1);
		terminal.write("-- Press [q] to change to 400 FM --",1,10);
		terminal.write("-- Press [w] to change to 600 FM --",1,11);
		terminal.write("-- Press [e] to change to 700 FM --",1,12);
		terminal.write("-- Press [r] to go back --",1,13);
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
			p++;
			y++;
			return key.getKeyCode() == KeyEvent.VK_Q ? new Frequency400() : this;
		case KeyEvent.VK_W:
			Multi t2 = new Multi();
			t2.start();
			y++;
			return key.getKeyCode() == KeyEvent.VK_W ? new Frequency600() : this;
		case KeyEvent.VK_E:
			Multi t3 = new Multi();
			t3.start();
			y++;
			return key.getKeyCode() == KeyEvent.VK_E ? new Frequency700() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_R ? new Communications1ComeBack() : this;
	}

}

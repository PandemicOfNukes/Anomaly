package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class Gun implements Screen {
	File Clip = new File("Gunshot.WAV");
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
		System.out.println(this);

		terminal.write("DO IT",1,1);
		terminal.write("DO IT",1,2);
		terminal.write("DO IT",1,3);
		terminal.write("DO IT",1,4);
		terminal.write("DO IT",1,5);
		terminal.write("DO IT",1,6);
		terminal.write("DO IT",1,7);
		terminal.write("DO IT",1,8);
		terminal.write("DO IT",1,9);
		terminal.write("DO IT",1,10);
		terminal.write("DO IT",1,11);
		terminal.write("DO IT",1,12);
		terminal.write("DO IT",1,13);
		terminal.write("DO IT",1,14);
		terminal.write("DO IT",1,15);
		terminal.write("DO IT",1,16);
		terminal.write("DO IT",1,17);
		terminal.write("DO IT",1,18);
		terminal.write("DO IT",1,19);
		terminal.write("-- Press [q] to shoot yourself --",1,21);
		terminal.write("[w] 'I cant do it...'",1,22);
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
			return key.getKeyCode() == KeyEvent.VK_Q ? new Explanation6() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new NoChoice() : this;
	}

}

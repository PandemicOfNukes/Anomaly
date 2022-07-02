package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class Channel8 implements Screen {
	File Clip = new File("tvclick.WAV");
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

		terminal.write("This is the emergency broadcast system... The rest is glitched...",1,1);
		terminal.write("You can change the channel",1,2);
		terminal.write("-- Press [q] to change to channel 3 --",1,10);
		terminal.write("-- Press [w] to change to the initial channel --",1,11);
		terminal.write("-- Press [e] to change to channel 13 --",1,12);
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
			Multi t1=new Multi();
	        t1.start();
	        ExaminateTV12.y++;
	        if(ExaminateTV12.y == 3) {
	        	if(ExaminateTV12.p == 2) {
	        		return key.getKeyCode() == KeyEvent.VK_Q ? new ChannelWin() : this;
	        	} else if(ExaminateTV12.p < 2) {
	        		return key.getKeyCode() == KeyEvent.VK_Q ? new ExaminateTV12() : this;
	        	}
	        }
			return key.getKeyCode() == KeyEvent.VK_Q ? new Channel3() : this;
		case KeyEvent.VK_W:
			Multi t2=new Multi();
	        t2.start();
			return key.getKeyCode() == KeyEvent.VK_W ? new ExaminateTV12() : this;
		case KeyEvent.VK_E:
			Multi t3=new Multi();
	        t3.start();
	        ExaminateTV12.p++;
	        ExaminateTV12.y++;
	        if(ExaminateTV12.y == 3) {
	        	if(ExaminateTV12.p == 2) {
	        		return key.getKeyCode() == KeyEvent.VK_E ? new ChannelWin() : this;
	        	} else if(ExaminateTV12.p < 2) {
	        		return key.getKeyCode() == KeyEvent.VK_E ? new ExaminateTV12() : this;
	        	}
	        }
			return key.getKeyCode() == KeyEvent.VK_E ? new Channel13() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_R ? new Cafeteria12ComeBack() : this;
	}
}

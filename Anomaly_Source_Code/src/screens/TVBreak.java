package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class TVBreak implements Screen {
	 File Clip = new File("TVshatter.WAV");
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
		class Multi extends Thread{
			public void run() {
				try {
					PlaySoundMusic(Clip);
				} catch (Exception e) {
					
				}
			}
		}
		Multi t1=new Multi();
        t1.start();
		System.out.println(this);

		terminal.write("The old TV explodes for unknow reasons...",1,1);
		terminal.write("as glass shaters coming towards you, your throat gets cut",1,2);
		terminal.write("and blood starts pouring out you collapse in the floor of the cafeteria...",1,3);
		terminal.write("slowly you die in your own puddle of blood...",1,4);
		terminal.write("-- Press [Space] to continue --",1,10);
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_SPACE ? new Explanation3() : this;
	}

}

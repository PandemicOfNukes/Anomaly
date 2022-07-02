package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class GasRelease implements Screen {
	 File Clip = new File("cough.WAV");
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

        terminal.write("You start coughing...",1,1);
        terminal.write("Your skin burns...",1,2);
        terminal.write("Your lungs start burning...",1,3);
        terminal.write("After 2 minutes suffering you drop dead in the room...",1,5);
        terminal.write("-- Press [space] to continue --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_SPACE ? new Explanation4() : this;
	}
}
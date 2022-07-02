package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class NuclearBomb1 implements Screen {
    File Clip = new File("nuclear.WAV");
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

		terminal.write("Your eyes get blinded and your eardrums explode*******************************",1,1);
		terminal.write("******************Your skin burns and melts***********************************",1,2);
		terminal.write("**Your flesh gets exposed*****************************************************",1,3);
		terminal.write("*********************Your Organs Burn*****************************************",1,4);
		terminal.write("*****************************************Your bones are the last to go********",1,5);
		terminal.write("******************************************************************************",1,6);
		terminal.write("***************What remains of you is your nuclear shadow in the ground*******",1,7);
		terminal.write("******************************************************************************",1,8);
		terminal.write("******************************************************************************",1,9);
		terminal.write("******************************************************************************",1,10);
		terminal.write("******************************************************************************",1,11);
		terminal.write("*****************You have met a terrible fate haven't you?********************",1,12);
		terminal.write("*************************A voice tells you************************************",1,13);
		terminal.write("******************************************************************************",1,14);
		terminal.write("******************************************************************************",1,15);
		terminal.write("******************************************************************************",1,16);
		terminal.write("******************************************************************************",1,17);
		terminal.write("******************************************************************************",1,18);
		terminal.write("*************-- Press [space] to continue to suffer --************************",1,19);
		terminal.write("*************-- Press [q] for advice --***************************************",1,20);
		terminal.write("******************************************************************************",1,21);
		terminal.write("******************************************************************************",1,22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			PlayScreen2.death = 0;
			return key.getKeyCode() == KeyEvent.VK_SPACE ? new Explanation2() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_Q ? new Advice1() : this;
	}

}

package testeGUi.screens;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import asciiPanel.AsciiPanel;

public class Outside2 implements Screen {
	 File Clip = new File("vaultopen.WAV");
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
	    
	    private static void sleep(long millies) {
			try {
				Thread.sleep(millies);
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted");
				Thread.currentThread().interrupt();
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
        sleep(1750);
		System.out.println(this);
		terminal.write("                                                                              ",1,1,AsciiPanel.red);
		terminal.write("                                                         @                    ",1,2,AsciiPanel.red);
		terminal.write("         @                   @                                                ",1,3,AsciiPanel.red);
		terminal.write("                                           @                                  ",1,4,AsciiPanel.red);
		terminal.write("                    @                                              @          ",1,5,AsciiPanel.red);
		terminal.write("                              @                                               ",1,6,AsciiPanel.red);
		terminal.write("                                                       @                      ",1,7,AsciiPanel.red);
		terminal.write("  |~~~~|                                                                      ",1,8);
		terminal.write("                                                                              ",1,9);
		terminal.write("           		|~~~~~~~~~~~|                 |~~~~~~~~~~~|                   ",1,10);
		terminal.write("                                                                 |~~~~|       ",1,11);
		terminal.write("                                                   |~~~~|                     ",1,12);
		terminal.write("               |~~~~~~~~~|                                                    ",1,13);
		terminal.write("                                                                              ",1,14);
		terminal.write("                  @                                                           ",1,15,AsciiPanel.brightBlack);
		terminal.write("                                                                              ",1,16);
		terminal.write("                                             |~~~~|                           ",1,17);
		terminal.write("                                    @                                         ",1,18);
		terminal.write("______________________________               _________________________________",1,19);
		terminal.write("******************************               *********************************",1,20);
		terminal.write("******************************************************************************",1,21);
		terminal.write("------------------------------------------------------------------------------",1,22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_UP ? new Outside3() : this;
	}
}
package justAReminder;
import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 
  
public class FiveMinutesAgo  
{ 
  
    // to store current position 
    Long currentFrame; 
    static Clip clip; 
      
    // current status of clip 
    String status; 
      
    AudioInputStream audioInputStream; 
    static String filePath; 
  
    // constructor to initialize streams and clip 
    public FiveMinutesAgo() 
        throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException  
    { 
        // create AudioInputStream object 
        audioInputStream =  
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
          
//        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
    public static int NUM_OF_MINS_AGO = 5;
  
    public static void main(String[] args)  
    { 
        try
        { 
        	//enter things like : game, twitter, code, school, tutor, tutorWork etc.
        	Calendar rightNow = Calendar.getInstance();
            filePath = "D:\\downloads\\Voicemod\\Hey_Listen_Louder.wav";  
            int startMinute = rightNow.get(Calendar.MINUTE);
        	int startHour = rightNow.get(Calendar.HOUR_OF_DAY);
            Scanner sc = new Scanner(System.in);
            boolean toggle = true;
            boolean answered = true;
            List<String> stuff = new ArrayList<String>();
            List<Integer> time = new ArrayList<Integer>();
            while (true) 
            {
            	int currentMinute = rightNow.get(Calendar.MINUTE);
            	int currentHour = rightNow.get(Calendar.HOUR_OF_DAY);
            	if(currentMinute%NUM_OF_MINS_AGO==0 && toggle) {
                    FiveMinutesAgo audioPlayer = new FiveMinutesAgo();
                	audioPlayer.play();
                	System.out.println("It's " + currentHour + ":" + currentMinute);
                	System.out.println("What are you doing?");
                	String thing = sc.next();
                	if(thing.equals("END")) {
                		break;
                	}
                	if(stuff.contains(thing)) {
                		int tempNum = time.get(stuff.indexOf(thing)) + 5;
                		time.set(stuff.indexOf(thing), tempNum);
                	}else {
                		stuff.add(thing);
                		time.add(5);
                	}
                	toggle = false;
            	}else if(currentMinute%NUM_OF_MINS_AGO!=0 && !toggle) {
            		toggle = true;
            	}
            } 
            System.out.println("Starting from " + startHour + ":" + startMinute + " this is what you've done :");
            for(int i = 0; i<stuff.size(); i++) {
            	System.out.println(stuff.get(i) + " for " + time.get(i) + " minutes.");
            }
        }  
          
        catch (Exception ex)  
        { 
            System.out.println("Error with playing sound."); 
            ex.printStackTrace(); 
          
        }
        
    } 
      
    // Method to play the audio 
    public void play()  
    { 
        //start the clip 
        clip.start(); 
          
        status = "play"; 
    }
  
} 

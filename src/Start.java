import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import model.Animal;
import model.Song;


public class Start {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int retval ;
		String NextSound = "", SongNumber = "";
	    ArrayList<String> CompleteSong;
		
		// create animal sounds list
	    
	    Animal Frog = new Animal();
	    ArrayList<String> arrlist1 = new ArrayList<String>(Arrays.asList("brr","birip","brrah","croac"));
	    Frog.setAnimalName("Frog");
	    Frog.setArrlist(arrlist1);
	    
	    Animal Dragonfly = new Animal();	    
	    ArrayList<String> arrlist2 = new ArrayList<String>(Arrays.asList("fiu","plop","pep"));
	    Dragonfly.setAnimalName("Dragonfly");
	    Dragonfly.setArrlist(arrlist2);
	    
	    Animal Criket = new Animal();	    
	    ArrayList<String> arrlist3 = new ArrayList<String>(Arrays.asList("cric-cric","trri-trri","bri-bri"));
	    Criket.setAnimalName("Criket");
	    Criket.setArrlist(arrlist3);
	    
	    // Create sound list for all songs
	    
	    Song Song1 = new Song();	    
	    ArrayList<String> arrlist4 = new ArrayList<String>(4);
	    arrlist4.add(Frog.getArrlist().get(0));
	    arrlist4.add(Dragonfly.getArrlist().get(0));
	    arrlist4.add(Criket.getArrlist().get(0));
	    arrlist4.add(Frog.getArrlist().get(2));
	    Song1.setIdSong("1");
	    Song1.setArrlist(arrlist4);
	    
	    Song Song2 = new Song();	    
	    ArrayList<String> arrlist5 = new ArrayList<String>(4);
	    arrlist5.add(Dragonfly.getArrlist().get(2));
	    arrlist5.add(Frog.getArrlist().get(1));
	    arrlist5.add(Criket.getArrlist().get(1));
	    arrlist5.add(Frog.getArrlist().get(3));
	    Song2.setIdSong("2");
	    Song2.setArrlist(arrlist5);
	    
	    Song Song3 = new Song();	    
	    ArrayList<String> arrlist6 = new ArrayList<String>(4);
	    arrlist6.add(Criket.getArrlist().get(2));
	    arrlist6.add(Dragonfly.getArrlist().get(1));
	    arrlist6.add(Criket.getArrlist().get(0));
	    arrlist6.add(Frog.getArrlist().get(2));
	    Song3.setIdSong("3");
	    Song3.setArrlist(arrlist6);	    
	    
	    // Create objects list

	    ArrayList <Song> SongsList= new ArrayList <Song> ();
	    SongsList.add(Song1);
	    SongsList.add(Song2);
	    SongsList.add(Song3);
	    
	    // Console input
	    
	    Scanner sound = new Scanner(System.in);
	    String Sound ="";
	    
	    System.out.println("Write the sound:");
	    Sound = sound.nextLine(); 
	    
	    // Sound search
	    
	    Iterator iter = SongsList.iterator();
	    Song song;
	    Boolean SoundExist = false;
	    
	    for (Object obj : SongsList) {
	    	song = (Song)obj;
	    	
	    	// retrieving the index of sound    
	    	retval = song.getArrlist().indexOf(Sound);
	    	if (retval >= 0) {	    		
		    	if(retval < song.getArrlist().size()-1) {
		    		retval++; // Get the next sound index
		    		NextSound = song.getArrlist().get(retval);
			    	SongNumber = song.getIdSong();
			    	System.out.println("Sound [" + Sound + "]");
			    	System.out.println("Next sound [" + NextSound +"]");
			    	System.out.println("Song Number [" + SongNumber + "]");
			    	SoundExist = true;
				    return;
			    	//CompleteSong = song.getArrlist();
			    } else  {
			    	System.out.println("["+Sound +"] is the last sound!");
			    	SoundExist = true;
			    	return;
			    }
	    	} 
	    }
	    if (SoundExist.equals(false)) {
    		System.out.println("The sound doesn't exist!");
    	}
	    
	    
	    //System.out.println("The complete song is " + song.getArrlist());
	    
	}

}

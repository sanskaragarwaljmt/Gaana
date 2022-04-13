package Gaana;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class PlaySong{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Album> albums = new ArrayList<Album>();
		
	Album album1 = new Album("love","arijit");
	Album album2 = new Album("sad","atif");
	album1.addSong("Ruan Ruan", 4.44);
	album1.addSong("First Class", 5.44);
	album1.addSong(	"Tu Mila To Haina", 3.44);
	album1.addSong("Dil Royi Jaaye",7.44);
	album1.addSong(	"Kaash", 2.44);
	album1.addSong("Ve Maahi", 1.44);
	album2.addSong("Hona Tha Pyar",2.43);
	album2.addSong("Dil Yeh Dancer Hogaya",4.44);
	album2.addSong("Kaho (Aaj Bol Do)",3.56);
	album2.addSong("Us Rah Par",4.30);
	album2.addSong("Dewana Bana Rakha Hai",3.09);
	album2.addSong(	"Mujhe Dil Se Na Bhulana",4.34);
	LinkedList<Song> playList = new LinkedList<Song>();
	album1.addToPlayList(1, playList);
	album1.addToPlayList(3, playList);
	album1.addToPlayList(4, playList);
	album2.addToPlayList("Us Rah Par", playList);
	album2.addToPlayList(2, playList);
	album2.addToPlayList("Dil Yeh Dancer Hogaya", playList);
	albums.add(album1);
	albums.add(album2);
	boolean quit = false;
	boolean forward =true;
	System.out.println("WELCOME TO THE GAANA APP..");
	ListIterator<Song> playing= playList.listIterator();
	if(playList.isEmpty()) {
		System.out.println("YOUR PLAYLIST IIS EMPTY");
	}
	else {
		System.out.println("Now playing " + playing.next());
	}
	getMenu();
	
	while(!quit){
	System.out.println("ENTER UR CHOICE");
	int action = sc.nextInt();
	switch(action) {
	
	case 1:
		if(!forward) {
			if(playing.hasNext()) {
			 playing.next();
			
			}
			forward=true;
		}
		if(playing.hasNext()) {
		System.out.println("Now playing " + playing.next());
	}
	else {
		System.out.println("You are at the end of the playlist!!");
	}
		break;
	case 2:
		if(forward) {
			if(playing.hasPrevious()) {
			 playing.previous();
			
			}
			forward=false;
		}
		
		
		if(playing.hasPrevious()) {
			System.out.println("Now playing " + playing.previous());
		}
		else {
			System.out.println("You are at the starting of the playlist!!");
		}
		break;
	case 3:
		if(forward) {
			if(playing.hasPrevious()) {
			System.out.println("Now playing " + playing.previous());
			forward=false;
			}
			else {
				System.out.println("You at the starting of the Playlist");
			}
		}
		else {
			if(playing.hasNext()) {
				System.out.println("Now playing " + playing.next());
				forward=true;
				}
				else {
					System.out.println("You at the end of the Playlist");
				}
		}
		
		
		break;
	case 4: printList(playList);
		break;
	case 6:
		quit=true;
		break;
	case 5: getMenu();
		break;
		
	}}
	
	
	

	}
	public static void getMenu() {
		
		System.out.println(" PRESS 1 to  Play next song");
		System.out.println(" PRESS 2 to  Play previous song");
		System.out.println(" PRESS 3 to Replay song");
		System.out.println(" PRESS 4 to get list of songs");
		System.out.println(" PRESS 5 to get Menu");
		System.out.println(" PRESS 6 TO Quit");
		
	} 
	public static void printList(LinkedList<Song> list) {
		Iterator<Song> i = list.iterator();
		int count=1;
		System.out.println("====================");
		while(i.hasNext()) {
			
			System.out.println(count + " "+ i.next());
			count++;
		}
		System.out.println("====================");
	}

}

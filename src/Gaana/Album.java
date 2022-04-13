package Gaana;

import java.util.ArrayList; 
import java.util.LinkedList;
public class Album {
private String name;
private String artist;
private ArrayList<Song> songs;

public Album(String name,String artist){
    this.name=name;
    this.artist=artist;
    this.songs = new ArrayList<Song>();
}



private Song findSong(String titleOfSong){
    for(int i=0;i<this.songs.size();i++){
        if(this.songs.get(i).getTitle().equals(titleOfSong)){
            return this.songs.get(i);
        }
    }
    return null;
}
public boolean addSong(String titleOfSong,double duration){
    if(findSong(titleOfSong)==null){
        this.songs.add(new Song(titleOfSong,duration));
        return true;
    }
    return false;
}
public boolean addToPlayList(int number,LinkedList<Song> playList){
    int index=number-1;
    if(index>=0 && index<= this.songs.size()){
        
        playList.add(this.songs.get(index));
        return true;
    }
    return false;
}
public boolean addToPlayList(String titleOfSong,LinkedList<Song> playList){
    Song exsist = findSong(titleOfSong);
if( exsist!=null)
{
    playList.add(exsist);
    return true;
    
}
return false;
}}
package playlist.classes;


import java.util.Arrays;

public class Playlist {
    String name;
    Song[] array = new Song[20];

    public void getName(){
        System.out.println(name);
    }
    Song[] playlist;
    public Playlist(int sizeplaylist){
        if(sizeplaylist <= 0){
            throw new IllegalArgumentException("добавьте больше песен");
        }
        playlist = new Song[sizeplaylist];
        
        
    }
    public void addSong(Song song){
      for(int i = 0; i < playlist.length; i++){
          if(playlist[i] == null) {
              playlist[i] = song;
          }
      }

    }


    public void printPlaylist() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }
    }
}

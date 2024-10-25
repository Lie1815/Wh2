package playlist.Applicationjava;


import playlist.classes.Artist;
import playlist.classes.Playlist;
import playlist.classes.Song;

public class Main {
    public static void main(String[] args) {
        Artist onename = new Artist("irt");
        Artist she = new Artist("dapso");
        Artist onepilots = new Artist(" sahdb");
        Artist wejf = new Artist("quwd");
        Artist ones = new Artist("chsd");

        Song sakf = new Song("iwqhe", "asd", 1);
        Song rwei = new Song("ewefm", "asd", 1);
        Song weg = new Song("eyup", "asd", 1);
        Song wpaq = new Song("etw", "asd", 1);
        Song aql = new Song("ieo", "asd", 1);
        Song fun = new Song("sopc", "asd", 1);
        Song sun = new Song("vjsvn", "asd", 1);

        Playlist hits2020 = new Playlist(5);
        hits2020.addSong(sakf);
        hits2020.addSong(aql);
        hits2020.addSong(aql);
        hits2020.printPlaylist();

    }


}


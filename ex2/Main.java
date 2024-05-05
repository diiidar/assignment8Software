package assignment8Software.ex2;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();
        playlist.addSong(new Song("'Million Dollar Baby'", "Tommy Richman"));
        playlist.addSong(new Song("'Not Like Us'", "Kendrick Lamar"));
        playlist.addSong(new Song("'We Still Don't Trust You'", "Future ft. Metro-Boomin"));

        Iterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}

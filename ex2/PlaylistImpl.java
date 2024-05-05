package assignment8Software.ex2;

import java.util.ArrayList;
import java.util.List;

class PlaylistImpl implements Playlist {
    private List<Song> songs;

    public PlaylistImpl() {
        this.songs = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new SongIterator();
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    // Step 5: Define internal iterator class
    private class SongIterator implements Iterator {
        private int index;

        public SongIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < songs.size();
        }

        @Override
        public Song next() {
            if (hasNext()) {
                Song song = songs.get(index);
                index++;
                return song;
            }
            return null;
        }
    }
}

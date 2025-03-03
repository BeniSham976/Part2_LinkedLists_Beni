package business;

/**
 *
 * @author Beni
 */
public class Song {
    private String artist;
    private String title;

    public Song(){
        this.artist = "Joe Bloggs";
        this.title = "Mmmbop";
    }

    public Song(String artist, String title){
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

     @Override
    public String toString(){
        return "\""+title+"\"" + " by " + artist;
     }
}

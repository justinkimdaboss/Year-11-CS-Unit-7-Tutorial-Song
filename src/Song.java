import java.util.ArrayList;
import java.util.Iterator;

public class Song
{
    private String artist;
    private String title;
    ArrayList<String> yes = new ArrayList<String>();

    public Song(String x, String y)
    {
        this.title = x;
        this.artist = y;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public int howMany(ArrayList<String> x)
    {
        int counter = 0;
        for (String a : x)
        {
            // make every string lower case //
            boolean add = true;
            a = a.toLowerCase();

            for (String y : yes)
            {
                // loop through the comparative arraylist; see if it exists; if so, then no need to add
                if (a.equals(y))
                {
                    add = false;
                }
            }

            if (add)
            {
                yes.add(a);
                counter = counter + 1;
            }
        }
        return counter;
    }
}

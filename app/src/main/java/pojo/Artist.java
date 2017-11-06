package pojo;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.widget.ImageView;

import com.example.mamorky.socialplayer.R;

/**
 * Created by mamorky on 6/11/17.
 */

public class Artist {

    private String artistName;
    private int artistImage;

    public Artist(String artistName, int artistImage) {
        this.artistName = artistName;
        this.artistImage = artistImage;
    }


    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getArtistImage() {
        return artistImage;
    }

    public void setArtistImage(int artistImage) {
        this.artistImage = artistImage;
    }
}

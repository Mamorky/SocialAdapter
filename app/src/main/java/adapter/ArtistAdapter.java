package adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mamorky.socialplayer.R;

import java.util.ArrayList;

import pojo.Artist;
import repositories.AlbumRepository;
import repositories.ArtistRepository;

/**
 * Created by mamorky on 6/11/17.
 */

/**Adapter de Artist */
public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder>{

    private ArrayList<Artist> artists;

    public ArtistAdapter(){
        this.artists = ArtistRepository.getInstance().getArtist();
    }

    @Override
    public ArtistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_artist,null);
        ArtistViewHolder artistViewHolder = new ArtistViewHolder(view);
        return artistViewHolder;
    }

    @Override
    public void onBindViewHolder(ArtistViewHolder holder, int position) {
        Drawable drawable = holder.imgArtist.getResources().getDrawable(artists.get(position).getArtistImage());
        Bitmap bitmap = (((BitmapDrawable)drawable).getBitmap());
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(holder.imgArtist.getResources(),bitmap);
        roundedBitmapDrawable.setCornerRadius(bitmap.getHeight());

        holder.imgArtist.setImageDrawable(roundedBitmapDrawable);
        holder.txvArtistName.setText(artists.get(position).getArtistName());
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }

    public static class ArtistViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgArtist;
        private TextView txvArtistName;

        public ArtistViewHolder(View view){
            super(view);
            imgArtist = (ImageView)view.findViewById(R.id.imgArtist);
            txvArtistName = (TextView)view.findViewById(R.id.txvArtistName);
        }
    }
}

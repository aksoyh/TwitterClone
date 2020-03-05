package com.aksoyh.twitterdemo.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.aksoyh.twitterdemo.R;

import java.util.List;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.ViewHolder> {
    private List<String> values;

    class ViewHolder extends RecyclerView.ViewHolder {
        // her veri öğesi bu durumda sadece bir dizedir
        ImageView ivProfile;
        TextView tvId, tvName, tvTitle, tvDescription;
        ImageButton ibFav, ibReTweet, ibShare;
        View layout;

        ViewHolder(View v) {
            super(v);
            layout = v;
            ivProfile = v.findViewById(R.id.row_item_iv_profile);
            tvId = v.findViewById(R.id.row_item_tv_id);
            tvName = v.findViewById(R.id.row_item_tv_name);
            tvTitle = v.findViewById(R.id.row_item_tv_title);
            tvDescription = v.findViewById(R.id.row_item_tv_description);
            ibFav = v.findViewById(R.id.row_item_ib_fav);
            ibReTweet = v.findViewById(R.id.row_item_ib_retweet);
            ibShare = v.findViewById(R.id.row_item_ib_share);
        }
    }

    // Uygun bir kurucu sağlayın (veri kümesinin türüne bağlıdır)
    TweetAdapter(List<String> myDataset) {
        values = myDataset;
    }

    // Yeni görünümler oluşturma (düzen yöneticisi tarafından çağrılır)
    @Override
    public TweetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // yeni bir görünüm oluştur
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_item, parent, false);
        // görünümün boyutunu, kenar boşluklarını, dolguları ve düzen parametrelerini ayarlama
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Bir görünümün içeriğini değiştirme (düzen yöneticisi tarafından çağrılır)
    @Override
    public void onBindViewHolder(ViewHolder bagla, final int position) {

        // - bu konumdaki veri kümenizden öğe alın
        // - görünümün içeriğini bu öğeyle değiştir
        final String name = values.get(position);
        //bagla.ivProfile.setImageDrawable(bagetDrawable(R.drawable.ic_card_visit));
        bagla.tvId.setText(name);
        bagla.tvName.setText(name);
        bagla.tvTitle.setText(name);
        bagla.tvDescription.setText(name);


    }

    // Veri kümenizin boyutunu döndürme (düzen yöneticisi tarafından çağrılır)
    @Override
    public int getItemCount() {
        return values.size();
    }

}
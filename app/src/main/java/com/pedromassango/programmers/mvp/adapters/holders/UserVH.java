package com.pedromassango.programmers.mvp.adapters.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.pedromassango.programmers.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Pedro Massango on 16/05/2017.
 */

public class UserVH extends RecyclerView.ViewHolder {
    public final TextView tvName;
    public final TextView tvCodelevel;
    public final TextView tvReputation;
    public final TextView tvLanguage;
    public final CircleImageView imgUser;

    public UserVH(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.row_user_tv_username);
        tvLanguage = (TextView) itemView.findViewById(R.id.tv_language);
        tvReputation = (TextView) itemView.findViewById(R.id.tv_reputation);
        tvCodelevel = (TextView) itemView.findViewById(R.id.tv_level);

        imgUser = (CircleImageView) itemView.findViewById(R.id.img_user);
    }
}
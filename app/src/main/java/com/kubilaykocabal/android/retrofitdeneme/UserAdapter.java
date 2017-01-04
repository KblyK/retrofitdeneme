package com.kubilaykocabal.android.retrofitdeneme;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by user on 30.12.2016.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private List<User.Item> userItemList;
    private Context mContext;

    public UserAdapter(List<User.Item> userItemList,Context context){
        this.userItemList= userItemList;
        this.mContext=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.recyclerviewveri,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.userName.setText(userItemList.get(position).getLogin());
        holder.userId.setText(userItemList.get(position).getId() + "");

        String url = userItemList.get(position).getAvatarUrl();
        Picasso.with(mContext).load(url).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.profileImg);
    }

    @Override
    public int getItemCount() {
        return userItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView profileImg;
        public TextView userName;
        public TextView userId;
        public MyViewHolder(View itemView) {
            super(itemView);

            userName = (TextView)itemView.findViewById(R.id.textViewName);
            userId=(TextView)itemView.findViewById(R.id.textViewId);
            profileImg=(ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}

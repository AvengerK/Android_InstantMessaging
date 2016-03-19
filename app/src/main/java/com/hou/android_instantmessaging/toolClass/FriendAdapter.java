package com.hou.android_instantmessaging.toolClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hou.android_instantmessaging.R;
import com.hou.android_instantmessaging.toolClass.Friend;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by 凌霄 on 2016/3/18.
 */
public class FriendAdapter extends ArrayAdapter<Friend> {
    private int resourceId;

    public FriendAdapter(Context context,int textViewResourceId,List<Friend> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Friend friend = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder = new ViewHolder();
            viewHolder.friendName = (TextView)view.findViewById(R.id.friend_name);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.friendName.setText(friend.getName());
//        TextView friendName = (TextView)view.findViewById(R.id.friend_name);
//        friendName.setText(friend.getName());
        return view;
    }

    class ViewHolder{
        TextView friendName;
    }
}

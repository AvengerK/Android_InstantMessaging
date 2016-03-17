package com.hou.android_instantmessaging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by 凌霄 on 2016/3/13.
 */
public class DialogList extends AppCompatActivity {

    private String [] dialog = {"毛泽东","胡锦涛","江泽民","习近平","邓小平","赵紫阳","胡耀邦","华国锋","杨尚昆"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                DialogList.this,android.R.layout.simple_list_item_1,dialog
        );

        ListView listView = (ListView)findViewById(R.id.dialog_list);
        listView.setAdapter(adapter);
    }
}

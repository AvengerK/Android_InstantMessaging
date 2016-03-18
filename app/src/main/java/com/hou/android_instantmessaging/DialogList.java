package com.hou.android_instantmessaging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by 凌霄 on 2016/3/13.
 */
public class DialogList extends AppCompatActivity {

    private String [] dialog = {"蛤蛤","吼啊","资瓷","长者","华莱士","大新闻","谈笑风生","批判","跑得快","西方国家","excited","闷声","发大财","无可奉告","负责任","professor","赛艇","天气晴朗","微小工作","另请高明","念两句诗","历史进程","个人奋斗","不可预料"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                DialogList.this,android.R.layout.simple_list_item_1,dialog
        );

        ListView listView = (ListView)findViewById(R.id.dialog_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

}



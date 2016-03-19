package com.hou.android_instantmessaging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.hou.android_instantmessaging.toolClass.Msg;
import com.hou.android_instantmessaging.toolClass.MsgAdapter;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by 凌霄 on 2016/3/18.
 */
public class Dialog extends AppCompatActivity {
    private ListView msgListView;
    private EditText inputText;
    private Button send;
    private MsgAdapter adapter;
    private List<Msg> msgList = new ArrayList<Msg>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        initMsgs();
        adapter = new MsgAdapter(Dialog.this,R.layout.msg_item,msgList);
        inputText = (EditText)findViewById(R.id.input_message);
        send = (Button)findViewById(R.id.message_send);
        msgListView = (ListView)findViewById(R.id.dialog_message_list_view);
        msgListView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if(!"".equals(content)){
                    Msg msg = new Msg(content,Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();
                    msgListView.setSelection(msgList.size());
                    inputText.setText("");
                }
            }
        });
    }

    private void initMsgs(){
        Msg msg1 = new Msg("董先森当特首吼不吼啊？",Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("吼啊!",Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3 = new Msg("中央也支持他吗?",Msg.TYPE_RECEIVED);
        msgList.add(msg3);
        Msg msg4 = new Msg("当然啦！",Msg.TYPE_SENT);
        msgList.add(msg4);
    }

}

package com.example.day02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import Bean.TTBean;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private MyAdapter adpater;
    private List<TTBean.DataBean.PcFeedFocusBean> focus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        readFile();
    }

    private void readFile() {

        new Thread(
                new Runnable() {

                    private String s;

                    @Override
                    public void run() {

                        String path = "http://www.toutiao.com/api/pc/focus/";

                        try {
                            URL url = new URL(path);

                            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                            connection.setRequestMethod("GET");
                            connection.setConnectTimeout(5000);
                            connection.setReadTimeout(5000);

                            int responseCode = connection.getResponseCode();

                            if(responseCode == 200){

                                InputStream inputStream = connection.getInputStream();


                                byte[] buffer = new byte[1024];
                                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                                int len;

                                while((len = inputStream.read(buffer))!=-1){
                                    outputStream.write(buffer,0,len);
                                }

                                s = outputStream.toString();
                            }

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    Gson gson = new Gson();

                                    TTBean ttBean = gson.fromJson(s, TTBean.class);

                                    focus = ttBean.getData().getPc_feed_focus();

                                    adpater = new MyAdapter();
                                    lv.setAdapter(adpater);
                                }
                            });
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        ).start();
    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return focus.size();
        }

        @Override
        public Object getItem(int position) {
            return focus.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = View.inflate(MainActivity.this,R.layout.item,null);

            TextView tv = (TextView) convertView.findViewById(R.id.tv);
            ImageView iv = (ImageView) convertView.findViewById(R.id.iv);

            tv.setText(focus.get(position).getTitle());
            ImageLoader.getInstance().displayImage("http:"+focus.get(position).getImage_url(),iv);
            return convertView;
        }
    }
}

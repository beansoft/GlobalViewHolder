package cn.yubo.testviewholder;

import cn.yubo.testviewholder.adapter.MyListViewAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new MyListViewAdapter(this));
    }
    
}

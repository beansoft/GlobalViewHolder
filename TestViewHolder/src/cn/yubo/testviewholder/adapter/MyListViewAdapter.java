package cn.yubo.testviewholder.adapter;

import cn.yubo.testviewholder.R;
import cn.yubo.testviewholder.utils.ViewHolder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListViewAdapter extends BaseAdapter {
	private Context context;
	private String[] titles = new String[20];
	private String[] subtitles = new String[20];
	
	public MyListViewAdapter(Context context){
		this.context = context;
		for(int i = 0; i < 20; i++){
			titles[i] = new String("这是标题" + i);
			subtitles[i] = new String("子标题" + i);
		}
	}

	public int getCount() {
		return titles.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
		}
		ImageView img = ViewHolder.get(convertView, R.id.item_img);
		TextView title = ViewHolder.get(convertView, R.id.item_title);
		TextView subtitle = ViewHolder.get(convertView, R.id.item_sub_title);
		img.setImageResource(R.drawable.ic_launcher);
		title.setText(titles[position]);
		subtitle.setText(subtitles[position]);
		return convertView;
	}

}

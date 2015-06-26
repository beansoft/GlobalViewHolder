package cn.yubo.testviewholder.utils;

import android.util.SparseArray;
import android.view.View;

public class ViewHolder {

	@SuppressWarnings("unchecked")
	public static <T extends View> T get(View view, int id){
		//��convertView�л�ȡtag��SparseArray������View��View��Ӧ��id��ͨ��View��id������View
		SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
		//�����ȡ�������򴴽�SparseArray���󣬲���SparseArray�������convertView��tag��
		if(viewHolder == null){
			viewHolder = new SparseArray<View>();
			view.setTag(viewHolder);
		}
		//ͨ��View��id����ȡView����SparseArray���ڲ�ʹ�õ��۰����
		View childView = viewHolder.get(id);
		//�����SparseArray��û�ж�Ӧ��id����ͨ��findViewById����ȡView
		if(childView == null){
			childView = view.findViewById(id);
			//����ȡ����View����View��Ӧ��id����SparseArray��
			viewHolder.put(id, childView);
		}
		//����ֵ�Ƿ����ĵڶ�������id��Ӧ��View
		return (T) childView;
	}
}

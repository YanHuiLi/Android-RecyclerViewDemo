package android.archer.com.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 适配RecycleView的Adapter
 * Created by Archer on 2016/3/25.
 */
class MyAdapter extends RecyclerView.Adapter {

    class ViewHolder extends RecyclerView.ViewHolder {


        private View root;
        //一个标题一个内容
        private TextView  tvTitle,tvContent;


        //viewHolder当中绑定一个子对象的视图

        public ViewHolder(View root) {
            super(root);

            //获取控件
            tvTitle= (TextView) root.findViewById(R.id.tvTitle);
            tvContent= (TextView) root.findViewById(R.id.TvContent);
        }

        public TextView getTvContent() {
            return tvContent;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        //用布局解释器来创建对象
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        //赋值textView
        ViewHolder vh = (ViewHolder) viewHolder;
       //配置数据
        CellData cd=data[position];
        vh.getTvTitle().setText(cd.title);
        vh.getTvContent().setText(cd.content);
    }

    //子对象的数目，比如 return 10 就是有十个子对象
    @Override
    public int getItemCount() {
        return data.length;
    }

    //用数据呈现出来，写一个数组

//    private String[] data = new String[]{"Hello", "RecyclerView", "Archer"};

    //建立一个celldata的数组
    private CellData[] data=new CellData[]{new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("极客学院","IT职业教育")};

}

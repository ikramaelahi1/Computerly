package com.example.computerly;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<dataViewHolder>{

    private Context mContext;
    private List<data> myDataList;


    public MyAdapter(Context mContext, List<data> myDataList) {
        this.mContext = mContext;
        this.myDataList = myDataList;
    }

    @Override
    public dataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_item,viewGroup, false);


        return new dataViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final dataViewHolder dataViewHolder, final int i) {

        dataViewHolder.imageView.setImageResource(myDataList.get(i).getItemImage());
        dataViewHolder.mTitle.setText(myDataList.get(i).getItemTitle());
        dataViewHolder.mDescription.setText(myDataList.get(i).getItemDescription());

        dataViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,detailActivity.class);
                intent.putExtra("Image",myDataList.get(dataViewHolder.getAdapterPosition()).getItemImage());
                intent.putExtra("Description",myDataList.get(dataViewHolder.getAdapterPosition()).getItemDescription());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myDataList.size();
    }
}
class dataViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView mTitle,mDescription;
    CardView mCardView;

    public dataViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);
        mCardView = itemView.findViewById(R.id.myCardView);

    }
}

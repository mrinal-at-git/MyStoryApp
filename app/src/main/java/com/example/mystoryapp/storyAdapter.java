package com.example.mystoryapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class storyAdapter extends RecyclerView.Adapter<storyAdapter.myViewHolder> {

   private LayoutInflater layoutInflater;
   private String [] sTitles;
   private String [] sContent;

    storyAdapter(Context context, String [] titles,  String [] content){

        this.layoutInflater = LayoutInflater.from(context);
        this.sTitles = titles;
        this.sContent = content;

    }



    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.custom_view, parent, false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        String a = sTitles[position];
        String b = sContent[position];
        holder.title.setText(a);
        holder.description.setText(b);

    }

    @Override
    public int getItemCount() {
        return sTitles.length;
    }




    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView title, description;

                                       // View object in myViewHolder() call in onCreateViewHolder will be passed here in itemView (it's of same type - View)
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(v.getContext(), Details.class);
                    i.putExtra("title",sTitles[getAdapterPosition()]);
                    i.putExtra("content", sContent[getAdapterPosition()]);
                    v.getContext().startActivity(i);

                }
            });

            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }
}

package com.example.udemycourse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Projectadaptor extends RecyclerView.Adapter<Projectadaptor.projectviewholder> {

    private final RecyclerViewInterface recyclerViewInterface;

    private Resources[] resource;


    public Projectadaptor(Resources[] resource, RecyclerViewInterface recyclerViewInterface) {
        this.resource = resource;
        this.recyclerViewInterface=recyclerViewInterface;
    }

    @Override
    public int getItemCount() {
        return resource.length;
    }

    @NonNull
    @Override
    public projectviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resource_type,parent,false);
        return new projectviewholder(view,recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull projectviewholder holder, int position) {
    holder.Bind(resource[position]);
    }


    static  class projectviewholder extends  RecyclerView.ViewHolder{

        ImageView appImage;
        TextView resource_Type;
        TextView Tips;



        public projectviewholder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            appImage = itemView.findViewById(R.id.resource_icon);
            resource_Type = itemView.findViewById(R.id.name_of_resource);
            Tips = itemView.findViewById(R.id.Pro_tip);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recyclerViewInterface != null){
                        int pos;
                        pos = getBindingAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.OnItemClick(pos);
                        }
                    }
                }
            });


        }
        public void Bind(Resources resource){
            resource_Type.setText(resource.resourceType);
            Tips.setText(resource.tips);
            appImage.setImageResource(resource.image);

        }
    }

}

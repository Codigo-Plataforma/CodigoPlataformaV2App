package com.example.codigoplataformav2.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.codigoplataformav2.Dashboard.LandingPage;
import com.example.codigoplataformav2.R;
import java.util.ArrayList;


public class Recyclerview_adapter extends RecyclerView.Adapter<Recyclerview_adapter.Horizontal_Viewholder> {

    ArrayList<Domain_recyclerview_datamodel> domain_names;
    String[] domainNames;

    public Recyclerview_adapter(String[] domain_names, LandingPage landingPage) {
        this.domainNames = domain_names;
    }

    //here i dont know how it worked but it fetches data which i provided in the datamodel which itself got data from landing page.java

    public Recyclerview_adapter(ArrayList<Domain_recyclerview_datamodel> domain_names, LandingPage landingPage) {
        this.domain_names = domain_names;
    }

    @NonNull
    @Override
    public Horizontal_Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cardview_for_domain_section, parent, false);
        return new Horizontal_Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Horizontal_Viewholder holder, int position) {
        holder.name.setText(domainNames[position]);
    }

    @Override
    public int getItemCount() {
        return domainNames.length;
    }

    public static class Horizontal_Viewholder extends RecyclerView.ViewHolder{
        TextView name;
        public Horizontal_Viewholder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.domain_name);
        }
    }
}

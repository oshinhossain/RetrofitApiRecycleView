package com.example.retrofitapirecycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//recyclerview add korace
//first Adapter name class create korbo data adapt korar jono then

//MyViewHolder name aro akta class create korbo
//then akta view create korbo jar name diace (cardView)




public class MainActivity extends AppCompatActivity {
    RecyclerView recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle=findViewById(R.id.recycle);

        listingdata();
        LinearLayoutManager llm=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recycle.setLayoutManager(llm);
    }

    private void listingdata() {
        ApiInterface apIinterface=Retrofit.getRetrofit().create(ApiInterface.class);
        Call<pojo>listingdata=apIinterface.getData();

        listingdata.enqueue(new Callback<pojo>() {
            @Override
            public void onResponse(Call<pojo> call, Response<pojo> response) {
                if(response.isSuccessful())
                {
                    recycleadapter adapter=new recycleadapter(response.body().getData());
                    recycle.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<pojo> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failure",Toast.LENGTH_LONG).show();

            }
        });
    }

//constructor creat her

    class recycleadapter extends RecyclerView.Adapter<recycleadapter.MyViewHolder>{
        List<pojo.Datum>list;

        public recycleadapter(List<com.example.retrofitapirecycleview.pojo.Datum>list){
            this.list =list;

        }



        @NonNull
        @Override
        public recycleadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,null);
            recycleadapter.MyViewHolder viewHolder=new recycleadapter.MyViewHolder(view);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull recycleadapter.MyViewHolder holder, int position) {
            holder.email.setText(list.get(position).getEmail());
            holder.fstname.setText(list.get(position).getFirstName());
            holder.lstname.setText(list.get(position).getLastName());

            Picasso.with(getApplicationContext())
                    .load(list.get(position).getAvatar())
                    .placeholder(R.drawable.ic_launcher_background)
                    .fit()
                    .into(holder.image);


        }

        @Override
        public int getItemCount() { return list.size();}

        class MyViewHolder extends RecyclerView.ViewHolder{

            TextView fstname,userid,lstname,email;
            ImageView image;


            public MyViewHolder(@NonNull  View itemView) {
                super(itemView);
                email=itemView.findViewById(R.id.email);
                fstname=itemView.findViewById(R.id.fstname);
                lstname=itemView.findViewById(R.id.lstname);
                userid=itemView.findViewById(R.id.userid);
                image=itemView.findViewById(R.id.image);

            }
        }
    }
}
package com.example.prak4;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prak4.Film;
import com.example.prak4.R;

import java.util.ArrayList;

public class FilmAdapter extends
        RecyclerView.Adapter<FilmAdapter.FilmViewHolder>{
    private ArrayList<Film> dataList;
    public FilmAdapter(ArrayList<Film> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public FilmAdapter.FilmViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_film, parent, false);
        return new FilmViewHolder(view);
    }
    public void onBindViewHolder(FilmViewHolder holder, int
            position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtTahun.setText(dataList.get(position).getTahun());

        holder.txtGenre.setText(dataList.get(position).getGenre());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class FilmViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtJudul, txtTahun, txtGenre;
        private ImageView Foto;
        public FilmViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtJudul = (TextView)
                    itemView.findViewById(R.id.txt_judul);
            txtTahun = (TextView)
                    itemView.findViewById(R.id.txt_tahun);
            txtGenre = (TextView)
                    itemView.findViewById(R.id.txt_genre);
        }
    }
}

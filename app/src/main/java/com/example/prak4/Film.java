package com.example.prak4;
public class Film {
        private String judul,tahun,genre;
        private int foto;
        public Film(String judul, String tahun, String genre, int foto){
            this.judul = judul;
            this.tahun = tahun;
            this.genre = genre;
            this.foto = foto;
        }

        public String getJudul(){
            return judul;
        }
        public void setJudul(String judul){
            this.judul = judul;
        }
        public String getTahun(){
            return tahun;
        }
        public void setTahun(String tahun){
            this.tahun = tahun;
        }
        public String getGenre(){
            return genre;
        }
        public void setGenre(String genre){
            this.genre = genre;
        }

        public int getFoto() { return foto; }
        public void setFoto(int foto) { this.foto = foto; }
    }

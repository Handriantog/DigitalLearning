package com.a201381061.digitallearning.Model;

import java.io.Serializable;

/**
 * Created by UserModel on 7/1/2017.
 */

public class PostModel implements Serializable {

    private String judul;
    private String kategori;
    private String isi;
    private String userId;
    private String postId;

    public PostModel() {
    }

    public PostModel(String judul, String kategori, String isi, String userId,String postId) {
        this.judul = judul;
        this.kategori = kategori;
        this.isi = isi;
        this.userId = userId;
        this.postId = postId;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}

package com.example.floresproyecto;

public class ItemList {
    private String titulo;
    private String descripcion;
    private String codigo;
    private int imgResource;

    public ItemList(String titulo, String descripcion,String codigo,int imgResource){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.codigo=codigo;
        this.imgResource=imgResource;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getCodigo(){
        return codigo;
    }

    public int getImgResource(){
        return imgResource;
    }
}

package com.example.joel_mora.joelmorauala.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class LibroBean implements Parcelable{
    private String id;
    private String nombre;
    private String autor;
    private String disponibilidad;
    private String popularidad;
    private String imagen;

    public LibroBean(){
    }

    public LibroBean(String id, String nombre, String autor, String disponibilidad, String popularidad, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
        this.popularidad = popularidad;
        this.imagen = imagen;
    }

    protected LibroBean(Parcel in) {
        id = in.readString();
        nombre = in.readString();
        autor = in.readString();
        disponibilidad = in.readString();
        popularidad = in.readString();
        imagen = in.readString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public static final Creator<LibroBean> CREATOR = new Creator<LibroBean>() {
        @Override
        public LibroBean createFromParcel(Parcel in) {
            return new LibroBean(in);
        }

        @Override
        public LibroBean[] newArray(int size) {
            return new LibroBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(nombre);
        dest.writeString(autor);
        dest.writeString(disponibilidad);
        dest.writeString(popularidad);
        dest.writeString(imagen);
    }
}

package com.example.listview____;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Objeto {
    private String nombre;
    private int imagenId;

    public Objeto(String nombre, int imagenId) {
        this.nombre = nombre;
        this.imagenId = imagenId;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagenId() {
        return imagenId;
    }
}
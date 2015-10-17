package com.example.diegovitalesmedellin.lectorqr;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DataSource
{

    static List<Tarea> TAREAS = new ArrayList<Tarea>();

    static
    {

        TAREAS.add(new Tarea("Mesa inteligente","Proyecto final",R.drawable.ic_school_black_24dp));
        TAREAS.add(new Tarea("Robots de Soccer","Concurso",R.drawable.ic_settings_black_24dp));
        TAREAS.add(new Tarea("Inteligencia artificial","Exposicion",R.drawable.ic_hearing_black_24dp));

    }

}

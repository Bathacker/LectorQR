package com.example.diegovitalesmedellin.lectorqr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainLista extends Activity implements AdapterView.OnItemClickListener {

    ListView lista;
    ArrayAdapter adaptador;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista);

        //Instancia del ListView
        lista = (ListView)findViewById(R.id.lista);

        //Inicializar el adaptador con la fuente de datos
        adaptador = new TareaArrayAdapter(this, DataSource.TAREAS);

        //Relacionando la lista con el adaptador
        lista.setAdapter(adaptador);

        //Estableciendo la escucha
        lista.setOnItemClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            Intent n = new Intent(this, MainActivity.class);
            startActivity(n);
            //Limpiar todos los elementos
            adaptador.clear();
            return true;

        }

        if (id == R.id.creditos)
        {

            msg = "Hecho por: Diego Vitales Medellín";
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Tarea tareaActual = (Tarea)adaptador.getItem(position);
        String msg = "Elegiste:\n"+tareaActual.getNombre()+"-"+tareaActual.getHora();
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

        if(tareaActual.getNombre().equals("Matemáticas"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "https://www.youtube.com/watch?v=sEUriytWfno";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Historia"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "https://www.youtube.com/watch?v=q0a0NRbwZcQ";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Formación Cívica y Ética"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "https://www.youtube.com/watch?v=sQ_DWG34UOE";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Español"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "https://www.youtube.com/watch?v=RS0Pk-uN9io";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Física"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "https://www.youtube.com/watch?v=TbB-qfWwV3E";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Computación"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "https://www.youtube.com/watch?v=7RfCuR99JEg";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Ingles"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "http://www.tolearnenglish.com/exercises/exercise-english-2/exercise-english-40304.php ";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Taller de Música"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "https://www.youtube.com/watch?v=D9vhtVt47HQ";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

        if(tareaActual.getNombre().equals("Calificaciones"))
        {

            Intent i = new Intent(Intent.ACTION_VIEW);
            String url = "http://www.conevyt.org.mx/cursos/cursos/numhogar/imagenes10/c2.gif";
            i.setData(Uri.parse(url));
            startActivity(i);

        }

    }

}

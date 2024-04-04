package com.example.practico3l_l;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private MutableLiveData<List<Pelicula>> listaPeliculas;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        listaPeliculas = new MutableLiveData<>();
        inicializarListaPeliculas();
    }

    public LiveData<List<Pelicula>> getListaPeliculas() {
        return listaPeliculas;
    }

    private void inicializarListaPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();

        List<String> actoresArrival = Arrays.asList("Enzo Vogrincic", "Agustín Pardella", "Matías Recalt");
        peliculas.add(new Pelicula("La Sociedad de la Nieve", actoresArrival,
                "El vuelo de un equipo de rugby se estrella en un glaciar de los Andes. " +
                        "Los pocos pasajeros que sobreviven al accidente se encuentran en uno de los " +
                        "entornos más difíciles del mundo para sobrevivir.",

                "J.A. Bayona", R.drawable.sociedadnieve));

        List<String> actoresDeadPoetsSociety = Arrays.asList("Marlon Brando", "Al Pacino James Caan");
        peliculas.add(new Pelicula("El Padrino", actoresDeadPoetsSociety,
                "El envejecido patriarca de una dinastía del crimen organizado en " +
                        "la ciudad de Nueva York de la posguerra transfiere el control de su imperio clandestino a su reacio hijo menor.",
                "Francis Ford Coppola", R.drawable.elpadrino));

        List<String> actoresNerve = Arrays.asList("Christian Bale", "Heath Ledger Aaron Eckhart");
        peliculas.add(new Pelicula("El caballero oscuro", actoresNerve,
                "Cuando la amenaza conocida como el Joker causa estragos y " +
                        "el caos en Gotham City, Batman debe aceptar una de las mayores pruebas psicológicas y físicas para luchar contra la injusticia.",
                "Christopher Nolan", R.drawable.batman));


        listaPeliculas.setValue(peliculas);
    }
}

package com.ale.Peliculas.Service;


import com.ale.Peliculas.Repository.IPeliculaRepository;
import com.ale.Peliculas.Entity.Pelicula;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class PeliculasService {
    private Pelicula pelicula1= new Pelicula(1L,"Wicked",2025);
    private Pelicula pelicula2= new Pelicula(2L,"Cars",2006);
    private List<Pelicula> peliculas= new ArrayList<>();

//    public PeliculasService(){
//
//    }

    private final IPeliculaRepository iPeliculaRepository;


    public PeliculasService(IPeliculaRepository iPeliculaRepository) {
        this.iPeliculaRepository = iPeliculaRepository;
    }
    public Pelicula buscarId(Long id){

        Pelicula peliculaBuscamos=null;

        for (Pelicula pelicula : peliculas) {
            if(pelicula.getId().equals(id)){
                peliculaBuscamos=pelicula;
            }
        }
        return peliculaBuscamos;

    }

    public List<Pelicula> listar(){
        peliculas.addAll(Arrays.asList(pelicula1,pelicula2));
        return peliculas;
    }

    public boolean crear (Pelicula pelicula){
        peliculas.add(pelicula);
       return true;
    }


    public boolean eliminar(Long id){
    return peliculas.removeIf(pelicula -> pelicula.getId().equals(id));
    }

}


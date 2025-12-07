package com.ale.Peliculas.Controller;

import com.ale.Peliculas.Entity.Pelicula;
import com.ale.Peliculas.Service.PeliculasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculasController {

    public PeliculasController(PeliculasService peliculasService) {
        this.peliculasService = peliculasService;
    }

    private final PeliculasService peliculasService;

    @GetMapping ("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable Long id){
        Pelicula peliculaBuscado= peliculasService.buscarId(id);
        if(peliculaBuscado !=null){
            return ResponseEntity.status(200).body(peliculaBuscado);
        }else{return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        List<Pelicula> peliculas= peliculasService.listar();
        if(peliculas.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(peliculas);

    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Pelicula pelicula){

        boolean peliculaNuevo= peliculasService.crear(pelicula);
        if(peliculaNuevo) return ResponseEntity.status(201).body(pelicula);
        else return ResponseEntity.badRequest().build();

    }

    @DeleteMapping
    public ResponseEntity<?> eliminar(@RequestParam Long id){
        boolean elimina= peliculasService.eliminar(id);
        if(elimina) return ResponseEntity.status(200).body("fue elminado.");
        else return ResponseEntity.status(404).body("No existe ese id. ");

    }




}

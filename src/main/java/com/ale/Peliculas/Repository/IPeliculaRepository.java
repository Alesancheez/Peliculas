package com.ale.Peliculas.Repository;

import com.ale.Peliculas.Entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {
}

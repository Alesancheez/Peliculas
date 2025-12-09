package com.ale.Peliculas.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")

public class Pelicula {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String titulo;
    private Integer anio;

    public Pelicula() {
    }

    public Pelicula(Long id, String titulo, Integer anio) {
        this.id = id;
        this.anio = anio;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}

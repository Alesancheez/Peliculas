const contenedorCartas= document.getElementById("container-card")
const url="https://peliculas-h91q.onrender.com/peliculas"
//console.log(contenedorCartas);


window.addEventListener('load', ()=>{
    listarPeliculas()
})


function listarPeliculas() {

    settings={
        method:'GET',
      //  headers:{'Content-Type':'application/json' }
    }
    fetch(url, settings )
    .then(response => {if( ! response.ok ){
    throw new Error("error")
    }
     return response.json()
    })
    .then( peliculas => renderizar(peliculas) )
    .catch(error => console.log(error)  );


}


function renderizar(peliculasGet) {
    let lista=[]
    peliculasGet.forEach(pelicula => {
         let templateString= `<div class=“card” > <h4>${pelicula.titulo }</h4>
         <p> ${pelicula.anio} </p> </div>`
         lista.push(templateString)
        }
);
      contenedorCartas.innerHTML = lista
}

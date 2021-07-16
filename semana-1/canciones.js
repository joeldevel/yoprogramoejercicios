let canciones = [
  {"titulo": "cancion a", "duracion":120, "autor":"cantante a", "genero": "genero a"},
  {"titulo": "cancion b", "duracion":110, "autor":"cantante a", "genero": "genero a"},
  {"titulo": "cancion c", "duracion":100, "autor":"cantante b", "genero": "genero b"},
  {"titulo": "cancion d", "duracion":90,  "autor":"cantante c", "genero": "genero b"},
  {"titulo": "cancion e", "duracion":130, "autor":"cantante b", "genero": "genero b"},
  {"titulo": "cancion f", "duracion":140, "autor":"cantante c", "genero": "genero b"},
  {"titulo": "cancion g", "duracion":150, "autor":"cantante c", "genero": "genero b"},
  {"titulo": "cancion h", "duracion":160, "autor":"cantante e", "genero": "genero c"},
  {"titulo": "cancion i", "duracion":100, "autor":"cantante f", "genero": "genero d"}
];

const lista = document.querySelector('.lista-body');
canciones.forEach(cancion=>{
  const row = document.createElement('tr');
  row.innerHTML = `<td>${cancion.titulo}</td>
<td>${cancion.autor}</td>
<td>${cancion.duracion}</td>
<td>${cancion.genero}</td>`;
  lista.appendChild(row);
})


// total 1100 segundos ~ 18 min ~ 1/3 hora
// console.log(canciones);
// let horasMusica = canciones.reduce((acc, obj) => acc + obj.duracion, 0) / 3600;
//version larga
//setear el acumulador de horas(segundos)
let horasMusica = 0;
// recorrer la coleccion
for(let i=0; i<canciones.length; i++) {
  //actualizar la cantidad de segundos
  horasMusica += canciones[i].duracion;
}
// transformar los segundos en horas
horasMusica/= 3600;
console.log("hora musica",horasMusica);

// arranco haciendo que la cancion mas larga sea la primera
let cancionMasLarga = canciones[0];
for(let i=1; i<canciones.length; i++) {
  //recorro la coleccion
  if( canciones[i].duracion > cancionMasLarga.duracion) {
    // si la cancion actual es mas larga, actualizo la cancionMasLarga
    cancionMasLarga = canciones[i];
  }
}
console.log("cancion mas larga",cancionMasLarga.titulo); // cancion h

//contar canciones por genero
//crear un set
let generos = new Set();
// obtener los generos
for (let i = 0; i < canciones.length; i++) {
  generos.add(canciones[i].genero);
}
// console.log(generos);


let cancionesPorGenero = [];
// dar valores iniciales
generos.forEach(genero=>cancionesPorGenero.push({"genero": genero, "cantidad":0}));

// recorrer el arry de canciones
for(let i=0; i< canciones.length; i++) {
  // por cada cancion comparar con el array de cancionesPorGenero
  for(let j=0; j< cancionesPorGenero.length; j++) {
    // incrementar la cantidad de canciones
    if(canciones[i].genero === cancionesPorGenero[j].genero) {
      cancionesPorGenero[j].cantidad ++;
    }
  }
}

console.log("Canciones por genero")
console.table(cancionesPorGenero);


//contar canciones por autor

//crear un set
let autores = new Set();
// obtener los autores
for (let i = 0; i < canciones.length; i++) {
  autores.add(canciones[i].autor);
}
// console.log(autores);


let cancionesPorAutor = [];
// dar valores iniciales
autores.forEach(autor=>cancionesPorAutor.push({"autor": autor, "cantidad":0}));


// recorrer el arry de canciones
for(let i=0; i< canciones.length; i++) {
  // por cada cancion comparar con el array de cancionesPorAutor
  for(let j=0; j< cancionesPorAutor.length; j++) {
    // incrementar la cantidad de canciones
    if(canciones[i].autor === cancionesPorAutor[j].autor) {
      cancionesPorAutor[j].cantidad ++;
    }
  }
}
console.log("Canciones por autor");
console.table(cancionesPorAutor);

// autor con mas canciones
//inicio pensando que el primer autor tiene mas canciones
let autorConMasCanciones = cancionesPorAutor[0];
// recorro el array
for(let i=1; i<cancionesPorAutor.length; i++) {
  // comparo la cantidad de canciones de cada autor con la
  // cantidad de canciones del actual
  if( cancionesPorAutor[i].cantidad > autorConMasCanciones.cantidad) {
    // actualizo el autor
    autorConMasCanciones = cancionesPorAutor[i];
  }
}

console.log("autor con mas canciones:",autorConMasCanciones.autor);

const siguiente = document.getElementById('siguiente');
const anterior = document.getElementById('anterior');
const limite = 20;
let pagina = 0;
let cantidad;


function generar() {
    fetch(`https://pokeapi.co/api/v2/pokemon/?limit=${limite}&offset=${pagina * limite}`)
        .then(respuesta => respuesta.json())
        .then(datos => {
            cantidad = datos.count;
            crear_botones(datos)
        })
}


generar();


function paginador(avance) {
    if (avance) {
        if(avance < cantidad){
            pagina++;
        }
    } else {
        if(pagina > 0){
            pagina--;   
        } 
    } 
    generar();
    
}


function crear_botones(datos) {

    const contenedor_botones = document.getElementById('contenedor_botones');
    contenedor_botones.innerHTML = '';
    let primer_elemento = true;
    datos.results.forEach(pokemon => {
        const boton = document.createElement('button');
        boton.innerText = pokemon.name;
        boton.setAttribute('class', 'btn border border-1 border-black m-1 btn-estilo');
        boton.addEventListener('click', () => {
            mostrar(pokemon.url)
        });
        contenedor_botones.appendChild(boton);
        if (primer_elemento) {
            mostrar(pokemon.url)
            primer_elemento = false;
        }
    });
}


function mostrar(url) {

    const img_pokemon = document.getElementById("img_pokemon");
    const nombre = document.getElementById("nombre");
    img_pokemon.innerHTML = '';
    nombre.innerHTML = '';
    fetch(url)
        .then(respuesta => respuesta.json())
        .then(pokemon => {
            img_pokemon.src = pokemon.sprites.other["official-artwork"].front_default;
            nombre.innerHTML = pokemon.name;
        });
}
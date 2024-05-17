const tabla = document.getElementById("info_usuarios")

function obtener() {
    fetch('https://codetesthub.com/API/Obtener.php')
        .then(respuestas => respuestas.json())
        .then(datos => {
            datos.forEach(usuario => {
                const fila = document.createElement('tr')
                for (let clave in usuario) {
                    let valor = usuario[clave]
                    const columna = document.createElement('td')
                    columna.textContent = (valor)
                    fila.appendChild(columna)
                }

                const td_editar = document.createElement('td')
                const boton_editar = document.createElement('button')
                boton_editar.classList.add('btn', 'btn-success');
                boton_editar.textContent = 'Editar'
                td_editar.appendChild(boton_editar)
                
                const td_eliminar = document.createElement('td')
                const boton_eliminar = document.createElement('button')
                boton_eliminar.classList.add('btn', 'btn-danger');
                boton_eliminar.textContent = 'Eliminar'
                td_eliminar.appendChild(boton_eliminar)

                fila.appendChild(td_editar)
                fila.appendChild(td_eliminar)

                tabla.appendChild(fila)
            });
        })
}


obtener()

function insertar() {

    let datos = new FormData();

    datos.append("cedula", 1231231230);
    datos.append("nombres", "Cristian");
    datos.append("apellidos", "Arce");
    datos.append("telefono", "1231231230");
    datos.append("direccion", "Samaria 1");
    datos.append("email", "cristian@gmail.com");

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json"
        },
        body: datos,
    };

    fetch("https://codetesthub.com/API/Insertar.php", configuracion)
        .then(res => res.json())
        .then(data => {
            console.log('Respuesta JSON del servidor:');
            console.log(data);
        });
}



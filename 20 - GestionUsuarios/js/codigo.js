function obtener() {
    fetch('https://codetesthub.com/API/Obtener.php')
        .then(response => response.json())
        .then(datos => {
            datos.forEach(usuario => {
                const cedula = usuario.cedula;
                const nombres = usuario.nombres;
                const apellidos = usuario.apellidos;
                const telefono = usuario.telefono;
                const direccion = usuario.direccion;
                const email = usuario.email;
                const foto = usuario.foto;

                generarCarta(cedula, nombres, apellidos, telefono, direccion, email, foto);
            });
        });
}

function generarCarta(cedula, nombres, apellidos, telefono, direccion, email, foto) {
    const carta = document.createElement('div');
    carta.className = 'card';

    const imagen = document.createElement('img');
    imagen.className = 'card_img';
    imagen.src = "img/usuario.png";
    carta.appendChild(imagen);

    const cuerpoCarta = document.createElement('div');
    cuerpoCarta.className = 'card-body';

    const titulo = document.createElement('h5');
    titulo.className = 'card-title';
    titulo.textContent = nombres + " " + apellidos
    cuerpoCarta.appendChild(titulo);

    const cedulaParagraph = document.createElement('p');
    cedulaParagraph.className = 'card-text';
    cedulaParagraph.textContent = `Cédula: ${cedula}`;
    cuerpoCarta.appendChild(cedulaParagraph);


    const telefonoParagraph = document.createElement('p');
    telefonoParagraph.className = 'card-text';
    telefonoParagraph.textContent = `Teléfono: ${telefono}`;
    cuerpoCarta.appendChild(telefonoParagraph);

    const direccionParagraph = document.createElement('p');
    direccionParagraph.className = 'card-text';
    direccionParagraph.textContent = `Dirección: ${direccion}`;
    cuerpoCarta.appendChild(direccionParagraph);

    const emailParagraph = document.createElement('p');
    emailParagraph.className = 'card-text';
    emailParagraph.textContent = `Correo electrónico: ${email}`;
    cuerpoCarta.appendChild(emailParagraph);

    const editar = document.createElement('button');
    editar.className = 'btn btn-success';
    editar.textContent = 'Editar';
    editar.setAttribute('data-toggle', 'modal');
    editar.setAttribute('data-target', '#modal_editar');
    editar.addEventListener('click', function () {
        document.getElementById("editar_cedula").value = cedula;
    });
    cuerpoCarta.appendChild(editar);

    const eliminar = document.createElement('button');
    eliminar.addEventListener("click", function () {
        eliminar_persona(cedula);
    });

    eliminar.className = 'btn btn-danger';
    eliminar.textContent = 'Eliminar';
    cuerpoCarta.appendChild(eliminar);

    carta.appendChild(cuerpoCarta);
    document.getElementById("contenedor_cartas").appendChild(carta);
}

obtener()

function insertar() {

    let datos = new FormData();

    let cedula = document.getElementById("cedula").value;
    let nombres = document.getElementById("nombres").value;
    let apellidos = document.getElementById("apellidos").value;
    let telefono = document.getElementById("telefono").value;
    let direccion = document.getElementById("direccion").value;
    let email = document.getElementById("email").value;

    datos.append("cedula", cedula);
    datos.append("nombres", nombres);
    datos.append("apellidos", apellidos);
    datos.append("telefono", telefono);
    datos.append("direccion", direccion);
    datos.append("email", email);

    document.getElementById("cedula").value = ""
    document.getElementById("nombres").value = ""
    document.getElementById("apellidos").value = ""
    document.getElementById("telefono").value = ""
    document.getElementById("direccion").value = ""
    document.getElementById("email").value = ""

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

    document.getElementById("contenedor_cartas").innerHTML = "";
    obtener();
}


function editar() {

    let datos = new FormData();

    let cedula = document.getElementById("editar_cedula").value;
    let nombres = document.getElementById("editar_nombres").value;
    let apellidos = document.getElementById("editar_apellidos").value;
    let telefono = document.getElementById("editar_telefono").value;
    let direccion = document.getElementById("editar_direccion").value;
    let email = document.getElementById("editar_email").value;

    datos.append("cedula", cedula);
    datos.append("nombres", nombres);
    datos.append("apellidos", apellidos);
    datos.append("telefono", telefono);
    datos.append("direccion", direccion);
    datos.append("email", email);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json"
        },
        body: datos
    };

    fetch("https://codetesthub.com/API/Actualizar.php", configuracion)
        .then(res => res.json())
        .then(data => {
            console.log('Respuesta JSON Servidor: ');
            console.log(data);
        });

    document.getElementById("contenedor_cartas").innerHTML = "";
    obtener();
}

function eliminar_persona(cedula) {


    console.log("eliminando a" + cedula)
    let datos = new FormData();
    datos.append("cedula", (cedula));

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json"
        },
        body: datos
    };

    fetch("https://codetesthub.com/API/Eliminar.php", configuracion)
        .then(res => res.json())
        .then(data => {
            console.log('Respuesta JSON Servidor: ');
            console.log(data);
        });
    document.getElementById("contenedor_cartas").innerHTML = "";
    obtener();
}


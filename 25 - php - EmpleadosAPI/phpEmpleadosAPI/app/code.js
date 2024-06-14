function obtenerSucursales() {
    return fetch("http://localhost/phpEmpleadosAPI/api/obtenerSucursal.php")
        .then(response => response.json())
        .then(data => {
            const table = document.getElementById('sucursalTable');
            const tbody = table.getElementsByTagName('tbody')[0];
            tbody.innerHTML = ""; 
            data.forEach(sucursal => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${sucursal.id}</td>
                    <td>${sucursal.nombre}</td>
                    <td>${sucursal.pais}</td>
                    <td>${sucursal.ciudad}</td>
                    <td>${sucursal.direccion}</td>
                    <td>${sucursal.telefono}</td>
                    <td>${sucursal.correo}</td>
                    <td>${sucursal.horarioAtencion}</td>
                    <td>${sucursal.cantidadEmpleados}</td>
                    <td><button class="btn btn-danger" onclick="eliminarSucursal(${sucursal.id})">Eliminar</button></td>
                `;
                tbody.appendChild(row);
            });
        })
        .catch(error => {
            console.error('Error al consumir la API:', error);
        });
}

document.addEventListener('DOMContentLoaded', () => {
    obtenerSucursales();
});

function insertarSucursal() {
    const formulario = document.getElementById('insertar-sucursal');
    formulario.addEventListener('submit', (event) => {
        event.preventDefault();
        const nombre = document.getElementById('nombre').value;
        const pais = document.getElementById('pais').value;
        const ciudad = document.getElementById('ciudad').value;
        const direccion = document.getElementById('direccion').value;
        const telefono = document.getElementById('telefono').value;
        const correo = document.getElementById('correo').value;
        const horarioAtencion = document.getElementById('horarioAtencion').value;
        const cantidadEmpleados = document.getElementById('cantidadEmpleados').value;
        fetch('http://localhost/phpEmpleadosAPI/api/insertarSucursal.php', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: `nombre=${nombre}&pais=${pais}&ciudad=${ciudad}&direccion=${direccion}&telefono=${telefono}&correo=${correo}&horarioAtencion=${horarioAtencion}&cantidadEmpleados=${cantidadEmpleados}`
        })
            .then(response => response.json())
            .then(data => {
                if (data.status) {
                    alert('Sucursal insertada correctamente');
                    obtenerSucursales();
                } else {
                    alert('Error al insertar sucursal');
                }
            })
            .catch(error => {
                console.error('Error al insertar sucursal:', error);
            });
    });
}

// Llamar a la función para insertar una nueva sucursal cuando se cargue el documento
document.addEventListener('DOMContentLoaded', () => {
    insertarSucursal();
});

function actualizarSucursal(event) {
    event.preventDefault();
    let id = document.getElementById('editId').value;
    let nombre = document.getElementById('editNombre').value;
    let pais = document.getElementById('editPais').value;
    let ciudad = document.getElementById('editCiudad').value;
    let direccion = document.getElementById('editDireccion').value;
    let telefono = document.getElementById('editTelefono').value;
    let correo = document.getElementById('editCorreo').value;
    let horarioAtencion = document.getElementById('editHorarioAtencion').value;
    let cantidadEmpleados = document.getElementById('editCantidadEmpleados').value;
    let datos = {
        id: id,
        nombre: nombre,
        pais: pais,
        ciudad: ciudad,
        direccion: direccion,
        telefono: telefono,
        correo: correo,
        horarioAtencion: horarioAtencion,
        cantidadEmpleados: cantidadEmpleados
    };
    fetch('http://localhost/phpEmpleadosAPI/api/actualizarSucursal.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: `id=${id}&nombre=${nombre}&pais=${pais}&ciudad=${ciudad}&direccion=${direccion}&telefono=${telefono}&correo=${correo}&horarioAtencion=${horarioAtencion}&cantidadEmpleados=${cantidadEmpleados}`
    })
        .then(response => response.json())
        .then(data => {
            if (data.status) {
                alert('Sucursal actualizada correctamente');
                obtenerSucursales();
            }
        })
        .catch(error => console.error('Error:', error));
}

document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('actualizar-sucursal').addEventListener('submit', actualizarSucursal);
});

function eliminarSucursal(id) {
    const respuesta = confirm('Al borrar esta sucursal, se eliminarán todos los empleados asociados. ¿Desea continuar?');

    if (respuesta) {
        fetch('http://localhost/phpEmpleadosAPI/api/eliminarSucursal.php', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: `id=${id}`
        })
        .then(response => response.json())
        .then(data => {
            if (data.status) {
                alert('Sucursal eliminada correctamente');
                obtenerSucursales();
            } else {
                alert('Error al eliminar la sucursal');
            }
        })
        .catch(error => {
            console.error('Error al eliminar la sucursal:', error);
        });
    }
}




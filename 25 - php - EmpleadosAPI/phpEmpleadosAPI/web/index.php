<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Api gestión de empleados</title>
</head>

<body>
    <div class="container">
        <h1 class="text-center">API de gestión de empleados</h1>

        <section>
            <div>
                <h5>Obtener sucursales</h5>
                <h6>EndPoint: <a href="../api/obtenerSucursal.php">api/obtenerSucursal.php</a></h6>
                <h6>Metodo: GET</h3>
                    <h6>Parametros:</h6>
                    <h6>Salida: Json</h6>
                    <pre>
                    [
                    &nbsp;&nbsp;{
                    &nbsp;&nbsp;&nbsp;&nbsp;"id": 1,
                    &nbsp;&nbsp;&nbsp;&nbsp;"nombre": "Sucursal 1",
                    &nbsp;&nbsp;&nbsp;&nbsp;"pais": "España ",
                    &nbsp;&nbsp;&nbsp;&nbsp;"ciudad": "madrid",
                    &nbsp;&nbsp;&nbsp;&nbsp;"direccion": "Calle de la Independencia, 1",
                    &nbsp;&nbsp;&nbsp;&nbsp;"telefono": "915123456",
                    &nbsp;&nbsp;&nbsp;&nbsp;"email": "sucursal1@sucursal.com",
                    &nbsp;&nbsp;&nbsp;&nbsp;"horarioAtencion": "8:00 - 14:00"
                    &nbsp;&nbsp;&nbsp;&nbsp;"cantidadEmpleados": 10
                    &nbsp;&nbsp;}
                    ]
                </pre>
            </div>
            <div>
                <h5>Obtener empleados</h5>
                <h6>EndPoint: <a href="../api/obtenerEmpleado.php">api/obtenerEmpleado.php</a></h6>
                <h6>Metodo: GET</h3>
                    <h6>Parametros:</h6>
                    <h6>Salida: Json</h6>
                    <pre>
                    [
                    &nbsp;&nbsp;{
                    &nbsp;&nbsp;&nbsp;&nbsp;"id": 1,
                    &nbsp;&nbsp;&nbsp;&nbsp;"nombre": "Cristian",
                    &nbsp;&nbsp;&nbsp;&nbsp;"apellido": "Arce",
                    &nbsp;&nbsp;&nbsp;&nbsp;"email": "cristian@gmail.com",
                    &nbsp;&nbsp;&nbsp;&nbsp;"telefono": "1111111111",
                    &nbsp;&nbsp;&nbsp;&nbsp;"fechaNacimiento": "2002-03-07",
                    &nbsp;&nbsp;&nbsp;&nbsp;"fechaContratacion": "2024-06-13",
                    &nbsp;&nbsp;&nbsp;&nbsp;"cargo": "Analista de Datos"
                    &nbsp;&nbsp;&nbsp;&nbsp;"salario": "$1,500,000"
                    &nbsp;&nbsp;&nbsp;&nbsp;"sucursal": 1
                    &nbsp;&nbsp;}
                    ]
                </pre>
            </div>
        </section>

        <section>
            <div>
                <h5>Insertar sucursales</h5>
                <h6>EndPoint: <a href="../api/insertarSucursal.php">api/insertarSucursal.php</a></h6>
                <h5>Metodo: POST</h5>
                <h6>Parametros:</h6>
                <ul style="list-style: none;">
                    <li><strong>varchar</strong> nombre</li>
                    <li><strong>varchar</strong> pais</li>
                    <li><strong>varchar</strong> ciudad</li>
                    <li><strong>varchar</strong> direccion</li>
                    <li><strong>varchar</strong> telefono</li>
                    <li><strong>varchar</strong> correo</li>
                    <li><strong>varchar</strong> horarioAtencion</li>
                    <li><strong>int</strong> cantidadEmpleados</li>
                </ul>
                <h6>Salida: Json</h6>

                <div>
                    <h6>Sucursal registrada:</h6>
                    <pre>
                        {
                            "status": true,
                            "message": "OK##PERSON##INSERT"
                        }
                    </pre>

                    <h6>Error en parametros:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##DATOS##POST"
                        }
                    </pre>

                    <h6>Error al registrar:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##PERSON##INSERT"
                        }
                    </pre>
                </div>
            </div>
            <div>
                <h5>Insertar empleados</h5>
                <h6>EndPoint: <a href="../api/insertarEmpleado.php">api/insertarEmpleado.php</a></h6>
                <h5>Metodo: POST</h5>
                <h6>Parametros:</h6>
                <ul style="list-style: none;">
                    <li><strong>varchar</strong> nombre</li>
                    <li><strong>varchar</strong> apellido</li>
                    <li><strong>varchar</strong> email</li>
                    <li><strong>varchar</strong> telefono</li>
                    <li><strong>date</strong> fechaNacimiento</li>
                    <li><strong>date</strong> fechaContratacion</li>
                    <li><strong>varchar</strong> cargo</li>
                    <li><strong>decimal</strong> salario</li>
                    <li><strong>int</strong> idSucursal</li>
                </ul>
                <h6>Salida: Json</h6>
                <div>
                    <h6>Empleado registrado:</h6>
                    <pre>
                        {
                            "status": true,
                            "message": "OK##PERSON##INSERT"
                        }
                    </pre>

                    <h6>Error en parametros:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##DATOS##POST"
                        }
                    </pre>

                    <h6>Error al registrar:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##PERSON##INSERT"
                        }
                    </pre>
                </div>
            </div>
        </section>

        <section>
            <div>
                <h5>Actualizar sucursales</h5>
                <h6>EndPoint: <a href="../api/actualizarSucursal.php">api/actualizarSucursal.php</a></h6>
                <h5>Metodo: POST</h5>
                <h6>Parametros:</h6>
                <ul style="list-style: none;">
                    <li><strong>int</strong> id</li>
                    <li><strong>varchar</strong> nombre</li>
                    <li><strong>varchar</strong> pais</li>
                    <li><strong>varchar</strong> ciudad</li>
                    <li><strong>varchar</strong> direccion</li>
                    <li><strong>varchar</strong> telefono</li>
                    <li><strong>varchar</strong> correo</li>
                    <li><strong>varchar</strong> horarioAtencion</li>
                    <li><strong>int</strong> cantidadEmpleados</li>
                </ul>
                <h6>Salida: Json</h6>

                <div>
                    <h6>Sucursal actualizada:</h6>
                    <pre>
                        {
                            "status": true,
                            "message": "OK##PERSON##INSERT"
                        }
                    </pre>

                    <h6>Error en parametros:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##DATOS##POST"
                        }
                    </pre>

                    <h6>Error al actualizar:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##PERSON##INSERT"
                        }
                    </pre>
                </div>
            </div>
            <div>
                <h5>Actualizar empleados</h5>
                <h6>EndPoint: <a href="../api/actualizarEmpleado.php">api/actualizarEmpleado.php</a></h6>
                <h5>Metodo: POST</h5>
                <h6>Parametros:</h6>
                <ul style="list-style: none;">
                    <li><strong>int</strong> id</li>
                    <li><strong>varchar</strong> nombre</li>
                    <li><strong>varchar</strong> apellido</li>
                    <li><strong>varchar</strong> email</li>
                    <li><strong>varchar</strong> telefono</li>
                    <li><strong>date</strong> fechaNacimiento</li>
                    <li><strong>date</strong> fechaContratacion</li>
                    <li><strong>varchar</strong> cargo</li>
                    <li><strong>decimal</strong> salario</li>
                    <li><strong>int</strong> idSucursal</li>
                </ul>
                <h6>Salida: Json</h6>
                <div>
                    <h6>Empleado actualizado:</h6>
                    <pre>
                        {
                            "status": true,
                            "message": "OK##PERSON##INSERT"
                        }
                    </pre>

                    <h6>Error en parametros:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##DATOS##POST"
                        }
                    </pre>

                    <h6>Error al actualizar:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##PERSON##INSERT"
                        }
                    </pre>
                </div>
            </div>
        </section>

        <section>
            <div>
                <h5>Eliminar sucursales</h5>
                <h6>EndPoint: <a href="../api/eliminarSucursal.php">api/eliminarSucursal.php</a></h6>
                <h5>Metodo: POST</h5>
                <h6>Parametros:</h6>
                <ul style="list-style: none;">
                    <li><strong>int</strong> id</li>
                </ul>
                <h6>Salida: Json</h6>

                <div>
                    <h6>Sucursal eliminada:</h6>
                    <pre>
                        {
                            "status": true,
                            "message": "OK##PERSON##INSERT"
                        }
                    </pre>

                    <h6>Error en parametros:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##DATOS##POST"
                        }
                    </pre>

                    <h6>Error al eliminar:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##PERSON##INSERT"
                        }
                    </pre>
                </div>
            </div>
            <div>
                <h5>Eliminar empleados</h5>
                <h6>EndPoint: <a href="../api/eliminarEmpleado.php">api/eliminarEmpleado.php</a></h6>
                <h5>Metodo: POST</h5>
                <h6>Parametros:</h6>
                <ul style="list-style: none;">
                    <li><strong>int</strong> id</li>
                </ul>
                <h6>Salida: Json</h6>
                <div>
                    <h6>Empleado eliminado:</h6>
                    <pre>
                        {
                            "status": true,
                            "message": "OK##PERSON##INSERT"
                        }
                    </pre>

                    <h6>Error en parametros:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##DATOS##POST"
                        }
                    </pre>

                    <h6>Error al eliminar:</h6>
                    <pre>
                        {
                            "status": false,
                            "message": "ERROR##PERSON##INSERT"
                        }
                    </pre>
                </div>
            </div>
        </section>


    </div>
</body>

</html>
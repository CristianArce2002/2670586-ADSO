<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Api gestión de empleados</title>
</head>
<body>
    <div class="container">
        <h1 class="text-center">API de gestión de empleados</h1>
        <section>
            <h3 class="text-center">Metodo: GET</h3>
            <div class="row">
                <div class="col card">
                <h6>EndPoint: <a href="../api/obtenerEmpleado.php">api/obtenerSucursal.php</a></h6>
                <h6>Parametros:</h6>
                <h6>Salida: Json</h6>
                    <pre>
                        [
                        &nbsp;&nbsp;{
                        &nbsp;&nbsp;&nbsp;&nbsp;"cedula": "108800",
                        &nbsp;&nbsp;&nbsp;&nbsp;"nombres": "OSCAR ANDRES",
                        &nbsp;&nbsp;&nbsp;&nbsp;"apellidos": "LOAIZA PABON",
                        &nbsp;&nbsp;&nbsp;&nbsp;"telefono": "3333333",
                        &nbsp;&nbsp;&nbsp;&nbsp;"direccion": "CALLE 20",
                        &nbsp;&nbsp;&nbsp;&nbsp;"email": "oscar@mail.com",
                        &nbsp;&nbsp;&nbsp;&nbsp;"foto": "default.png"
                        &nbsp;&nbsp;}
                        ]
                    </pre>
                </div>
                <div class="col card">
                <h6>EndPoint: <a href="../api/obtenerSucursa.php">api/obtenerSucursal.php</a></h6>
                <h6>Parametros:</h6>
                <h6>Salida: Json</h6>
                    <pre>
                        [
                        &nbsp;&nbsp;{
                        &nbsp;&nbsp;&nbsp;&nbsp;"cedula": "108801",
                        &nbsp;&nbsp;&nbsp;&nbsp;"nombres": "JUAN DANIEL",
                        &nbsp;&nbsp;&nbsp;&nbsp;"apellidos": "GARCIA PEREZ",
                        &nbsp;&nbsp;&nbsp;&nbsp;"telefono": "3333331",
                        &nbsp;&nbsp;&nbsp;&nbsp;"direccion": "CALLE 21",
                        &nbsp;&nbsp;&nbsp;&nbsp;"email": "juan@mail.com",
                        &nbsp;&nbsp;&nbsp;&nbsp;"foto": "default.png"
                        &nbsp;&nbsp;}
                        ]
                    </pre>
                </div>
            </div>
        </section>

        <section>
            <h3 class="text-center">Metodo: POST</h3>
            <div class="row">
                <div class="col card">
                <h6>EndPoint: <a href="../api/obtenerEmpleado.php">api/obtenerSucursal.php</a></h6>
                <h6>Parametros:</h6>
                <ul>
                    <li>VARCHAR nombre</li>
                    <li>VARCHAR pais</li>
                    <li>VARCHAR ciudad</li>
                    <li>VARCHAR direccion</li>
                    <li>VARCHAR telefono</li>
                    <li>VARCHAR correo</li>
                    <li>VARCHAR horarioAtencion</li>
                    <li>INT cantidadEmpleados</li>
                </ul>
                <h6>Salida: Json</h6>
                    <pre>
                        [
                        &nbsp;&nbsp;{
                        &nbsp;&nbsp;&nbsp;&nbsp;"cedula": "108800",
                        &nbsp;&nbsp;&nbsp;&nbsp;"nombres": "OSCAR ANDRES",
                        &nbsp;&nbsp;&nbsp;&nbsp;"apellidos": "LOAIZA PABON",
                        &nbsp;&nbsp;&nbsp;&nbsp;"telefono": "3333333",
                        &nbsp;&nbsp;&nbsp;&nbsp;"direccion": "CALLE 20",
                        &nbsp;&nbsp;&nbsp;&nbsp;"email": "oscar@mail.com",
                        &nbsp;&nbsp;&nbsp;&nbsp;"foto": "default.png"
                        &nbsp;&nbsp;}
                        ]
                    </pre>
                </div>
                <div class="col card">
                <h6>EndPoint: <a href="../api/obtenerSucursa.php">api/obtenerSucursal.php</a></h6>
                <h6>Parametros:</h6>
                <h6>Salida: Json</h6>
                    <pre>
                        [
                        &nbsp;&nbsp;{
                        &nbsp;&nbsp;&nbsp;&nbsp;"cedula": "108801",
                        &nbsp;&nbsp;&nbsp;&nbsp;"nombres": "JUAN DANIEL",
                        &nbsp;&nbsp;&nbsp;&nbsp;"apellidos": "GARCIA PEREZ",
                        &nbsp;&nbsp;&nbsp;&nbsp;"telefono": "3333331",
                        &nbsp;&nbsp;&nbsp;&nbsp;"direccion": "CALLE 21",
                        &nbsp;&nbsp;&nbsp;&nbsp;"email": "juan@mail.com",
                        &nbsp;&nbsp;&nbsp;&nbsp;"foto": "default.png"
                        &nbsp;&nbsp;}
                        ]
                    </pre>
                </div>
            </div>
        </section>
    </div>

    


</body>
</html>
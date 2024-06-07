<?php
    include 'coneccion/coneccion.php';

    // Verificar campos vacíos
    if (
        !empty($_POST['nombre'])
        and !empty($_POST['pais'])
        and !empty($_POST['ciudad'])
        and !empty($_POST['direccion'])
        and !empty($_POST['correo'])
        and !empty($_POST['horarioAtencion'])
        and !empty($_POST['cantidadEmpleados'])
    ) {
        // Asignar valores a las variables
        $nombre = $_POST['nombre'];
        $pais = $_POST['pais'];
        $ciudad = $_POST['ciudad'];
        $direccion = $_POST['direccion'];
        $correo = $_POST['correo'];
        $horarioAtencion = $_POST['horarioAtencion'];
        $cantidadEmpleados = $_POST['cantidadEmpleados'];

        // Crear consulta insert
        $query = "INSERT INTO sucursales (nombre, pais, ciudad, direccion, correo, horarioAtencion, cantidadEmpleados)
        VALUES (:nombre, :pais, :ciudad, :direccion, :correo, :horarioAtencion, :cantidadEmpleados)";

        try {
            $consulta = $database->prepare($query);

            // Vincular parámetros de la consulta con las variables
            $consulta->bindParam(':nombre', $nombre);
            $consulta->bindParam(':pais', $pais);
            $consulta->bindParam(':ciudad', $ciudad);
            $consulta->bindParam(':direccion', $direccion);
            $consulta->bindParam(':correo', $correo);
            $consulta->bindParam(':horarioAtencion', $horarioAtencion);
            $consulta->bindParam(':cantidadEmpleados', $cantidadEmpleados);

            $proceso = $consulta->execute();

            if ($proceso && $consulta->rowCount() != 0) {
                $respuesta = ['status' => true,'mesagge' => "OK##PERSON##INSERT",];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,'mesagge' => "ERROR##PERSON##INSERT",];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = ['status' => false,'mesagge' => "ERROR##SQL",'exception' => $e,];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = ['status' => false,'mesagge' => "ERROR##DATOS##POST",];
        echo json_encode($respuesta);
    }
?>
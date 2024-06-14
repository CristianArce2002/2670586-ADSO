<?php
include 'coneccion/coneccion.php';

if (
    !empty($_POST['id'])
    and !empty($_POST['nombre'])
    and !empty($_POST['pais'])
    and !empty($_POST['ciudad'])
    and !empty($_POST['direccion'])
    and !empty($_POST['telefono'])
    and !empty($_POST['correo'])
    and !empty($_POST['horarioAtencion'])
    and !empty($_POST['cantidadEmpleados'])
) {
    $id = $_POST['id'];
    $nombre = $_POST['nombre'];
    $pais = $_POST['pais'];
    $ciudad = $_POST['ciudad'];
    $direccion = $_POST['direccion'];
    $telefono = $_POST['telefono'];
    $correo = $_POST['correo'];
    $horarioAtencion = $_POST['horarioAtencion'];
    $cantidadEmpleados = $_POST['cantidadEmpleados'];

    $query = "UPDATE sucursales 
    SET nombre = :nombre, 
        pais = :pais, 
        ciudad = :ciudad, 
        direccion = :direccion, 
        telefono = :telefono, 
        correo = :correo, 
        horarioAtencion = :horarioAtencion, 
        cantidadEmpleados = :cantidadEmpleados
        WHERE id = :id";

    try {
        $consulta = $database->prepare($query);

        $consulta->bindParam(':id', $id);
        $consulta->bindParam(':nombre', $nombre);
        $consulta->bindParam(':pais', $pais);
        $consulta->bindParam(':ciudad', $ciudad);
        $consulta->bindParam(':direccion', $direccion);
        $consulta->bindParam(':telefono', $telefono);
        $consulta->bindParam(':correo', $correo);
        $consulta->bindParam(':horarioAtencion', $horarioAtencion);
        $consulta->bindParam(':cantidadEmpleados', $cantidadEmpleados);

        $proceso = $consulta->execute();

        if ($proceso) {
            $respuesta = ['status' => true, 'message' => "OK##PERSON##UPDATE"];
            echo json_encode($respuesta);
        } else {
            $respuesta = ['status' => false, 'message' => "ERROR##PERSON##UPDATE"];
            echo json_encode($respuesta);
        }
    } catch (Exception $e) {
        $respuesta = ['status' => false, 'message' => "ERROR##SQL", 'exception' => $e];
        echo json_encode($respuesta);
    }
} else {
    $respuesta = ['status' => false, 'message' => "ERROR##DATOS##POST"];
    echo json_encode($respuesta);
}
?>

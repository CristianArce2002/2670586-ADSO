<?php 
    include 'coneccion/coneccion.php';

    if (
        !empty($_POST['nombre'])
        and !empty($_POST['pais'])
        and !empty($_POST['ciudad'])
        and !empty($_POST['direccion'])
        and !empty($_POST['correo'])
        and !empty($_POST['horarioAtencion'])
        and !empty($_POST['cantidadEmpleados'])
    ){
        $nombre = $_POST['nombre'];
        $pais = $_POST['pais'];
        $ciudad = $_POST['ciudad'];
        $direccion = $_POST['direccion'];
        $correo = $_POST['correo'];
        $horarioAtencion = $_POST['horarioAtencion'];
        $cantidadEmpleados = $_POST['cantidadEmpleados'];

        $query = "UPDATE sucursales 
        SET nombre = :nombre, 
            pais = :pais, 
            ciudad = :ciudad, 
            direccion = :direccion, 
            correo = :correo, 
            horarioAtencion = :horarioAtencion, 
            cantidadEmpleados = :cantidadEmpleados";

        try {
            $consulta = $database->prepare($query);

            $consulta->bindParam(':nombre', $nombre);
            $consulta->bindParam(':pais', $pais);
            $consulta->bindParam(':ciudad', $ciudad);
            $consulta->bindParam(':direccion', $direccion);
            $consulta->bindParam(':correo', $correo);
            $consulta->bindParam(':horarioAtencion', $horarioAtencion);
            $consulta->bindParam(':cantidadEmpleados', $cantidadEmpleados);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = ['status' => true,'mesagge' => "OK##PERSON##UPDATE"];
                echo json_encode($respuesta);
            }else{
                $respuesta = ['status' => false,'mesagge' => "ERROR##PERSON##UPDATE"];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = ['status' => false,'mesagge' => "ERROR##SQL",'exception' => $e];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = ['status' => false,'mesagge' => "ERROR##DATOS##POST"];
        echo json_encode($respuesta);
    }
?>

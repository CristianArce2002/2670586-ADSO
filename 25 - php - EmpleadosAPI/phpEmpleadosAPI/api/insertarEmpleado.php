<?php
    include 'coneccion/coneccion.php';

    // Verificar campos vacíos
    if (
        !empty($_POST['nombre'])
        and !empty($_POST['apellido'])
        and !empty($_POST['email'])
        and !empty($_POST['telefono'])
        and !empty($_POST['fechaNacimiento'])
        and !empty($_POST['fechaContratacion'])
        and !empty($_POST['cargo'])
        and !empty($_POST['salario'])
        and !empty($_POST['idSucursal'])
    ) {
       
        $nombre = $_POST['nombre'];
        $apellido = $_POST['apellido'];
        $email = $_POST['email'];
        $telefono = $_POST['telefono'];
        $fechaNacimiento = $_POST['fechaNacimiento'];
        $fechaContratacion = $_POST['fechaContratacion'];
        $cargo = $_POST['cargo'];
        $salario = $_POST['salario'];
        $idSucursal = $_POST['idSucursal'];

        $query = "INSERT INTO tabla (nombre, apellido, email, telefono, fechaNacimiento, fechaContratacion, cargo, salario, idSucursal)
        VALUES (:nombre, :apellido, :email, :telefono, :fechaNacimiento, :fechaContratacion, :cargo, :salario, :idSucursal)";

        try {
            $consulta = $database->prepare($query);

            $consulta->bindParam(':nombre', $nombre);
            $consulta->bindParam(':apellido', $apellido);
            $consulta->bindParam(':email', $email);
            $consulta->bindParam(':telefono', $telefono);
            $consulta->bindParam(':fechaNacimiento', $fechaNacimiento);
            $consulta->bindParam(':fechaContratacion', $fechaContratacion);
            $consulta->bindParam(':cargo', $cargo);
            $consulta->bindParam(':salario', $salario);
            $consulta->bindParam(':idSucursal', $idSucursal);

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
<?php
    include 'coneccion/coneccion.php';

    if (!empty($_POST['id'])) {
        $documento = $_POST['id'];

        try {
            $consulta = $database->prepare("DELETE FROM sucursales WHERE id = :id");
            $consulta->bindParam(':id', $documento);
            $proceso = $consulta->execute();

            if ($proceso && $consulta->rowCount() != 0) {
                $respuesta = [
                    'status' => true,
                    'message' => "OK##DELETE"
                ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,
                    'message' => "ERROR##DELETE"
                ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                'status' => false,
                'message' => "ERROR##SQL",
                'exception' => $e
            ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = [
            'status' => false,
            'message' => "ERROR##DATOS##POST"
        ];
        echo json_encode($respuesta);
    }
?>
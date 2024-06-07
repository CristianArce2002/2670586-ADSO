<?php
    // Configuración de encabezados
    header("Content-Type: application/json");
    header("Access-Control-Allow-Origin: *");
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");

    // Configuración de la base de datos
    $servidor = 'localhost';
    $usuario = 'root';
    $contrasena = '';
    $nombreDB = 'apiEmpleados';

    // Crear conexión a la base de datos
    try {
        $database = new PDO("mysql:host=$servidor;dbname=$nombreDB", $usuario, $contrasena);
    } catch (Exception $e) {
        echo 'No se ha podido conectar a la base de datos. Detalle: ' . $e->getMessage();
        exit;
    }
?>
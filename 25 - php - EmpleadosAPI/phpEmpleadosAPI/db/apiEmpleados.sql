DROP DATABASE IF EXISTS apiEmpleados;
CREATE DATABASE apiEmpleados;
USE apiEmpleados;

CREATE TABLE sucursales (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    pais VARCHAR(50),
    ciudad VARCHAR(50),
    direccion VARCHAR(200),
    telefono VARCHAR(20),
    correo VARCHAR(100),
    horarioAtencion VARCHAR(50),
    cantidadEmpleados INT
);

CREATE TABLE empleados (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    email VARCHAR(100),
    telefono VARCHAR(20),
    fechaNacimiento DATE,
    fechaContratacion DATE,
    cargo VARCHAR(50),
    salario DECIMAL(10,2),
    idSucursal INT,
    FOREIGN KEY (idSucursal) REFERENCES sucursales(id)
);

INSERT INTO sucursales (nombre, pais, ciudad, direccion, telefono, correo, horarioAtencion, cantidadEmpleados)
VALUES
    ('Sucursal 1', 'España', 'Madrid', 'Calle de la Independencia, 1', '915123456', 'sucursal1@sucursal.com', '8:00 - 14:00', 2),
    ('Sucursal 2', 'España', 'Barcelona', 'Paseo de Gracia, 10', '934567890', 'sucursal2@sucursal.com', '9:00 - 15:00', 2),
    ('Sucursal 3', 'Francia', 'París', 'Rue de Rivoli, 12', '147890123', 'sucursal3@sucursal.com', '9:00 - 17:00', 2),
    ('Sucursal 4', 'Reino Unido', 'Londres', 'Oxford Street, 15', '207890123', 'sucursal4@sucursal.com', '8:00 - 16:00', 2);

INSERT INTO empleados (nombre, apellido, email, telefono, fechaNacimiento, fechaContratacion, cargo, salario, idSucursal)
VALUES
    ('Juan', 'Pérez', 'juan.perez@sucursal.com', '915123456', '1990-01-01', '2010-01-01', 'Gerente', 50000.00, 1),
    ('María', 'García', 'maria.garcia@sucursal.com', '934567890', '1992-02-02', '2012-02-02', 'Asistente', 30000.00, 1),
    ('Pedro', 'Martínez', 'pedro.martinez@sucursal.com', '915123456', '1995-03-03', '2015-03-03', 'Vendedor', 25000.00, 2),
    ('Ana', 'González', 'ana.gonzalez@sucursal.com', '934567890', '1990-04-04', '2010-04-04', 'Gerente', 60000.00, 2),
    ('Luis', 'Hernández', 'luis.hernandez@sucursal.com', '915123456', '1992-05-05', '2012-05-05', 'Asistente', 35000.00, 3),
    ('Sofía', 'Ramos', 'sofia.ramos@sucursal.com', '934567890', '1995-06-06', '2015-06-06', 'Vendedor', 28000.00, 3),
    ('Carlos', 'Gómez', 'carlos.gomez@sucursal.com', '915123456', '1990-07-07', '2010-07-07', 'Gerente', 70000.00, 4),
    ('Lucía', 'López', 'lucia.lopez@sucursal.com', '934567890', '1992-08-08', '2012-08-08', 'Asistente', 32000.00, 4);

DELIMITER //

CREATE TRIGGER eliminarEmpleados
BEFORE DELETE ON sucursales
FOR EACH ROW
BEGIN
    DELETE FROM empleados WHERE idSucursal = OLD.id;
END //

DELIMITER ;
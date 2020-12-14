drop table ENVIO; 
drop table FACTURA; 
drop table ARTICULO; 
drop table EMPRESA;
drop table CLIENTE; 
drop table MEDIOPAGO; 
 
------------------------------- 
--     MEDIO DE PAGO
-------------------------------
CREATE TABLE MEDIOPAGO
(
  idMedPago INT  NOT NULL GENERATED ALWAYS AS IDENTITY 
     (START WITH 1 ,INCREMENT BY 1) PRIMARY KEY,
    fondos DECIMAL(8,2) NOT NULL 
  );


------------------------------- 
--     EMPRESA
-------------------------------
CREATE TABLE EMPRESA
(
  idEmpresa INT  NOT NULL GENERATED ALWAYS AS IDENTITY 
     (START WITH 1 ,INCREMENT BY 1) PRIMARY KEY,
nombre VARCHAR(50) NOT NULL 
  );

------------------------------- 
--     CLIENTE
-------------------------------
CREATE TABLE CLIENTE
(
  idCliente INT  NOT NULL GENERATED ALWAYS AS IDENTITY 
     (START WITH 1 ,INCREMENT BY 1) PRIMARY KEY,
medioPago_id INT NOT NULL
    REFERENCES MEDIOPAGO, 
nombre VARCHAR(50) NOT NULL ,
apPat VARCHAR(50) NOT NULL ,
apMAt VARCHAR(50) NOT NULL ,
email VARCHAR(50) NOT NULL ,
telefono VARCHAR(10) NOT NULL ,
direccion VARCHAR(50) NOT NULL ,
CP INT NOT NULL 
  );

------------------------------- 
--     ARTICULO
-------------------------------
CREATE TABLE ARTICULO
(
  ISBN VARCHAR(13) NOT NULL PRIMARY KEY,
empresa_id INT NOT NULL
    REFERENCES EMPRESA, 
	nombre VARCHAr(50) NOT NULL, 
	stock INT NOT NULL, 
precio DECIMAL(8,2) NOT NULL 
  );

------------------------------- 
--     FACTURA
-------------------------------
CREATE TABLE FACTURA
(
  idFactura INT  NOT NULL GENERATED ALWAYS AS IDENTITY 
     (START WITH 1 ,INCREMENT BY 1) PRIMARY KEY,
cliente_id INT NOT NULL
    REFERENCES CLIENTE, 
medioPago_id INT NOT NULL
    REFERENCES MEDIOPAGO, 
articulo_isbn VARCHAR(13) NOT NULL
    REFERENCES ARTICULO, 
cantidad INT NOT NULL, 
totalAPagar DECIMAL(8,2) NOT NULL  
  );

------------------------------- 
--     ENVIO
-------------------------------
CREATE TABLE ENVIO
(
  idEnvio INT NOT NULL GENERATED ALWAYS AS IDENTITY 
     (START WITH 1 ,INCREMENT BY 1) PRIMARY KEY,
empresa_id INT NOT NULL
    REFERENCES EMPRESA, 
factura_id INT NOT NULL
    REFERENCES FACTURA, 
fechaEntrega TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
  );

INSERT INTO MEDIOPAGO (fondos) VALUES
(5000.00), (890.00); 

INSERT INTO CLIENTE (medioPago_id,nombre,apPat,apMAt,email,telefono,direccion,CP) VALUES
(1,'Susana', 'Muñoz', 'Acosta', 'susy@gmail.com', '5555555555', 'fghf ',45),
(2,'Tabata', 'Gonzalez', 'Alvarado', 'tabata@gmail.com', '5555555555', ' gfhf',39) ; 

INSERT INTO EMPRESA (nombre) VALUES
('Empresa Libros 1'), ('Empresa Libros 2');

INSERT INTO ARTICULO (ISBN,empresa_id, nombre,stock,precio) VALUES
('0000000000001',1,'El Principito', 500,5.00),
('0000000000002',2,'Cien años de soledad', 500,10.00),
('0000000000003',1,'Crepusculo', 0,15.00),
('0000000000004',2,'1984',500,1000.00);
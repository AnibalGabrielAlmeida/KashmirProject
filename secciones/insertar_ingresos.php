<?php

$host="localhost";
$port=3306;
$socket="";
$user="root";
$password="J!mh4ll3127";
$dbname="kashmir";

$con = new mysqli($host, $user, $password, $dbname, $port, $socket)
	or die ('Could not connect to the database server' . mysqli_connect_error());


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT nombre_banda FROM clientes";
$resultado = mysqli_query($conn, $sql);

if (mysqli_num_rows($resultado) > 0) {
  // Muestra los datos en pantalla
  while($fila = mysqli_fetch_assoc($resultado)) {
    echo "Nombre de cliente: " . $fila["nombre_banda"]. "<br>";
  }
} else {
  echo "0 resultados";
}

// Cierra la conexión
mysqli_close($conn);	
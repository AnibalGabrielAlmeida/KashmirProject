<?php

$host = "localhost";
$port = 3306;
$socket = "";
$user = "root";
$password = "J!mh4ll3127";
$dbname = "kashmir";

$conn = new mysqli($host, $user, $password, $dbname, $port, $socket);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT * FROM clientes";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        echo "ID Cliente: " . $row["id_cliente"] . "<br>";
        echo "Nombre Banda: " . $row["nombre_banda"] . "<br>";
        echo "Nombre Contacto: " . $row["nombre_contacto"] . "<br><br>";
    }
} else {
    echo "0 resultados";
}

$conn->close();
?>

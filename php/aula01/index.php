<?php 
$nome = "Eduardo";
if($_SERVER["REQUEST_METHOD"] == "POST"){
$nome = $_POST["nome"];
if ($nome == "Eduardo") {
    echo "<p style="margin: 0 auto;"Usuario Logado";
}else{
    echo "<p>Usuario não foi encontrado";
}
}

?>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 01 | PHP</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
  
<form method="POST" >
<label for="nome" >Login</label> <br>

<div id="usuario">
<input type="text" name="nome" id="nome"  placeholder="Digite seu nome" required> <br>
</div>

<input type="submit" id="btn" value="Entrar" >



</form>

</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Login</title>
    <style>
        body{
            width: 100vw;
            height: 100vh;
        }
        div{
            display: flex;
            height: 100%;
            width: 100%;
            justify-content: center;
            align-items: center;
        }
        form{
            display: flex;

            justify-content: center;
            align-items: center;
            border-radius: 20px;

        }
        .input{
            margin-top:20px;

        }
        .ip{
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div>
    <form action="#" class="form-control w-25">
        <input type="text" placeholder="Digite seu nome" class="form-control w-50 mx-auto ip">
        <input type="password" placeholder="Digite sua senha" class="form-control w-50 mx-auto mt-3">
        <input type="submit" value="Entrar" class="justify-content-center d-flex w-25 mx-auto input btn btn-primary ">
    </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

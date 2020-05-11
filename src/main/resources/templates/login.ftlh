<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<#--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">-->
<#--    <link rel="stylesheet" type="text/css" href="../css/stylesheet.css">-->
</head>
<body>
<!-- Splash screen -->
<section id="page-splash" class="page-splash">
    <div class="d-flex justify-content-center">

        <div class="mx-3">
            <form id="login-form" action="/login" method="post">
                <h3>Вход</h3>
                <input type="text" name="username" class="form-control mb-1" placeholder="Email"/>
                <input type="password" name="password" class="form-control mb-1" placeholder="Пароль">
                <input type="submit" class="btn btn-outline-primary btn-block" value="Sign In">
            </form>
        </div>
    </div>
    <a href="/registration">registration</a>

</section>
</body>
</html>



<#import "/spring.ftl" as spring/><!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/style.css">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Поиск</h3>
<form action="/findItem" method="post">
    <input type="text" name="val" placeholder="Поиск по имени">
    <input type="hidden" name="type" value="byName">
    <button class="btn btn-outline-primary btn-block">Find</button>
</form>
<form action="/findItem" method="post">
    <input type="text" name="val" placeholder="по цене не более">
    <input type="hidden" name="type" value="price">
    <button class="btn btn-outline-primary btn-block">Find</button>
</form>
<h1 class="h1">Welcome to All for fix shop</h1>
<#list items as item>
    <div class="card">
        <h2 class="h2">${item.name}</h2>
        <img class="img" src="/static/images/${item.image}">
        <p class="h2">Count: ${item.count}</p>
        <p class="h2">Price: ${item.price} сомов</p>
    </div>
</#list>



<#--<ul>-->
<#--    <#list items as item>-->
<#--        <li>${item.name}</li>-->
<#--    </#list>-->
<#--</ul>-->



<#--<h1>All users</h1>-->
<#--<form action="/logout" method="post">-->
<#--    <input type="submit" value="Sign Out"/>-->
<#--<ul>-->
<#--    <#list users as user>-->
<#--        <li>Fullname: ${user.fullName}; E-mail: ${user.email} </li>-->
<#--    </#list>-->
<#--</ul>-->
</body>
</html>
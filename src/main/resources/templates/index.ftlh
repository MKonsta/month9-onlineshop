<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<#include "parts/security.ftlh">

<@c.page>

    <#if name=="unknown">
        <a href="/login">Войти</a>
        <a href="/registration">Зарегистрироваться</a>
    <#else>
        <p>Hello, ${name}</p>
        <form method="post" action="/cart">
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <input type="submit" value="перейти в корзину">
        </form>
        <@l.logout/>
    </#if>

    <h1 class="h1">Welcome to All for fix shop</h1>

    <form method="get" action="/">
        <input type="text" name="name" placeholder="Фильтр по имени">
        <button type="submit">Отфильтровать</button>
    </form>
    <form method="get" action="/">
        <input type="text" name="category" placeholder="Фильтр по категории">
        <button type="submit">Отфильтровать</button>
    </form>
    <form method="get" action="/">
        <input type="number" name="lowPrice" placeholder="Цена не более">
        <button type="submit">Отфильтровать</button>
    </form>
    <form method="get" action="/">
        <input type="number" name="morePrice" placeholder="Цена не менее">
        <button type="submit">Отфильтровать</button>
    </form>

    <#list items as item>
        <div class="card">
            <h2 class="h2">${item.name}</h2>
            <img class="img" src="/static/images/${item.file}">
            <p class="h2">Count: ${item.count}</p>
            <p class="h2">Category: ${item.category}</p>
            <p class="h2">Price: ${item.price} сомов</p>
            <#if name != "unknown">
            <form action="/addToCart" method="post">
                <input type="hidden" name="_csrf" value="${_csrf.token}">
                <input type="hidden" name="itemId" value="${item.id}">
                <input type="hidden" name="itemName" value="${item.name}">
                <input type="submit" value="Добавить в корзину">
            </form>
            </#if>
        </div>
    </#list>

</@c.page>
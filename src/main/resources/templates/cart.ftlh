<#import "parts/common.ftlh" as c>

<@c.page>

    <table>
        <thead>
        <tr>
            <th>Наименование товара</th>
            <th>Купить</th>
            <th>Удалить из корзины</th>
        </tr>
        </thead>
        <tbody>
        <#list carts as cart >
            <tr>
                <td>${cart.itemName}</td>
                <td>
                    <form method="post" action="/delete">
                        <input type="hidden" name="_csrf" value="${_csrf.token}">
                        <input type="hidden" name="cartId" value="${cart.id}">
                        <input type="hidden" name="userId" value="${cart.userId}">
                        <input type="submit" value="Купить">
                    </form>
                </td>
                <td>
                    <form method="post" action="/delete">
                        <input type="hidden" name="_csrf" value="${_csrf.token}">
                        <input type="hidden" name="cartId" value="${cart.id}">
                        <input type="hidden" name="userId" value="${cart.userId}">
                        <input type="submit" value="Удалить">
                    </form>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
    <a href="/">Вернуться на главную</a>

</@c.page>
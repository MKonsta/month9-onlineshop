'use strict';
window.addEventListener('load', function () {

    const registrationForm = document.getElementById('registration-form');
    registrationForm.addEventListener('submit', onRegisterHandler);

    function onRegisterHandler(e) {
        e.preventDefault();
        const form = e.target;
        const data = new FormData(form);
        const userJSON = JSON.stringify(Object.fromEntries(data));
        createUser(userJSON);
    }

    const baseUrl = 'http://localhost:8080';

    async function createUser(userJSON) {
        const settings = {
            method: 'POST',
            body: userJSON,
            headers: {
                'Content-Type': 'application/json'
            },
        };

        const response = await fetch(baseUrl + '/addUser', settings);
        const responseData = await response.json();

        console.log(responseData);

        window.location.href = baseUrl + "/hello";
    }

});

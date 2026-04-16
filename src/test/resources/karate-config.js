function fn() {
    var config = {};

    config.baseUrl = 'https://petstore.swagger.io/v2';

    config.endpoints = {
        pet: '/pet',
        findByStatus: '/pet/findByStatus'
    };

    karate.configure('report', {
        showLog: true,
        showAllSteps: false
    });

    return config;
}
Feature: Ejercicio API - PetStore E2E

  Background:
    * url baseUrl
    * def create = read('classpath:data/create-pet.json')
    * def update = read('classpath:data/update-pet.json')

    * set create.id = 55
    * set create.name = 'Grinfindor'
    * set create.status = 'available'

    * set update.id = create.id
    * set update.name = 'Grinfindor - Update'
    * set update.status = 'sold'

  Scenario: Añadir una mascota a la tienda

    Given url baseUrl + endpoints.pet
    And request create
    When method post
    Then status 200

    And match response.id == create.id
    And match response.name == create.name

  Scenario: Consultar la mascota ingresada previamente (Busqueda por ID)

    Given url baseUrl + endpoints.pet
    And path create.id
    When method get
    Then status 200

    And match response.id == create.id

  Scenario: Actualizar le nombre de la mascota y el estatus de la mascota

    Given url baseUrl + endpoints.pet
    And request update
    When method put
    Then status 200

    And match response.id == update.id
    And match response.name == update.name
    And match response.status == update.status

  Scenario: Consultar la mascota modificada por estatus (Busqueda por estatus)

    Given url baseUrl + endpoints.findByStatus
    And param status = update.status
    When method get
    Then status 200

    * def matchPet = karate.filter(response, x => x.id == update.id)

    And match matchPet[0].id == update.id
    And match matchPet[0].status == update.status
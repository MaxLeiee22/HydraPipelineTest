Feature: Sample Karate API test script

  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: Get all users and then get the first user
    * path 'users'
    * method GET
    * status 200
    * print response
    * match response[0] contains {id:1, name:'Leanne Graham', username: 'Bret', website: 'hildegard.org'}

    * def firstValueOfMyResponse = response[0]

    * path 'users', firstValueOfMyResponse.id
    * method GET
    * status 200
    * print response
    * match response == firstValueOfMyResponse


Feature: Simple Request

  Scenario: Simple POST and GET request

  * url 'https://httpbin.org/anything'
    * request {myKey: 'myValue'}
    * method POST
    * status 200
    * match response.json == {myKey: 'myValue'}

    * path response.json.myKey
    * method GET
    * status 200
    * print response
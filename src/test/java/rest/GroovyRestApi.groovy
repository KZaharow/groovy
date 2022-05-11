package rest

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import wslite.rest.ContentType
import wslite.rest.RESTClient
import wslite.rest.RESTClientException

// @Grab(group='com.github.groovy-wslite', module='groovy-wslite', version='1.1.3')
class GroovyRestApi {

    @Test
    void testGroovyGet() {
        RESTClient client = new RESTClient("https://postman-echo.com")
        def response
        try {
            response = client.get(path: '/get')
            Assertions.assertEquals(200, response.statusCode)
            Assertions.assertEquals('close', response?.headers?.Connection)
        } catch (RESTClientException e) {
            assert e?.response?.statusCode != 200
        }
    }

    @Test
    void testGroovyPost() {
        RESTClient client = new RESTClient("https://postman-echo.com")
        client.defaultAcceptHeader = ContentType.JSON
        def params = ["foo": 1, "bar": 2]
        def response = client.post(path: '/post') {
            type ContentType.JSON
            json params
        }
        assert response.json?.data == params

    }
}
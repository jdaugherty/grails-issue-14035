package com.example

class TestController {

    ExampleService exampleService

    def index() {
        render ("There are ${Example.count()} Test records")
    }

    def save() {
        exampleService.saveExample()

        redirect (view: 'index')
    }


}

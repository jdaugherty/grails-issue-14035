package com.example

import grails.gorm.transactions.Transactional

@Transactional
class ExampleService {

    void saveExample() {
        log.info ('Attempting to insert example with no description - should work because of default constraints')
        Example example = new Example()
        example.name = 'name'
        example.save(flush:true)

        log.info ('Attempting to insert example with description')
        example = new Example()
        example.name = 'name2'
        example.description = 'description'
        example.save(flush:true)
    }
}

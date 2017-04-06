package com.tlbent

import grails.converters.*

class BookController {

static allowedMethods = [index: "GET", show: "GET"]

   def scaffold = Book

def index(Book book){

render Book.list() as XML
}


def advSearch(){}

def advResults(){

def bookProps = Book.metaClass.properties*.name

def books = Book.withCriteria {
 "${params.queryType}" {

params.each { field, value ->
 if (bookProps.grep(field) && value) {
 ilike(field, value)
 }
 }
 }
 


}

[books:books]

}


}
    


package com.tlbent

class BookReview {

String book 
Date dateCreated
String student
String review


  static constraints = {

book blank:false, nullable:false 
dateCreated nullable:true
student blank:false, nullable:false 
review blank:false, nullable:false, maxSize:500 

    }
}

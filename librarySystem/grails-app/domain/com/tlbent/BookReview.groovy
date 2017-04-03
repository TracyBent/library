package com.tlbent

class BookReview {

Book book 
Date dateCreated
Student student
String review
 

  static constraints = {

book blank:false, nullable:false 
dateCreated nullable:false
student blank:false, nullable:false 
review blank:false, nullable:false, maxSize:500 

    }
}

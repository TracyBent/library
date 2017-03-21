package com.tlbent

class Book {

String title 
String subject
String author 
long isbn
Date dateBorrowed 
Date returnDate 
String student
Boolean overdue

     static constraints = {

title blank:false, nullable:false 
subject blank:false, nullable:false 
author blank:false, nullable:false 
isbn blank:false, unique:true
dateBorrowed blank:false, nullable:false 
returnDate blank:false, nullable:false 
student blank:false, nullable:false 
overdue blank:false, nullable:false 







    }
}

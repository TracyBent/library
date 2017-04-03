package com.tlbent

class Student {

String name
String email
String userName
String password 
String studentId
Course course
Library library
String toString ()

{
"$name"
} 

 static hasMany= [books:Book, bookreviews:BookReview]

    static constraints = {

name blank:false, nullable:false 
email blank:false, email:true
userName blank:false, unique:true
password blank:false,nullable:false,unique:true
studentId blank:false, nullable:false 
course blank:false, nullable:false 

    }
}

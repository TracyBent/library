package com.tlbent

class Student {

String name
String email
String username
String password 
String studentId
String course




    static constraints = {


name blank:false, nullable:false 
email blank:false, email:true
username blank:false, unique:true
password blank:false,nullable:false 
studentId blank:false, nullable:false 
course blank:false, nullable:false 

    }
}

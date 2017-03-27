package com.tlbent

class Librarian {

String name
String email
String office
String username
String password 
String telephone
String library

    static constraints = {

name blank:false
email blank:false, email:true
office blank:false, nullable:false, maxSize:4 
username blank:false, unique:true
password blank:false
telephone blank:false, size:1..20
library blank:false, nullable:false  
 

    }
}

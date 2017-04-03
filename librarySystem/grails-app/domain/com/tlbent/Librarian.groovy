package com.tlbent

class Librarian {

String name
String email
String office
String userName
String password 
String telephone
Library library

    static constraints = {

name blank:false
email blank:false, email:true
office blank:false, nullable:false,maxSize:4
userName blank:false, unique:true
password blank:false,nullable:false
telephone blank:false, size:1..20
library blank:false, nullable:false  
 

    }
}

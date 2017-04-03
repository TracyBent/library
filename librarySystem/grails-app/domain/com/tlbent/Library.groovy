package com.tlbent

class Library {

String building
String address
String openingHours
String location
String studySpace

static hasMany = [books:Book,librarians:Librarian, students:Student]

    static constraints = {

building blank:false, nullable:false 
address blank:false, nullable:false 
openingHours blank:false, nullable:false 
location blank:false, nullable:false 
studySpace blank:false, nullable:false 

    }
}

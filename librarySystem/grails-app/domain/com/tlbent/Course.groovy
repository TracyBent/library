package com.tlbent

class Course {


String title
String code
String leader
String department 
String description 
String studyMode 

    static constraints = {

title blank:false, nullable:false 
code blank:false, nullable:false 
leader blank:false, nullable:false 
department blank:false,nullable:false, max:4
description blank:false,nullable:false, widget:'textarea'
studyMode nullable:true


    }
}

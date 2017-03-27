package com.tlbent

class Course {


String title
String code
String leader
String department 
String description 
String studyMode 

/* double calculateFees(){
4*fee 
}
*/



    static constraints = {

title blank:false, nullable:false 
code blank:false, nullable:false, maxSize:4
leader blank:false, nullable:false 
department blank:false,nullable:false
description blank:false,nullable:false, widget:'textarea'
studyMode nullable:true


    }
}

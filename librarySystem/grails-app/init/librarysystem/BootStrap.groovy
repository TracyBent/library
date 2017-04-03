package com.tlbent

class BootStrap {

    def init = { servletContext ->

/* def library1 = new Library(
building:'Cantor',
address:'Sheaf Street',
openingHours:'9am to 6pm',
location:'Huddersfield',
studySpace:'500 spaces')
.save()

def library2 = new Library(
building:'Cantor',
address:'Sheaf Street',
openingHours:'9am to 6pm',
location:'Sheffield',
studySpace:'500 spaces')
.save()

def librarian1 = new Librarian(
name:'Sarah',
email:'S.Smith@hotmail.com',
office: 'G110',
userName:'Sarah',
password:'password1',
telephone:'01484634275',
library:library1)
.save()

def librarian2 = new Librarian(
name:'James',
email:'J@hotmail.com',
office: 'G111',
userName:'James',
password:'password1',
telephone:'01484637465',
library:library2)
.save()

def english = new Course(
title:'English',
code:'G534',
leader:'Peter Green',
department:'Languages',
description:'International Languages',
studyMode:'Advanced')
.save()

def computing = new Course(
title:'Computing',
code:'G523',
leader:'John Smith',
department:'IT',
description:'Information Technology',
studyMode:'Advanced')
.save()

def student1 = new Student(
name:'Tracy',
email:'T.Bent@hotmail.com',
userName:'Tracy1',
password:'password1',
studentId:'B5015386',
course:english)
.save()

def student2 = new Student(
name:'Salma',
email:'salma@hotmail.com',
userName:'Salma1',
password:'password2',
studentId:'B5015455',
course:computing)
.save()

def student3 = new Student( 
name:'Sam',
email:'S@hotmail.com',
userName: 'Sam1',
password:'password3',
studentId:'B5386575',
course:computing).save()

def book1 = new Book(
title:'The Girl On The Train', 
subject:'Thriller',
author:'Paula Hawkins',
isbn:'1234562491',
dateBorrowed:new Date('12/03/2017'),
returnDate:new Date('12/04/2017'),
student:student1,
overdue:false,
library:library1)
.save()

def book2 = new Book(
title:'Divergent', 
subject:'Scifi',
author:'Veronica Roth',
isbn:'13346343',
dateBorrowed:new Date('12/05/2017'),
returnDate:new Date('15/06/2017'),
student:student2,
overdue:false,
library:library1)
.save()

def BookReview1 = new BookReview(
book:book1,
dateMade: new Date('16/04/2017'),
student:student1,
review:'Great Book!')
.save()

def BookReview2 = new BookReview(
book:book2,
dateMade: new Date('16/07/2017'),
student:student2,
review:'Fantastic Book!')
.save()

*/


 }
    def destroy = {
    }
}

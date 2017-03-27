package com.tlbent

class BootStrap {

    def init = { servletContext ->


def librarian1 = new Librarian(
name:'Sarah',
email:'S.Smith@hotmail.com',
office: 'G110',
username:'Sarah',
password:'password1',
telephone:'01484634275',
library:'Huddersfield')
.save()

def librarian2 = new Librarian(
name:'James',
email:'J@hotmail.com',
office: 'G111',
username:'James',
password:'password1',
telephone:'01484637465',
library:'Sheffield')
.save()

def library1 = new Library(
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


def book1 = new Book(
title:'The Girl On The Train', 
subject:'Thriller',
author:'Paula Hawkins',
isbn:'123456789',
dateBorrowed:new Date('12/03/2017'),
returnDate:new Date('12/04/2017'),
student:'B5015386',
overdue:false)
.save()

def book2 = new Book(
title:'Divergent', 
subject:'Scifi',
author:'Veronica Roth',
isbn:'123456343',
dateBorrowed:new Date('12/05/2017'),
returnDate:new Date('15/06/2017'),
student:'B5015455',
overdue:false)
.save()

def student1 = new Student(
name:'Tracy',
email:'T.Bent@hotmail.com',
username:'Tracy',
password:'password1',
studentId: 'B5015386',
course:'English')
.save()

def student2 = new Student(
name:'Salma',
email:'salma@hotmail.com',
username:'Salma',
password:'password1',
studentId: 'B5015455',
course:'Computing')
.save()

def course1 = new Course(
title:'English',
code:'G534',
leader:'Peter Green',
department:'Languages',
description:'International Languages',
studyMode:'Advanced')
.save()


def course2 = new Course(
title:'Computing',
code:'G523',
leader:'John Smith',
department:'IT',
description:'Information Technology',
studyMode:'Advanced')
.save()

def BookReview1 = new BookReview(
book:'The Girl On The Train',
dateCreated: new Date('16/04/2017'),
student:'B5015386',
review:'Great Book!')
.save()

def BookReview2 = new BookReview(
book:'Divergent',
dateCreated: new Date('16/07/2017'),
student:'B5015455',
review:'Fantastic Book!')
.save()


 }
    def destroy = {
    }
}

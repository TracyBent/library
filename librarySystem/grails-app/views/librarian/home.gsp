<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Library System </title>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <asset:stylesheet src = "home.css"/>
</head>
<body>
    

    <div id="content" role="main">

<div class = "row">

<div class = "first">
	
	<h3>Librarian</h3>

<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </p>
 
<button type = "button" class="btn btn-success">
<g:link controller ="librarian" action="create">Librarian</g:link>

</button> 

</div> 

<div class = "second">
	
	<h3>Library</h3>

<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>

<button type = "button" class="btn btn-success">
<g:link controller ="library" action="create">Library</g:link>

</button> 
</div> 

<div class = "first">
	
	<h3>Book</h3>

<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>

<button type = "button" class="btn btn-success">
<g:link controller ="book" action="create">Book</g:link>

</button> 
</div> 

<div class = "second">
	
	<h3>Student</h3>

<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>

<button type = "button" class="btn btn-success">
<g:link controller ="student" action="create">Student</g:link>

</button> 
</div> 
<div class = "first">
	
	<h3>Course</h3>

<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>

<button type = "button" class="btn btn-success">
<g:link controller ="course" action="create">Course</g:link>

</button> 
</div> 



</div>
</div>
</body>
</html>

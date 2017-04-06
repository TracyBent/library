<!doctype html>
<html>
<head>
<asset:stylesheet src="home.css"/>
    	<meta name="layout" content="main"/>
    	<title>Welcome to the Library System </title>
    	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    	<asset:stylesheet src = "home.css"/>
</head>
<body>    
  
<div class = "first">
	
	<h3>Book</h3>

	<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 		labore et dolore magna aliqua. </p>

	<button type = "button" class="btn btn-success">
 	<g:link controller ="book" action="create">Book</g:link>

	</button> 
</div> 


<div class = "second">
	
	<h3>Book Review</h3>

	<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 		labore et dolore magna aliqua. </p>

	<button type = "button" class="btn btn-success">
	<g:link controller ="bookReview" action="create">Book Review</g:link>
	</button> 
</div> 


<div class = "first">
	
	<h3> Search for Books </h3>

	<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 	 labore et dolore magna aliqua. </p>
	<button type = "button" class="btn btn-success">
	<g:link controller ="book" action="advSearch">Search Books</g:link>

</div>


<div class = "second">
	
	<h3> List all Books</h3>

	<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 		labore et dolore magna aliqua. </p>
	<button type = "button" class="btn btn-success">
	<g:link controller ="book" action="index">List of Books</g:link>

</div>
</div>
</div>
</body>
</html>

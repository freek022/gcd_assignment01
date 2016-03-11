<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>This is example2</title>
	</head>
	<body>
		<h4>${welcome}</h4>
		<!-- if the user is logged in then we need to render one version of page
			 consequently if user is logged out we need to render a different vesrion -->
		<c:choose>
			<c:when test="${user !=null }">
				<p>
					Welcome ${user.email } <br/>
					You can signout <a href="${logout_url }">Here</a><br/><br>
					
				</p>
				<p>	
					Search a word and its anagram<br/>
					<form action="/AnagramServlet.java" method="get">
						<input type="search" name="search_input">
						<input type="submit" value="Search"/><br/>
					</form>									
				</p><br/>
				<p>
					Add a word to the anagram dictionary
					<form action="/AnagramServlet.java" method="post">
						<input type="text" name="add_word">
						<input type="submit" value="Add word">
					</form>
				</p>	
				
			</c:when>
			<c:otherwise>
				<p>
					Welcome!
					<a href="${login_url }">
						Sign in or register
					</a>
				</p>
			</c:otherwise>		
		</c:choose>		 
	</body>

</html>
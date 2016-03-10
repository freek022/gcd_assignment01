<%@ taglib uri="http:java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Anagram</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${user != null }">
				<p>
					Welcome ${user.email}<br>
					You can signout<a href="${logout_url"}>here</a><br>					
				</p>
			</c:when>
			<c:otherwise>
				<p>
					Welcome!
					<a href="${login_url}">Sign in </a>
				</p>			
			</c:otherwise>
		</c:choose>
	</body>
</html>
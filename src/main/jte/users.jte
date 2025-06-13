@import org.example.hexlet.HelloWorld
@import org.example.hexlet.model.User
@import org.example.hexlet.repository.UserRepository


<html>
<head>
    <title>USERS</title>
</head>
<body>
<h1>USERS LIST</h1>
    @for(var User : UserRepository.getEntities())
        <div>
            <p>${User.getName()}</p>
        </div>
    @endfor

</body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage = "true"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Something Went Wrong!...</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <div class="container p-3 text-center">
            <img src="img/error2.jpg" class="img-fluid"/>
            <h1 class="display-1">Sorry ! Something wrong</h1>
       
            <p><%= exception%></p>
            <a class="btn btn-outline-primary" href="index.html">Home Page</a>
        </div>
        
    </body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C/DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Vendor</title>
</head>
<body>
<form action="saveVend" method="post">
    <pre>
        Id:      <input type="text" name="id"/>
        Code:    <input type="text" name="code"/>
        Name:    <input type="text" name="name"/>
        Type:    <select name="type">
                <option value="Regular">Regular</option>
                <option value="Temporary">Temporary</option>
                 </select>
        Email:   <input type="email" name="email"/>
        Phone:   <input type="text" name="phone" id="phone"/>
        Address: <textarea rows="5" cols="40" name="address">Enter address here</textarea>
                 <input type="submit" name="save"/>
    </pre>
</form>
${message}
<a href="displayVendors">View All</a>
</body>
</html>
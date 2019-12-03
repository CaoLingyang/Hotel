<%--
  Created by IntelliJ IDEA.
  User: 曹令洋
  Date: 2019/12/3
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>

<script>
    $(function () {
        $.ajax({
            url:"/list",
            type:"GET",
            success:function (result) {
                alert(result.msg);
                if (result.code=="200"){
                    alert(result.data[0].id)
                    alert(result.data[1].name)

                }
            }
        })
    })
</script>
</body>
</html>

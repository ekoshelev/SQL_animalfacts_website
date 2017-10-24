
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>      
        <title>Animals</title>
        <meta charset="UTF-8">
        <script src="js/libs/jquery/jquery.js"></script>
        <script>
            $(document).ready(function () {
               <c:forEach var="ani" items="${list}">
                $("img").hover(
                    function ()
                    {          
                        $("img").animate({width: '100px', height: '100px'},1000);
                    },
                    function()
                    {
                        $("img").animate({width: '50px', height: '50px'},1000);
                });
                
                $("#${ani.name}button").click(
                    function ()
                    {
                    $("#${ani.name}button").text(function(i, text){
                        return text === "Less" ? "More" : "Less";
                    });
                    $("#${ani.name}row").toggle();
                        
                    });
                            </c:forEach>
                 
                });
        </script>
        
        <style> 
            table {
                width : 100%;
                border: solid 1px #c3c3c3;
            }
            tbody td{
                text-align: center;
                table-layout: fixed;
                height : 150px;
                width : 150px;
                border: solid 1px #c3c3c3;
            }
            img {
                height: 50px;
                width: 50px;
            }
            thead td
            {
                text-align: center;
                height : 50px;
                font-weight : bold;
            }
            .desc2{
                display:none;
            }
            .desc{
                font-size : 10px;
            }
            p{
                text-align: justify;
            }
        </style>


    </head>
           <h1>Table of Animals</h1>
        <div id="tablediv">
            <table>
                <thead>
                    <tr>
                        <td>Animal</td>
                        <td>Picture</td>
                        <td>Description</td>
                    </tr>
                </thead>
                    <c:forEach var="ani" items="${list}">
                <tr id="tr1">
                    <td id="name1"> ${ani.name}</td>
                    <td><img id="${ani.image}img" src=${ani.image} alt="tiger" ></td>
                    <td >
                        <p id="desc1"  class="desc">${ani.getShortDesc()}
                        </p>
                        <button id ="${ani.name}button">More</button>
                    </td>   
                <tr  id ="${ani.name}row" class = "desc2">  <td colspan = "3">${ani.getLongDesc()}</td>     </tr>
                    
                </tr>
                
                
                   </c:forEach>
            </table>
        </div>
</html>

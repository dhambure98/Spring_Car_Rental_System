<!--*
* @author : A.D.Liyanage
* @service : 1.0
*-->

$("#btnAdmin").click(function (){
    let user = $("#user").val();
    let password = $("#pass").val();
    if (user === "admin" && password === "123"){
        location.href = "admin.html";

    }else {
        alert("Wrong Secret Code Or Password");

    }
});
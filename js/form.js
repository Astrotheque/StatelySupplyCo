/**
 * Created by Nathan on 4/22/2017.
 */
function validateForm(){
        var firstName = document.forms['myform']['firstname'].value;
        var lastName = document.forms['myform']['lastname'].value;
        var webSite = document.forms['myform']['link'].value;
        var email = document.forms['myform']['email'].value;
        var passWord = document.forms['myform']['pass'].value;
        var confirmPass = document.forms['myform']['cpass'].value;
        var selection = document.forms['myform']['sel'].value;
        var availability1 = document.forms['myform']['avail1'].checked;
        var availability2 = document.forms['myform']['avail2'].checked;
        var availability3 = document.forms['myform']['avail3'].checked;
        var availability4 = document.forms['myform']['avail4'].checked;
        var availability5 = document.forms['myform']['avail5'].checked;
        var comment = document.forms['myform']['textbox'].value;
        var zipcode = document.forms['myform']['sZip'].value;
        if (firstName === null || firstName === "") {
            alert("Please Enter Your First Name");
            return false;
        }
        if (lastName === null || lastName === "") {
            alert("Please Enter Your Last Name");
            return false;
        }
        if (webSite === null || webSite === "") {
            alert("Please Enter Your Website Address");
            return false;
        }
        if (email === null || email === "" || email.indexOf("@", 0) < 0 || email.indexOf(".", 0) < 0) {
            alert("Please Enter a Valid E-mail Address");
            return false;
        }
        if (passWord === null || passWord === "") {
            alert("Please Enter a Password");
            return false;
        }
        if (passWord === null || passWord === "") {
            alert("Please Confirm a Password");
            return false;
        }
        if (passWord !== confirmPass) {
            alert("Your Confirmation Password Does Not Match");
            return false;
        }
        if (selection === null || selection === "") {
            alert("Please Select a Reason for Contact");
            return false;
        }
        if (availability1 === false&&availability2 === false&&availability3 === false&&availability4 === false&&availability5 === false) {
            alert("Please Select a Time to be Contacted");
            return false;
        }
        if (comment === null || comment === ""||comment === "Something about yourself.") {
            alert("Please Enter a Comment in the Box");
            return false;
        }
        alert("Confirm Page Test");
        return true;
}
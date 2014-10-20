/**
 * Created by User on 9/7/14.
 */

/**
 * Created by User on 9/7/14.
 */

window.fbAsyncInit = function() {
    FB.init({
        appId      : '804870622878100', // Set YOUR APP ID
        status     : true, // check login status
        cookie     : true, // enable cookies to allow the server to access the session
        xfbml      : true  // parse XFBML
    });

    FB.Event.subscribe('auth.authResponseChange', function(response)
    {
        if (response.status === 'connected')
        {
            //var form;
            //var obj=getUserInfo();
            //window.location.replace("/test/JSON/");
            //document.getElementById("message").innerHTML +=  "<br>Connected to Facebook";
            //SUCCESS

        }
        else if (response.status === 'not_authorized')
        {
            //document.getElementById("message").innerHTML +=  "<br>Failed to Connect";

            //FAILED
        } else
        {
            window.location.replace("/");
            //document.getElementById("message").innerHTML +=  "<br>Logged Out";
            //UNKNOWN ERROR
        }
    });

};

function Login()
{

    FB.login(function(response) {
        if (response.authResponse)
        {
            getUserInfo();
        } else
        {
            console.log('User cancelled login or did not fully authorize.');
        }
    },{scope: 'email,user_photos,user_videos'});

}

function alertViaResponse(data)
{
	alert(data);
}

function getUserInfo() {
    var obj;
    FB.api('/me', function(response) {
        obj=response;
        
        var temp=response.name;
        var x='{"User": [{"name":"'+temp+'"\},';
        x+='{"id":"'+response.id+'"\},';
        x+='{"email":"'+response.email+'"\}]}';
        $.ajax({
        	type: "POST",
        	url: "/test/JSON/",
        	contentType: "application/json",
        	data: x,
        	success: function(data){
        			window.location.href=data;
        	},
    		failure: function(errMsg) {
        		alert(errMsg);
    		}
        });
        //alert(temp);
        //alert(response.name);
    });
    return obj;
}

function getPhoto()
{
    FB.api('/me/picture?type=normal', function(response) {

        var str="<br/><b>Pic</b> : <img src='"+response.data.url+"'/>";
        document.getElementById("status").innerHTML+=str;

    });

}

function Logout()
{
    FB.logout(function(){document.location.reload();});
}

// Load the SDK asynchronously
(function(d){
    var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
    if (d.getElementById(id)) {return;}
    js = d.createElement('script'); js.id = id; js.async = true;
    js.src = "http://connect.facebook.net/en_US/all.js";
    ref.parentNode.insertBefore(js, ref);
}(document));
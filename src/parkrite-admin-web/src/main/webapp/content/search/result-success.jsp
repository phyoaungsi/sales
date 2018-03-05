<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

response.setHeader("Access-Control-Allow-Origin","*");
%>
  <s:set name="isHome" value="true" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parkrite</title>
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
    <script>
$('#homebtn').css("visible","hidden");
var map;
var markers = [];
var iterator=0;
var running_man;
function initialize() {
var myLatLng ;
var zoomlvl=5;
myLatLng = new google.maps.LatLng(16.830162631091017, 96.17090463638306);
var history=$.cookie('location');
if(history!=undefined)
{
    for(i=0;i<history.length;i++){history=history.replace('#','"');}

history=JSON.parse(history);
myLatLng = new google.maps.LatLng(history.lat, history.lng);
zoomlvl=history.zoom;
}
  var mapOptions = {
    zoom: zoomlvl,
    center: myLatLng ,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);



var ctaLayer = new google.maps.KmlLayer({
    url: 'http://quest.whereismyanmar.net/travelmyanmar1.kml'
  });
//  ctaLayer.setMap(map);



 var infowindow = new google.maps.InfoWindow({
    content: 'Change the zoom level',
    position: myLatLng
  });

 // infowindow.open(map);

  google.maps.event.addListener(map, 'zoom_changed', function() {
    var zoomLevel = map.getZoom();
   // map.setCenter(myLatLng);
  var bounds = map.getBounds();
var southWest = bounds.getSouthWest();
var northEast = bounds.getNorthEast();
   // infowindow.setContent('Zoom: ' + zoomLevel+'north'+northEast.lat());
 $("#ambientimage").animate({
width: "90%",
opacity: 0.0,
fontSize: "3em",
borderWidth: "10px",
height:"90%"
}, 1500 );

  });


google.maps.event.addListener(map, 'idle', function() {
    // 3 seconds after the center of the map has changed, pan back to the
    // marker.


     var bounds = map.getBounds();
var southWest = bounds.getSouthWest();

var northEast = bounds.getNorthEast();

    infowindow.setContent('north'+northEast.lat());
    
   
    <s:url id="ajax.movies.first" namespace="/ajax" action="GetLatLngDistributedListAction" />

var pull_url="http://quest.whereismyanmar.net/dsclip.php";
var zoomlvl=map.getZoom();

if(zoomlvl > 12)
{
   pull_url="http://quest.whereismyanmar.net/clip.php";

}
req_init(pull_url,{ lat1: northEast.lat() , lat0: southWest.lat(),lng0: southWest.lng(), lng1: northEast.lng()});

<s:url id="ajax.movies" namespace="/ajax" action="GetLatLngListAction" />

$.ajax({
type: "POST",
dataType: "json", 
url: pull_url,
data: { lat1: northEast.lat() , lat0: southWest.lat(),lng0: southWest.lng(), lng1: northEast.lng()}
}).done(function(datar) {processData(datar);});
 var centerloc=map.getCenter();
 var zoom=map.getZoom();

$.cookie("location",'{#lat#:'+centerloc.lat()+',#lng#:'+centerloc.lng()+',#zoom#:'+zoom+'}', { expires: 2});
 });



}

google.maps.event.addDomListener(window, 'load', initialize);


function toggleBounce(pinmarker) {

  if (pinmarker.getAnimation() != null) {
    pinmarker.setAnimation(null);
  } else {
    pinmarker.setAnimation(google.maps.Animation.BOUNCE);
  }
running_man=pinmarker;
}

function deBounce() {

  if (running_man.getAnimation() != null) {
    running_man.setAnimation(null);
  }
}

function drop(latlng) {
 
    setTimeout(function() {
      addMarker(latlng);
    }, 1 * 200);
  
}

function addMarker(latlng) {


  var marker=new google.maps.Marker({
    position: latlng,
    map: map,
    draggable: false,
    animation: google.maps.Animation.DROP
  });
  markers.push(marker);

 google.maps.event.addListener(marker, 'click', function() {
    map.setZoom(16);
    map.setCenter(marker.getPosition());
  });

 // iterator++;
}

function clearpins() {
  for (var i = 0; i < markers.length; i++ ) {
    markers[i].setMap(null);
  }
  markers= [];
  iterator=0;
}

function processData(datar){
 clearpins();
			$('#map-video-list').html('');
			//var data=JSON.parse(datar);
			var data=datar;
			if(data.movies.length>0)
			{

$("#ambientimage1").animate({
width: "100%",
opacity: 0.9,
fontSize: "3em",
borderWidth: "10px",
height:"100%"
}, 1500 );
$(".left_col1").animate({
opacity: 0.8
}, 1500 );
//$("#db1_content").css('opacity','0.9');

			for(var i=0;i<data.movies.length;i++)
			{
			
			   var movie=data.movies[i];
			   var icon='<li class="clip-result-right  ui-state-default" > '+    
			'<div id="thumbnail" style="float:left" > <img onmouseover="toggleBounce(markers['+iterator+']);" onmouseout="deBounce();" width="140px" height="84px" src="http://www-01.ibm.whereismyanmar.net/images/'+movie.thumbnail+'"></div>'+ 
			     ' <div style="width:150px;text-transform: capitalize;text-align:left;float:right" class="">  '+            
			     ' <a href="/display/showmovie.do?id='+movie.uuid+'">&nbsp;'+movie.title+'</a>'+ 
			      '</div>   '+   
			      ' <div id="description">'+ 
			       '<a href="/viewmap.htm?|'+movie.map.lattitude+'|'+movie.map.longitude+'|'+movie.map.zoomLevel+'"><img width="30px" height="30px" src="/gomovie/images/04_maps.png"></a>'+ 
			       '</div> '+ 
			 ' </li>';
			
			$('#map-video-list').append(icon);
			var pinLocation= new google.maps.LatLng(movie.map.lattitude, movie.map.longitude);
			drop(pinLocation);
			 iterator++;
			}}
			$('#map-video-list > li').hover(
			     function () {
			         // alert('hover');
			        $(this).addClass('ui-state-hover');
			     },
			     function () {
			         $(this).removeClass('ui-state-hover');
			    }
			);

 
			//var i=document.getElementById('super_container');
			//alert(i);
			//if(i==null){
				//$('#container').wrap('<div id="super_container" style="width:100%;height:100%;background:red;display:none;" />');
				//$("#super_container").css('background-image',"url('http://famouswonders.com/wp-content/uploads/2009/04/kandawgyi-lake-yangon-and-shwedagon-pagoda-in-the-background.jpg')");
			//}
			//$("#super_container").fadeOut('slow');
}


    </script>


<script type="text/javascript">
    var xdr;

    function read_data()
    {
        var output = document.getElementById('text_response');
        if(output)
        {
        // To view the responseText on the page, click the Read button. 
            output.innerText = xdr.responseText;
        }

        // The Read button also displays the content type and length of 
        // response in alerts.  
        //alert("Content-type: " + xdr.contentType);
       // alert("Length: " + xdr.responseText.length);
     

    }

    function alert_error()
    {
        alert("XDR onerror");
    }

    function alert_timeout()
    {
       // alert("XDR ontimeout");
    }

    function alert_loaded()
    {
        //alert("XDR onload");
       // alert("Got: " + xdr.responseText);
       var data=JSON.parse(xdr.responseText);
       processData(data);
    }

    function alert_progress()
    {
        //alert("XDR onprogress");
       // alert("Got: " + xdr.responseText);
    }

    function req_abort()
    {
        if(xdr)
        {
            xdr.abort(); // Abort XDR if the Stop button is pressed. 
        }
    }

    function req_init(uri,postdata)
    {
        var url = uri;
        var timeout = 17000;
        if (window.XDomainRequest) // Check whether the browser supports XDR. 
        {
            xdr = new XDomainRequest(); // Create a new XDR object.
            if (xdr)
            {
                // There is an error and the request cannot be completed. 
                // For example, the network is not available.
                xdr.onerror     = alert_error;
                        
                // This event is raised when the request reaches its timeout. 
                xdr.ontimeout   = alert_timeout;
                        
                // When the object starts returning data, the onprogress event 
                // is raised and the data can be retrieved by using responseText.
                xdr.onprogress  = alert_progress;
                       
                // When the object is complete, the onload event is raised and 
                // the responseText ensures the data is available. 
                xdr.onload      = alert_loaded;

                xdr.timeout     = timeout;
                        
                // The URL is preset in the text area. This is passed in the 
                // open call with a get request.
                xdr.open("POST", url);
                       
                // The request is then sent to the server. 
                // alert($.param(postdata));
                xdr.send($.param(postdata));
            }
            else
            {
               // alert('Failed to create new XDR object.');
            }
        }
        else
        {
           
        }
    }

</script>
<style>
body{

//background-image:url('<s:url value="/images/bagan.jpg"/>');
background-repeat:repeat-y;
background-size:100%;
-webkit-background-size: cover; /*for webKit*/
        -moz-background-size: cover; /*Mozilla*/
        -o-background-size: cover; /*opera*/
        background-size: cover; /*generic*/
 filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='<s:url value="/images/bagan.jpg"/>',     sizingMethod=\'scale\');
      -ms-filter: \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='<s:url value="/images/bagan.jpg"/>', sizingMethod=\'scale\')\


}
</style>
 </head>
<body>
Welcome to Parkrite WebService.<br/>
<s:property value="namespace"/>
  <s:a namespace="/dashboard" action="dashboard">DashBoard </s:a><br/>
   <s:a namespace="/carpark" action="carparkcreateform">Carpark  </s:a>
</body>
</html>
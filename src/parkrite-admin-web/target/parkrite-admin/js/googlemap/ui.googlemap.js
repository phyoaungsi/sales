 var map;
    var geocoder;

      function initialize(lat,lng,canvas) {
    	  geocoder = new google.maps.Geocoder();

    	var myLatlng=new google.maps.LatLng(lat, lng);
        var mapOptions = {
          center: myLatlng,
          zoom: 10,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
         map = new google.maps.Map(canvas,
            mapOptions);
        
        var marker = new google.maps.Marker({
            position: myLatlng,
            map: map,
            title:"Click Here for detail!"
            
            
        });
        
     

      map.setCenter(myLatlng);
      }
      
     

   

$.widget('jquery.videomap', {
  options: {},
 
  _create: function () {
       var self = this,
        o = self.options,
        el = self.element;
       

       
       // el.append(H1);

        var div= '<div id="map_canvas" style="width:100%;height:290px"></div>';
      
        el.append(div);
 
  initialize(o.lat,o.lng,$('#map_canvas')[0]);
  
  
  },
  _destroy: function () {},
  _setOption: function (key, value) {}
});
var React = require('react');

var MapContainer = React.createClass({

  componentDidMount()
  {
    var map;
    var mapOptions = {
      zoom: 16,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    };

    map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

    if(navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(function(position) {
        var pos = new google.maps.LatLng(position.coords.latitude,
          position.coords.longitude);

        var marker = new google.maps.Marker({
          map: map,
          draggable:true,
          animation: google.maps.Animation.DROP,
          position: pos

        });
        google.maps.event.addListener(marker, 'click', function(){
          toggleBounce(map,marker);

        });
        map.setCenter(pos);

      }, function() {
        handleNoGeolocation(true);
      });
    } else {
      // Browser doesn't support Geolocation
      handleNoGeolocation(false); //********************* pending
    }

    var getAddress = function(position)
    {
      var lat = position.coords.latitude;
      var lon = position.coords.longitude;

      //grab address via Google API using your position
      var apiurl = 'http://maps.googleapis.com/maps/api/geocode/json?latlng='+lat+','+lon+'&sensor=true';

      //Google does not allow Cross Domain Access so let's use a Proxy: http://benalman.com/projects/php-simple-proxy/
      var url = 'ba-simple-proxy.php?url='+encodeURIComponent(apiurl);

      $.get(apiurl, function(response){
        var address = response.results[0].formatted_address;

        $(React.findDOMNode(this.refs.addressMap)).val(address);

        if(this.props.onLoadAddress)
        {
          this.props.onLoadAddress(address);
        }
      }.bind(this));
    }.bind(this);

    navigator.geolocation.getCurrentPosition(getAddress);
  },

  render()
  {
    return (
      <div className="col-md-12 pull-right" style={{height: '100%', backgroundColor: 'rgba(255,255,255,0.5)', borderRadius: '4px', boxShadow: '0px 1px 5px 1px #45667E', padding: '5px'}}>
        <div className="col-md-12" style={{padding: 0}}>
          <input ref="addressMap" style={{border: 'none'}} type="text" className="form-control" name="addressMap" data-validate="required"  placeholder="Dirección" />
        </div>
        <div id="map-canvas" className="col-md-12" style={{height: 'calc(100% - 31px)', borderRadius: '0 0 4px 4px'}}></div>
      </div>
    );
  }
});

module.exports = MapContainer;
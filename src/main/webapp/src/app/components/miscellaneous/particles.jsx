var React = require('react');

var Particles = React.createClass({

    propTypes: {
      minSpeedX: React.PropTypes.number,
      maxSpeedX: React.PropTypes.number,
      minSpeedY: React.PropTypes.number,
      maxSpeedY: React.PropTypes.number,
      directionX: React.PropTypes.oneOf(['center', 'left', 'right']),
      directionY: React.PropTypes.oneOf(['center', 'up', 'down']),
      density: React.PropTypes.number,
      dotColor: React.PropTypes.string,
      lineColor: React.PropTypes.string,
      particleRadius: React.PropTypes.number,
      lineWidth: React.PropTypes.number,
      curvedLines: React.PropTypes.bool,
      proximity: React.PropTypes.number,
      parallax: React.PropTypes.bool,
      parallaxMultiplier: React.PropTypes.number,
      onInit: React.PropTypes.func,
      onDestroy: React.PropTypes.func
    },
    
    getDefaultProps()
    {
      return {
        minSpeedX: 0.1,
        maxSpeedX: 0.7,
        minSpeedY: 0.1,
        maxSpeedY: 0.7,
        directionX: 'center',
        directionY: 'center',
        density: 10000,
        dotColor: '#fff',
        lineColor: '#fff',
        particleRadius: 7,
        lineWidth: 1,
        curvedLines: false,
        proximity: 100,
        parallax: true,
        parallaxMultiplier: 5,
        onInit: function(){},
        onDestroy: function(){}
      };
    },
    
    getInitialState()
    {
      return{
        height: '150px'
      };
    },
    
    setElement(element)
    {
      this.element = element;
    },

    init()
    {
      $(React.findDOMNode(this.element)).particleground(this.props);
    },
    
    componentDidMount()
    {
        $(React.findDOMNode(this.refs.refParticlesSystem)).particleground(this.props);
        
        /*$(window).on('resize', function(){
          
          var height;
          
          if($(document).height() > $(window).height())
          {
            height = $(document).height();
          }
          
          else
          {
            var height = '100vh';
          }
          
          this.setState({
            height: $(document).height()
          })
        }.bind(this));*/
    },
    
    render()
    {
      return (
        <div className="overlay-gradient hidden-xs" ref="refParticlesSystem" style={{height: this.state.height, width: '100%'}}></div>
      );
    },
    
    pause()
    {
      $(React.findDOMNode(this.element)).particlegound('pause');
    },
    
    start()
    {
      $(React.findDOMNode(this.element)).particlegound('start');
    },
    
    destroy()
    {
      $(React.findDOMNode(this.element)).particlegound('destroy');
    }
});

module.exports = Particles;


var React = require('react');
var TextField = require('./forms/textfield.jsx');
var Label = require('./forms/label.jsx');

var SignIn = React.createClass({
  
  getInitialState()
  {
    var _height = 350;
    var _width = 300;
    var _top = ($(window).height()/2) - (_height / 2);
    var _left = ($(window).width()/2) - (_width / 2);
    
    return {
      _height: _height,
      _width: _width,
      _top: _top,
      _left: _left,
      height: _height + 'px',
      width: _width + 'px',
      top: _top + 'px',
      left: _left + 'px',
      opacity: 0,
      opacityButton: 0
    };
  },
  
  componentDidMount()
  {
    this.setState({
      opacity: .3
    });
    
    var buttonTimer = setTimeout(function(){
      this.setState({
        opacityButton: 1
      });
    }.bind(this),380);
    
    React.findDOMNode(this.refs.userTextfield).focus();
  },
  
  componentWillUnmount()
  {
    this.replaceState(this.getInitialState());
  },
  
  render()
  {
    return (
      <div className="col-xs-12 col-sm-12 col-md-12 loginFormContainer">
        <div className="loginForm center-block" ref="loginContainer" style={{height: this.state.height, width: this.state.width, background: 'rgba(255,255,255,'+this.state.opacity+')', opacity: this.state.opacityButton, backgroundColor: "white", borderRadius: "4px" }}>
          <div style={{padding: '20px 20px'}}>
            <h3 style={{color: 'white'}}>Autenticación</h3>
            <br/>
            <span style={{color: 'white'}}>Usuario</span>
            <TextField ref="userTextfield" />
            
            <br/>
            <br/>
            
            <span style={{color: 'white'}}>Contraseña</span>
            <TextField />
            
            <br/>
            <br/>
            
            <a href="" className="btn btn-success col-md-12" style={{width: '100%'}}>Entrar</a>
          </div>
        </div>
        <br/>
        <div className="transition" style={{textAlign: 'center', opacity: this.state.opacityButton}}>
          <a href="/#/signup" style={{color: 'white', fontWeight: '500', fontSize: '12px'}}>¿No tienes una cuenta?</a>
        </div>
      </div>
    );
  }
});

module.exports = SignIn;

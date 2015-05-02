var React = require('react');
var Authenticated = require('../authenticated.jsx');
var MapContainer = require('./map.jsx');

var SignUp = React.createClass({

  getInitialState()
  {
    var _height = $(window).height() - 150;
    var _width = 300;
    var _top = ($(window).height()/2) - (_height / 2) - 100;
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
    this.props.onInit('signup');

    this.setState({
      opacity: .3
    });
    
    var buttonTimer = setTimeout(function(){
      this.setState({
        opacityButton: 1
      });
    }.bind(this),380);

    //this.setUpMap();
    
    React.findDOMNode(this.refs.name).focus();
  },
  
  render()
  {
    return (
      <div>
      <div className="hidden-xs col-sm-12 col-md-12 col-lg-12"></div>
      <div className="hidden-xs col-sm-12 col-md-12 col-lg-12"></div>
      <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12" style={{padding: '40px 0 20px'}}>
        <div className="signupForm col-xs-12 col-sm-11 col-md-11 col-lg-10 center-block" ref="signupContainer" style={{height: '100%', float: 'none', background: 'rgba(255,255,255,'+this.state.opacity+')', opacity: this.state.opacityButton, borderRadius: "4px"}}>
          <div style={{position: 'absolute', top: '-15px', left: '0', borderRadius: '4px 4px 0 0', height: '35px', width: '100%', fontSize: '23px', color: '#45667E'}}>
            <a href="/#/signin"><i className="fa fa-arrow-left" style={{padding: '10px 10px', float: 'left'}}></i></a>
            <h4 style={{fontSize: '23px', padding: '0 0 3px 20px'}}>Registro</h4>
          </div>
          <div style={{height: '100%', paddingTop: '50px'}}>
            <div className="col-md-6">
              <form id="myform" role="form"  method="post" className="validate">
                <div className="row">
                  <div className="col-md-6">
                    <div className="input-group">
                      <input ref="name" type="text" className="form-control" name="name" data-validate="required" data-message-required="This is custom message for required field."  placeholder="Nombre" autoComplete="off" />
                      <div className="input-group-addon">
                        <i className="entypo-user"></i>
                      </div>
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="input-group">
                      <input type="text" className="form-control" name="lastname"data-validate="required" data-message-required="This is custom message for required field."  placeholder="Apellidos" autoComplete="off" />
                      <div className="input-group-addon">
                        <i className="entypo-user"></i>
                      </div>
                    </div>
                  </div>
                </div>
                <br/>
                <div className="row">
                  <div className="col-md-9">
                    <div className="input-group">
                      <input type="email" className="form-control" name="email" data-validate="required" data-message-required="This is custom message for required field."  placeholder="Email" />
                      <span className="input-group-addon" data-toggle="tooltip" data-placement="right" title="" data-original-title="Tooltip on right">
                        <i className="entypo-mail"></i>
                      </span>
                    </div>
                  </div>
                  <div className="col-md-3">
                    <div className="input-group">
                      <select className="form-control" name="email" data-validate="required" data-message-required="This is custom message for required field." placeholder="Gender">
                        <option>M</option>
                        <option>F</option>
                      </select>
                      <span className="input-group-addon" data-toggle="tooltip" data-placement="right" title="" data-original-title="Tooltip on right">
                        <i className="entypo-users"></i>
                      </span>
                    </div>
                  </div>
                </div>
                <br/>
                <div className="row">
                  <div className="col-md-8">
                    <div className="input-group">
                      <input ref="address" type="text" className="form-control" name="address"data-validate="required" data-message-required="This is custom message for required field."  placeholder="Dirección" autoComplete="off" />
                      <div className="input-group-addon">
                        <i className="entypo-user"></i>
                      </div>
                    </div>
                  </div>
                  <div className="col-md-4">
                    <div className="input-group">
                      <input type="text" className="form-control" name="phone"data-validate="required" data-message-required="This is custom message for required field."  placeholder="Teléfono" autoComplete="off" />
                      <div className="input-group-addon">
                        <i className="entypo-user"></i>
                      </div>
                    </div>
                  </div>
                </div>
                <br/>
                <div className="row">
                  <div className="col-md-6">
                    <div className="input-group">
                      <input type="date" className="form-control datepicker" name="birthdate" data-format="dd MM yyyy" name="fechanacimiento"data-validate="required" data-message-required="This is custom message for required field." placeholder="Fecha de nacimiento"/>
                      <div className="input-group-addon">
                        <i className="entypo-user"></i>
                      </div>
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="input-group">
                      <input type="text" className="form-control" name="groupId"data-validate="required" data-message-required="This is custom message for required field."  placeholder="Group ID" value="1" autoComplete="off" />
                      <div className="input-group-addon">
                        <i className="entypo-user"></i>
                      </div>
                    </div>
                  </div>
                </div>
                <br/>
                <br/>
                <div className="row">
                  <div className="col-md-12">
                    <div className="input-group">
                      <input type="text" className="form-control" name="username" data-validate="required"  placeholder="Username" />
                      <div className="input-group-addon" data-toggle="popover" data-trigger="hover" data-placement="right" data-content="It's so simple to create a tooltop for my website!" data-original-title="Digite un username valido">
                        <i className="entypo-user"></i>
                      </div>
                    </div>
                  </div>
                </div>
                <br />
                <div className="row">
                  <div className="col-md-6">
                    <div className="input-group">
                      <input type="password" className="form-control" id="password" name="password" data-validate="required" data-message-required="This is custom message for required field." placeholder="Contraseña"/>
                      <span className="input-group-addon">
                        <i className="entypo-lock"></i>
                      </span>
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="input-group">
                      <input type="password" className="form-control" id="password_again" name="password_again" data-validate="equalTo[#password]"placeholder="Confirmar Contraseña" />
                      <span className="input-group-addon">
                        <i className="entypo-lock"></i>
                      </span>
                    </div>
                  </div>
                </div>
                <br/>
                <br/>
                <div className="row">
                  <div className="col-md-6">
                    <div className="checkbox">
                      <label>
                        <input type="checkbox">Deseo recibir noticias y ofertas especiales</input>
                      </label>
                    </div>
                  </div>
                  <div className="col-md-6">
                    <div className="form-group pull-right">
                      <button type="submit" className="btn btn-success" name="registrarse">Registrarse</button>
                    </div>
                  </div>
                </div>
              </form>
            </div>
            <div className="col-md-6 pull-right" style={{height: 'calc(100vh - 338px)'}}>
              <MapContainer onLoadAddress={this._onLoadAddress} />
            </div>
          </div>
          <div style={{clear: 'both'}}></div>
        </div>
      </div>
      </div>
    );
  },

  _onLoadAddress(address)
  {
    $(React.findDOMNode(this.refs.address)).val(address);
  }
});

module.exports = SignUp;
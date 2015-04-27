var React = require('react');
var RouterMixin = require('react-mini-router').RouterMixin;

var Loader = require('./loader.jsx');
var Header = require('./header.jsx');
var Footer = require('./footer.jsx');

var Content = require('./content.jsx');
var SignUp = require('./signup.jsx');

//var Main = React.createClass({
var Main = React.createClass({
  
  mixins: [RouterMixin],
  
  routes: {
    '/': 'home',
    '/signup': 'signup'
  },
  
  render() {
    return this.renderCurrentRoute();
  },
  
  home() {
    return (
      <div>
          <Loader />
          <Header />
          <Content />
          <Footer />
      </div>
    );
  },

  signup() {
    return (
      <div>
          <Header />
          <SignUp />
          <Footer />
      </div>
    );
  },
});

module.exports = Main;
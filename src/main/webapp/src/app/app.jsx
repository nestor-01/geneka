(function(){
  var injectTapEventPlugin = require("react-tap-event-plugin");
  injectTapEventPlugin();
  window.React = React;
})();

var React = require('react'),
    Loader = require('./components/loader.jsx'),
    SignIn = require('./components/signin.jsx'),
    SignUp = require('./components/signup.jsx'),
    Header = require('./components/header.jsx'),
    Content = require('./components/content.jsx'),
    Particles = require('./components/miscellaneous/particles.jsx'),
    
    Router = require('react-router'),
    DefaultRoute = Router.DefaultRoute,
    Route = Router.Route,
    RouteHandler = Router.RouteHandler;
    
var App = React.createClass({
  
  render: function ()
  {
    return (
      <div>
        <Loader />
        <Particles />
        <Header />
        <RouteHandler/>
      </div>
    );
  }
  
});

var routes = (
  <Route name="home" path="/" handler={App}>
    <Route name="signin" path="/signin" handler={SignIn} />
    <Route name="signup" path="/signup" handler={SignUp} />
    <DefaultRoute handler={Content}/>
  </Route>
);

Router.run(routes, function (Handler) {
  React.render(<Handler/>, document.body);
});

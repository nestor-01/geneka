var React = require('react');
var Loader = require('./loader.jsx');
var Header = require('./header.jsx');
var Footer = require('./footer.jsx');
var Content = require('./content.jsx');

var Main = React.createClass({

  render: function()
  {
    return (
        <div>
            <Loader />
            <Header />
            <Content />
            <Footer />
        </div>
    );
  }
});

module.exports = Main;


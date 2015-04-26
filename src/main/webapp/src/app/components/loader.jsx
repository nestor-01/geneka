var React = require('react');

var Loader = React.createClass({

    componentDidMount: function()
    {
        $(window).load(function() {
            $(this.refs.loadWrapper.getDOMNode()).delay(450).fadeOut();
            $(this.refs.loader.getDOMNode()).delay(750).fadeOut('slow');
        }.bind(this));
    },

    render: function()
    {
        return (
            <div ref="loadWrapper" id="loader-wrapper">
                <div ref="loader" id="loader"></div>
            </div>
        );
    }
});

module.exports = Loader;


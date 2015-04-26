var React = require('react');
var ContactSection = require('./sections/contactSection.jsx');
var NewsletterSection = require('./sections/newsletterSection.jsx');
var GallerySection = require('./sections/GallerySection.jsx');
var TestimonialSection = require('./sections/testimonialsSection.jsx');

var Content = React.createClass({

    render: function()
    {
        return (
            <div id="content">
                <GallerySection />
                <TestimonialSection />
                <NewsletterSection />
                <ContactSection />
            </div>
        );
    }
});

module.exports = Content;
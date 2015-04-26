var React = require('react');
var ContactSection = require('./sections/contactSection.jsx');
var NewsletterSection = require('./sections/newsletterSection.jsx');
var GallerySection = require('./sections/gallerySection.jsx');
var FeatureSection = require('./sections/featureSection.jsx');
var TestimonialSection = require('./sections/testimonialsSection.jsx');

var Content = React.createClass({

    render: function()
    {
        return (
            <div id="content">
                <br/>
                <GallerySection />
                <FeatureSection features={[
                    {
                        icon: 'rocket',
                        title: 'Diseño moderno',
                        content: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempo'
                    },
                    {
                        icon: 'cogs',
                        title: 'Fácil de personalizar',
                        content: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempo'
                    }
                ]} baseDir='img/bg/' images={[
                    {
                        src: 'phones1.png',
                        offset: '300',
                        delay: '0s'
                    },
                    {
                        src: 'phones2.png',
                        offset: '300',
                        delay: '0.5s'
                    }
                ]} />
                <TestimonialSection />
                <NewsletterSection />
                <ContactSection />
            </div>
        );
    }
});

module.exports = Content;
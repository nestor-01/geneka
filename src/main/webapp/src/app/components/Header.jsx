var React = require('react');
var TopMenu = require('./topMenu.jsx');
var Swiper = require('./carousels/swiper.jsx');

var Header = React.createClass({

    render: function()
    {
        return (
            <header>

                {/* Intro */}
                <div id="intro" className="overlay-gradient" data-scroll-index="0">

                    {/* Top Bar */}
                    <div className="top-bar">
                        <div className="container">
                            <div className="row">
                                <div className="col-md-12">

                                    {/* Logo */}
                                    <div className="logo">
                                        <a title="" href="#">Geneka!</a>
                                    </div>

                                    <TopMenu items={[
                                        {
                                            section: "0",
                                            text: "Inicio"
                                        },
                                        {
                                            section: "1",
                                            text: "Galería"
                                        },
                                        {
                                            section: "2",
                                            text: "Suscripciones"
                                        },
                                        {
                                            section: "3",
                                            text: "Contacto"
                                        }
                                    ]} />
                                </div>
                            </div>
                        </div>
                    </div> {/* Top Bar End */}

                    <div className="container">
                        <div className="row">
                            <div className="col-md-12">

                                {/* Intro Heading */}
                                <div className="headline">
                                    <h1 className="wow fadeInDown">¡TODO LO QUE QUIERES EN UN SOLO SITIO!</h1>
                                    <p className="wow fadeInDown" data-wow-delay="0.5s">Lo último en tecnología, repuestos importados de la mejor calidad</p>
                                </div>
                                {/* Intro Heading End */}

                                <Swiper baseDir="img/bg/" images={["phone1.png", "phone2.png", "phone3.png"]} />
                            </div>
                        </div>
                    </div>
                </div> {/* Intro End */}
            </header>
        );
    }
});

module.exports = Header;
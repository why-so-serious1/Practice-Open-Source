import React from "react";
import { NavLink } from "react-router-dom";
import resume from '../../static/images/resume.png';
class landingpage extends React.Component {
   
  render(){
  return (
    <div className="App">
     <div className="container-landingpage">
       <div className="heading text-center">
      <h1> Create a resume that stands out</h1>
       </div>
       <div className="sub-heading text-center"><h3>
       Create a Resume that perfectally describes your skils and match job profile.
      </h3> </div>
       <div className="lp-btn-container text-center">
         <NavLink to="/gettingStarted" className="btn">Get Started For Free</NavLink>
       </div>
       <img src={resume} className="image-logo " alt="logo"></img>
     </div>
    </div>
  );}
}

export default landingpage;

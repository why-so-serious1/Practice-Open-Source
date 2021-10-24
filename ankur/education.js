import React from "react";
import { NavLink } from "react-router-dom";
import {fieldCd} from '../../constants/typeCodes';
import ResumePreview from './ResumePreview.js';

class education extends React.Component {
constructor(props,context){
    super(props,context);
    this.state={
        educationSection: this.props.educationSection,
        contactSection:this.props.contactSection,
        skinCd:this.props.skinCd
        
    }
}

onchange=(event)=>{
    const Key=event.target.name;
    const value=event.target.value;
    //this.setState({[Key]:value});
    this.setState({educationSection:{...this.state.educationSection,[Key]:value}});
    console.log(Key+" "+value);
   
}
onClick=(event)=>{
   
    this.props.educationActions.add(this.state.educationSection);
    this.props.history.push('/finalize');
}



    render(){
    return (
      <div className="App">
      <div className="contact-conatiner">
          <div className="personal-details">
              <h2 className="text-center">Educational Section</h2>
              <div className="Name-container">
           <div className="Name">
               <p className="contact-para">College Name</p>
               <input className="input-contact" type="text" name={fieldCd.SchoolName} value={this.state.educationSection[fieldCd.SchoolName] }onChange={this.onchange}></input>
           </div>
           <div className="Name">
               <p className="contact-para">Degree</p>
               <input className="input-contact" type="text" name={fieldCd.Degree} value={this.state.educationSection[fieldCd.Degree]} onChange={this.onchange}></input>
           </div>
</div>
           
           <div className="Name-container">
           <div className="Name">
               <p className="contact-para">CGPA</p>
               <input className="input-contact" type="text" name={fieldCd.GraduationCGPA} value={this.state.educationSection[fieldCd.GraduationCGPA]} onChange={this.onchange}></input>
           </div>
           <div className="Name">
               <p className="contact-para">City/State</p>
               <input className="input-contact" type="text" name={fieldCd.SchoolCity} value={this.state.educationSection[fieldCd.SchoolCity]} onChange={this.onchange}></input>
           </div>
               </div>

               <div className="Name-container">
           <div className="Name">
               <p className="contact-para">Graduation Month</p>
               <input className="input-contact" type="text" name={fieldCd.GraduationDate} value={this.state.educationSection[fieldCd.GraduationDate]} onChange={this.onchange}></input>
           </div>
           <div className="Name">
               <p className="contact-para">Graduaton Year</p>
       
               <input className="input-contact" type="text" name={fieldCd.GraduationYear} value={this.state.educationSection[fieldCd.GraduationYear]} onChange={this.onchange}></input>
           </div>
           </div>
           


<button className="contactbtn btn " onClick={this.onClick}>Next</button>
<div className="contactbtnback">
<NavLink to="/contact" className=" btn white ">Back</NavLink>
</div>
          </div>
          <div className="contact-preview">
          
              <ResumePreview contactSection={this.state.contactSection} educationSection={this.state.educationSection}></ResumePreview>
          </div>
      </div>
      </div>
    );}
  }

  export default education;
  
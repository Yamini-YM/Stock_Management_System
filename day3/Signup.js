import React, { useState } from 'react';
import './Login.css';
import { Link } from 'react-router-dom';
const Signup = () => {
  const [formData, setFormData] = useState({
    
    email: '',
    password: '',
    confirm: '',
  });

  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validateForm()) {
      // Form is valid, perform registration or submit data
      console.log('Form data:', formData);
      // Reset form fields
      setFormData({
        
        email: '',
        password: '',
        confirm: '',
      });
      setErrors({});
    }
  };

  const validateForm = () => {
    const {  email, password,confirm} = formData;
    const errors = {};


    // Email validation
    if (!email) {
      errors.email = 'Email is required';
    } else if (!/\S+@\S+\.\S+/.test(email)) {
      errors.email = 'Invalid email format';
    }

    // Password validation
    if (!password) {
      errors.password = 'Password is required';
    } else if (password.length < 6) {
      errors.password = 'Password should be at least 6 characters long';
    }

    if(!confirm){
        errors.confirm = 'Confirm Password';
    }else if(confirm.length < 6){
        errors.confirm = 'Password should be at least 6 characters long';
    }

    setErrors(errors);
    return Object.keys(errors).length === 0; // Return true if there are no errors
  };

  return (
    <div className="registration-form-container">
     
      <h1>Sign Up </h1>
      <form  action='http://localhost:3000/RegistrationForm'>
     
        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input type="email" required id="email" name="email" value={formData.email} onChange={handleChange} />
          {errors.email && <span className="error">{errors.email}</span>}
        </div>

        <div className="form-group">
          <label htmlFor="password">Password:</label>
          <input type="password" required id="password" name="password" value={formData.password} onChange={handleChange} />
          {errors.password && <span className="error">{errors.password}</span>}
        </div>

        <div className="form-group">
          <label htmlFor="confirm">Confirm Password:</label>
          <input type="confirm" required id="confirm" name="confirm" value={formData.confirm} onChange={handleChange} />
          {errors.confirm && <span className="error">{errors.confirm}</span>}
        </div>

        <button type="submit">Sign Up</button>
        <br></br>
        <p><center>Have an Account? <Link to="/Login">Login</Link></center></p>
      </form>
    </div>
  );
};

export default Signup;
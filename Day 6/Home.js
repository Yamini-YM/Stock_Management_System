import React, { useState, useEffect } from 'react';
import Header from './Header';
//import About from './About';
import './Home.css';
import Footer from './Footer';
import { alignProperty } from '@mui/material/styles/cssUtils';
function Home() {
    // Create state variables for the index and image array
    const [index, setIndex] = useState(0);
    
    const images = ['https://img.freepik.com/free-vector/handling-order-processing-abstract-concept-vector-illustration-order-documentation-processing-system-handling-customer-request-logistics-automated-logistics-operations-abstract-metaphor_335657-1789.jpg?w=2000', 'https://www.echelonedge.com/wp-content/uploads/2023/05/Network-Inventory-Management.png', 'https://as1.ftcdn.net/v2/jpg/03/61/74/18/1000_F_361741860_2CZlVLR94um5WBkTSB6nfupVhKZM2EYv.jpg'];
    
    
    
    useEffect(() => {
        const intervalId = setInterval(() => {
            setIndex(prevIndex => (prevIndex + 1) % images.length);
        }, 3000);

        return () => clearInterval(intervalId);
    }, []);
    
    // Render the current image
    return (
       
        <>
            
    
        <div className='home'>
        
    {/* <h2>Manage your orders</h2>
    <p>
    Stock control software is an application used by businesses of all sizes to manage their stock. Within a solution, you can view stock levels, items in, and despatched orders in one central system.
    Stock management helps keep customers happy by reducing out of stock situations. There's therefore no need to put items on back order and no risk of lost sales. When you're always able to satisfy customer demand like this, 
    and because your stock is accurate, customers will receive the correct orders.Stock management includes different tasks such as counting, ordering, and restocking inventory, and forecasting the demand to ensure optimal stock levels. These four stock control 
    methods help businesses streamline their inventory management to achieve the perfect stock levels at all times.There are several types of inventory management systems that businesses use depending on how they operate. Three examples are manual inventory, periodic inventory and perpetual inventory. 
    
    </p>  */}
  

        </div>
      <center>
        <img src={images[index]}  style={{width: '800px', height: '600px', top: '50%', position: 'top 120px' }} />

        </center>
        <br/>
        <br/>
       <Footer/>
        
        </>
        
        
        );
}

export default Home;
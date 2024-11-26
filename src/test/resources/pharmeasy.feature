@All
Feature:Pharmeasy
Background:
Given the user launch the application "https://pharmeasy.in/online-medicine-order?isSEM=true&utm_source=google&utm_medium=cpc&utm_campaign=ITW_Brand_FP_Broad&gad_source=1&gclid=CjwKCAiA9IC6BhA3EiwAsbltON2N4Z_L8MtThqYzPxZjT2Jm4mVa59f1VnfUxVNy0Iv9vtDHdHNPFBoC9sIQAvD_BwE"
    
 @medicine
 Scenario:Medicine Functionality
 When the user click the medicine 
 And the user click the search
 And the user select the medicine 
 And the user click addtocart button
 And the user select the quantity
 And the user click the viewcart button 
 
 @labtest
 Scenario:LabTest functionality
 When the user click the Lab Test 
 And the user select any Certified Lab partner 
 And the user select the Test type
 And  the user book the test
 And the user enter the number of patients
 
 @productname
 Scenario:user validate the product and price under healthcare
 When the user click the healthcare dropdown
 And the user select the product
 And the user validate the product

 
 @healthcare
 Scenario:healthcare functionality
 When the user click the healthcare dropdown
 And the user select the product
 And the user click the product
 And the user click add to cart
 And the user select the quntity
 And the user click the view to cart
 
 


# lab 6

### version 1.0.0

in this library 2 classes 
1. Restaurant:  
in this class we have 4 properties which are:  
   - the name of the restaurant 
   - the star rating for the restaurant
   - the price catagory
   - an arraylist for the reviews 
2. Reveiw: 
this class has 3 proprties :
   - the body which is the review it self
   - the rating for the restaurant you reviewed 
   - the name of the reviewer

and there is a method called `addReview()` where the user can add his review for a specific restaurant.

### version 1.0.1 

I've added an interface and 3 other classes 

- ReviewMe interface : an interface that has an abstract addReview method 

- shop : a class that implements the interface and overrides the addReview method for the user to add a review about this shop  

- Theater : a class that implements the interface and overrides the addReview method for the user to add a review about this Theater and the movie he/she watched and store in a list

- ReviewMovie : a class that extends the Review class to give the user the chance to add the name of the movie in thier review 
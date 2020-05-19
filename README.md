# Reservation System

The application was made using the following languages and frameworks:

- Java
- Angular 9
- HTML
- CSS
- Spring boot
- Hibernate
- MySQL

To run the front end application you need to use, in the webapp file, the following commands:

npm install
ng serve

In addition, it is necessary change the database data in the application properties file in the back end part.

Despite having followed the requirements of the application as in the document, I made some changes that follow below:

The list of contacts that have reservations registered is displayed on the reservation list screen. 
Thus, for the reservation to be edited as well as the contact, it is necessary to click on the edit button.
To delete the contact, there is a button on the Reservation Creation screen. And to delete the reservation, there is a button on the Reservation List screen.
When creating the reservation, the contact is also created if it does not exist. 
And, if it exists, that reservation is associated with the contact, avoiding duplication of contacts in the database.

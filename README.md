# Ecom
# Ecom
This is a basic website familiar to ecommerce website were you can add, update, andd delete products.
- Product parameters used are name,date of released, price, image,brand,description,category,availablity of product.

**Backend-java**
- Open the "ecom-backend-java" folder using IDE like VScode or Intellj Idea.
- The backend code is in java programming language.
- This is on Maven Project.
- Spring Boot Framework is used along with dependencies Lombok, H2 database, Spring JPA.
- Using Spring MVC, the request and resopnse is handled with the RestAPI.
- To store data H2 database is used.
- To access h2 database use the url "http://localhost:8080/h2-console)
- If you want add some product data to the database through backend side then go to ecom/src/main/resources folder in that folder you can write the SQL queries the data.sql file.

  **Commands to run backend server in your local machine**
  - Open the "ecom-backend-java" folder using IDE like VScode or Intellj.
  - Then Click on "Run".
  - The server will be running in your local machine on port 8080.
 
**note:**Be ensure to run backend server before running frontend application because the data is to be communicated from server to client so that entire application will run smoothly.

**FrontEnd- React**
- Frontend work is built with the react-js.
- CSS styling is minimal.
- In this react application, Promise based HTTP client Axios is used.
- The data is collected by sending request to backend (in backend RestConttoller will accept the request and sends response to client i.e frontend).

  **Commands to run React application**
- To run the react application open the the folder "ecom-frontend" in your machine with IDE like VScode.
- Go to the terminal and type "npm run dev"
- The application will be running on port 5173 on your local machine.

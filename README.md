# 📚 Online Book Store Application

The Online Book Store Application is a Java-based web platform designed to solve the real-world problem of limited access to physical bookstores and the time-consuming process of book shopping. It provides users with a convenient way to browse, search, and purchase books online, making reading more accessible and efficient. This system addresses the need for 24/7 book availability, easy discovery of titles, and a smooth buying experience from anywhere this is a Java-based web application that allows users to browse, search, and purchase books online. It includes user registration/login, book listings, shopping cart functionality, and order management. Admins can manage inventory and handle orders through a dedicated admin panel. The project aims to provide an easy and efficient way to buy and sell books online.

---

### ℹ️ About

A user-friendly Online Bookstore project in which users can log in or register, view the available books, select books along with their quantity, and buy them. Users can also get payment receipts after successful payment. The project can also be used by the administrator, who can add new books, remove books, increase and decrease the quantity of books, change the price of the books as well as maintain the selling history of books.

---

### 🎯 This Website is built for following purpose:-
- For Selling books online.
- Maintaining books selling history.
- Adding and managing books.
- User Friendly.
- For Implementation of Http Servlets in Java.
- This is a Mini-project developed using Java, Jdbc, And Servlets.

---

### 👨‍💼 Admin Have Following Access for this online store site:-
- Add New Books.
- View Books Available.
- Remove Books.
- Increase Books Amount.

---

### 🙋‍♂️ Users Have Following Access for this online store site:-
- Create New Account or Register.
- Login.
- View Available Books.
- Select Books to Buy.
- Select Books Quantity.
- Buy Books.
- Get Payment Receipt.

### 🛠️ Technologies used:-
1. Front-End Development:
- HTML
- CSS
- Javascript
- BootStrap

2. Back-End Development:
- Java [JDK 8+]
- JDBC
- Servlet

3. Database:
- MySql

---  

## 📸 Some Screenshots for the project:

### 👤 User Role

- Home
  
![Screenshot 2025-04-11 220202](https://github.com/user-attachments/assets/d331ef0f-73ca-432e-87fa-64cc0f4c3c60)

- Login
  
![Screenshot 2025-04-11 220220](https://github.com/user-attachments/assets/eea4d376-9b60-4318-b394-28abfefbf048)

- When double tab on login display this
  
![Screenshot 2025-04-11 220232](https://github.com/user-attachments/assets/7b7ee656-9c20-48c6-96e1-ca74182338df)

- Registration
  
![Screenshot 2025-04-11 220249](https://github.com/user-attachments/assets/72fac551-8b7e-422f-85c1-d8ff60b8ca98)

- User Registered Successfully
  
![Screenshot 2025-04-12 172716](https://github.com/user-attachments/assets/cc154d65-5ce7-4a5a-a1cf-be2ccced8095)

- User Login
  
![Screenshot 2025-04-11 220657](https://github.com/user-attachments/assets/db43f1ea-c687-412c-8720-b213227d591f)

- Available Books
  
![Screenshot 2025-04-11 220720](https://github.com/user-attachments/assets/5b3005f2-a4bf-4b0f-851b-a95739d9c43a)

![Screenshot 2025-04-11 220730](https://github.com/user-attachments/assets/41cb3d7e-b7b1-4c74-86fc-fa0921aa0d03)

- Add To cart
  
![Screenshot 2025-04-11 220749](https://github.com/user-attachments/assets/a232ee25-0026-4c18-a7ab-22da506991fc)

- Cart
  
![Screenshot 2025-04-11 220803](https://github.com/user-attachments/assets/7f3311c7-b7a2-443d-ae3a-98287995f051)

- When Click Proceed Pay Button Redirect Cart Checkout Page
  
![Screenshot 2025-04-11 221518](https://github.com/user-attachments/assets/33b52619-e2eb-4922-a70a-8df2c1df8342)

- Your Orders
  
![Screenshot 2025-04-11 221537](https://github.com/user-attachments/assets/49b846f0-d30b-4eb9-9760-cf93cafe71a3)

---

### 🛡️ Admin Role

- Login
  
![Screenshot 2025-04-11 221041](https://github.com/user-attachments/assets/a9caa54a-859e-4c8d-9d0a-160187cdff99)

- Admin Login
  
![Screenshot 2025-04-11 221029](https://github.com/user-attachments/assets/7cbfa0ac-c5b5-4b85-ba0e-d569b26ae8e5)

- Store Books
  
![Screenshot 2025-04-11 221059](https://github.com/user-attachments/assets/59485e53-d681-4d41-9e2d-48eb9ef1bde4)

- Add Books
  
![Screenshot 2025-04-11 221115](https://github.com/user-attachments/assets/30610cfb-87aa-40a0-8d5d-5ad48fdd71d8)

- Remove Books
  
![Screenshot 2025-04-11 221127](https://github.com/user-attachments/assets/52f22590-d5e9-470d-9f88-c84bacf6e278)

---

## ================ 💻 Software And Tools Required ================
- : Java JDK 8+ 
- : Eclipse EE (Enterprise Edition) 
- : Apache Maven 
- : Tomcat v8.0+
- : MySQL Server 
- : MySQL Workbench

---  

## ================= 🗄️ MySQL Database =================

### Copy and Run in MySQL Workbench

```
create database if not exists onlinebookstore;

use onlinebookstore;

create table if not exists books(barcode varchar(100) primary key, name varchar(100), author varchar(100), price int, quantity int);

create table if not exists users(username varchar(100) primary key,password varchar(100), firstname varchar(100),
    lastname varchar(100),address text, phone varchar(100),mailid varchar(100),usertype int);

insert into books values('9780134190563','The Go Programming Language','Alan A. A. Donovan and Brian W. Kernighan',400,8);
insert into books values('9780133053036','C++ Primer','Stanley Lippman and Josée Lajoie and Barbara Moo',976,13);
insert into books values('9781718500457','The Rust Programming Language','Steve Klabnik and Carol Nichols',560,12);
insert into books values('9781491910740','Head First Java','Kathy Sierra and Bert Bates and Trisha Gee',754,23);
insert into books values('9781492056300','Fluent Python','Luciano Ramalho',1014,5);
insert into books values('9781720043997','The Road to Learn React','Robin Wieruch',239,18);
insert into books values('9780132350884','Clean Code: A Handbook of Agile Software Craftsmanship','Robert C Martin',288,3);
insert into books values('9780132181273','Domain-Driven Design','Eric Evans',560,28);
insert into books values('9781951204006','A Programmers Guide to Computer Science','William Springer',188,4);
insert into books values('9780316204552','The Soul of a New Machine','Tracy Kidder',293,30);
insert into books values('9780132778046','Effective Java','Joshua Bloch',368,21);
insert into books values('9781484255995','Practical Rust Projects','Shing Lyu',257,15);
insert into users values('Pratik','password','Pratik','Khot','Mumbai','42502216225','pratikkhot@gmail.com',2);
insert into users values('Admin','Admin','Admin','BookStore','Mumbai','9584552224521','admin@gmail.com',1);

commit;

```

---

 ## 📞 Contact Information

  🐙 GitHub: https://github.com/pratikkhot100

  💼 LinkedIn: https://www.linkedin.com/in/pratikkhot01

  📧 Email: pratikkhot1207@gmail.com

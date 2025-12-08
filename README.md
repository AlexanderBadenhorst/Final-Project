# 📘 Library Management API
A Spring Boot 3 application for managing a simple library system. It includes JWT authentication, PostgreSQL persistence, Docker-based deployment, and Swagger UI for API exploration. The system supports CRUD operations for Authors, Books, Borrowers, Loans, and Users, with a one-to-many relationship between Authors and Books.

## 🚀 Features
- JWT Authentication (register, login, secure endpoints)
- CRUD operations for all core entities
- PostgreSQL database running via Docker
- Swagger UI for interactive API testing
- Fully containerized environment using Docker Compose

## 📥 How to Download the App From GitHub
Clone the repository:
```
git clone https://github.com/YourGitHubName/YourLibraryRepo.git
cd YourLibraryRepo
```

## 🐳 How to Build and Run the App With Docker
Ensure Docker Desktop is running.

### Start the full system:
```
docker compose up --build
```

This launches:
- PostgreSQL container on **5433**
- Spring Boot API container on **8080**

### Stop everything:
```
docker compose down
```

## 🌐 Accessing the API
Swagger UI:
```
http://localhost:8080/swagger-ui/index.html
```

API Root:
```
http://localhost:8080/
```

## 🔐 Testing JWT Authentication in Swagger

### 1. Register a new user  
POST `/api/auth/register`
```
{
  "username": "alex",
  "password": "password",
  "role": "ADMIN"
}
```

### 2. Login to obtain the JWT  
POST `/api/auth/login`  
Returns:
```
{
  "token": "your.jwt.token"
}
```

### 3. Authorize all protected endpoints  
Click **Authorize** in Swagger  
Paste:
```
Bearer your.jwt.token
```

## 📚 Testing CRUD Endpoints
Once authorized, you may test all controllers directly in Swagger:

- **Author**: Create authors, list them, update, delete  
- **Book**: Add books, assign authors, modify copies  
- **Borrower**: Register borrowers  
- **Loan**: Create and return loans  
- **User**: Admin-only user management

Everything runs fully inside Docker and uses the PostgreSQL container as its database.

## ✅ Summary
This project demonstrates:
- Spring Boot 3 best practices  
- Secure API design with JWT  
- Dockerized deployment for backend + database  
- Swagger-based documentation  
- Functional one-to-many data relationships  
- Clean CRUD-based service architecture  

You now have a complete backend that can run anywhere Docker runs.


# 📘 Library Management API

A Spring Boot 3 application for managing a simple library system.  
It includes JWT authentication, PostgreSQL persistence, Docker-based deployment,  
and Swagger UI for API exploration.  

The system supports full CRUD operations for Authors, Books, Borrowers, Loans, and Users,  
with a one-to-many relationship between Authors and Books.

---

## 🚀 Features
- JWT Authentication (register, login, secure endpoints)
- CRUD operations for all core entities
- PostgreSQL running fully inside Docker
- Swagger UI for easy testing
- Docker Compose deployment
- Clean project structure with services, DTOs, repositories, and controllers

---

## 📥 Download the App From GitHub

Clone the repository:

```bash
git clone https://github.com/AlexanderBadenhorst/Final-Project.git
cd Final-Project
```

---

## 🐳 Build and Run the App With Docker

Make sure Docker Desktop is running.

### Start the full system

```bash
docker compose up --build
```

This launches:
- PostgreSQL on port **5433**
- Spring Boot API on port **8080**

### Stop all containers

```bash
docker compose down
```

---

## 🌐 Accessing the API

### Swagger UI  
👉 http://localhost:8080/swagger-ui/index.html

### API Root  
👉 http://localhost:8080/

---

## 🔐 Testing JWT Authentication in Swagger

### 1. Register a new user  
POST `/api/auth/register`

```json
{
  "username": "alex",
  "password": "password",
  "role": "ADMIN"
}
```

### 2. Login to receive the JWT  
POST `/api/auth/login`

Example response:

```json
{
  "token": "your.jwt.token"
}
```

### 3. Authorize protected endpoints
Click **Authorize** → paste:

```
Bearer your.jwt.token
```

You are now authenticated.

---

## 📚 Testing CRUD Endpoints in Swagger

Once authenticated, test all controllers:

### 👤 Authors  
- Create author  
- Get list of authors  
- Update author  
- Delete author  

### 📘 Books  
- Create books  
- Link to authors  
- Update copy counts  

### 🧍 Borrowers  
- Register borrowers  

### 🔁 Loans  
- Issue loans  
- Return books  

### 👥 Users (Admin only)  
- Create and manage app users  

All data is stored in the Dockerized PostgreSQL container.

---

## ✅ Summary

This project demonstrates:

- Modern Spring Boot 3 backend design
- Secure JWT-based authentication
- Docker Compose deployment with isolated database
- Swagger-powered API documentation
- One-to-many relationships with JPA
- Professional, production-ready service architecture

You now have a clean, fully working application that can run anywhere Docker is installed.

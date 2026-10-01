# OrderCraft: Manufacturing Order Management System

OrderCraft is a web-based Manufacturing Order Management System designed to centralize and manage manufacturing-related information such as customers, products, materials, suppliers, inventory, and user access.

## 📌 Project Overview

In manufacturing environments, managing customers, products, materials, suppliers, and inventory through separate systems or manual processes can be difficult.

OrderCraft provides a centralized web application where these operations can be managed efficiently through a single platform.

The project is being developed as a college pre-project and is implemented incrementally.

---

## 🎯 Objectives

- Centralize manufacturing-related information.
- Manage customers, products, materials, suppliers, and inventory.
- Provide secure user authentication.
- Implement Admin and User roles.
- Provide CRUD operations through REST APIs.
- Connect an Angular frontend with a Spring Boot backend.
- Store application data in a MySQL database.
- Provide a foundation for future manufacturing workflows.

---

## ✨ Features

### Authentication
- User Signup
- User Login
- Admin and User roles
- BCrypt password hashing
- Role-based frontend routing
- Logout functionality

### Customer Management
- Add customers
- View customers
- Update customers
- Delete customers

### Product Management
- Add products
- View products
- Update products
- Delete products

### Material Management
- Add materials
- View materials
- Update materials
- Delete materials

### Supplier Management
- Add suppliers
- View suppliers
- Update suppliers
- Delete suppliers

### Inventory Management
- Manage material inventory
- Track available quantity
- Manage units
- Maintain reorder levels

---

## 🛠️ Technology Stack

### Frontend
- Angular 21
- TypeScript
- HTML5
- CSS3

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST APIs
- Maven

### Database
- MySQL

### Development Tools
- Visual Studio Code
- Git
- GitHub
- Postman
- Jira

---

## 🏗️ System Architecture

```text
┌──────────────────────┐
│   Angular Frontend   │
│      Angular 21      │
└──────────┬───────────┘
           │
           │ HTTP / REST API
           ▼
┌──────────────────────┐
│   Spring Boot        │
│      Backend         │
└──────────┬───────────┘
           │
           │ JPA / Hibernate
           ▼
┌──────────────────────┐
│     MySQL Database   │
└──────────────────────┘
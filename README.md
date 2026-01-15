# Practice Spring Boot – Dependency Injection & Bean Lifecycle

This project is a **Spring Boot practice application** focused on understanding **Dependency Injection (DI)** and **Spring Bean Lifecycle management** using real-world annotations and configurations.

---

## 🔧 Tech Stack
- Java
- Spring Boot
- Maven

---

## 📌 Project Objective
The goal of this project is to:
- Understand **Dependency Injection** in Spring Boot
- Explore different **bean selection strategies**
- Learn **Spring Bean Lifecycle methods**
- Practice **loose coupling and clean architecture**

---

## 🔁 Dependency Injection (DI)

Dependency Injection is a design pattern where Spring provides required objects (dependencies) instead of creating them manually using `new`.

### ✔ Benefits of DI
- Loose coupling
- Better testability
- Cleaner and maintainable code
- Easy switching of implementations

---

## 🧩 Types of Dependency Injection in Spring

### 1️⃣ Constructor Injection (Used in this project ✅)
```java
public PracticeDemoApplication(NotificationService notificationService) {
    this.notificationService = notificationService;
}

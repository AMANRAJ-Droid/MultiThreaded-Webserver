# MultiThreaded Webserver (Java)

A multi-threaded Java web server project demonstrating different server models — **single-threaded**, **multithreaded**, and **thread-pool-based** — to handle HTTP client requests concurrently and efficiently.

This repository contains implementations that help understand how web servers scale from basic to optimized concurrency using Java sockets and threads.

---

## 🚀 Features

- **Single-Threaded Server:** Handles one request at a time.
- **Multi-Threaded Server:** Creates a new thread per client request.
- **Thread Pool Server:** Uses a fixed thread pool to reuse threads and avoid thread creation overhead.
- Efficient request handling using Java concurrency utilities.
- Modular code structure suitable for learning and benchmarking.

---

## 🧠 Architecture Overview

### 🧵 Server Models

**1. Single-Threaded Server**  
- Accepts one connection at a time  
- Blocks until request is fully processed

**2. Multi-Threaded Server**  
- Creates a new thread for each client
- Can handle multiple clients concurrently

**3. Thread Pool Server**  
- Uses `ExecutorService` thread pool
- Worker threads process client connections from a shared task queue

---

## 📂 Repository Structure

MultiThreaded-Webserver/
├── singlethreaded/ # Basic single-threaded implementation
├── multithreaded/ # Multi-threaded server with new thread per client
├── threadpool/ # Thread Pool implementation (recommended)
├── tempCodeRunnerFile.java # Scratch/testing code
└── README.md


---

## 🛠️ Tech Stack

- **Language:** Java
- **Concurrency:** `Thread`, `ExecutorService`, Thread Pool
- **Networking:** `ServerSocket`, `Socket`
- **I/O:** Java Socket I/O streams

---

## ⚙️ How It Works

1. **Server** starts and listens on a specified port.
2. Depending on the model:
   - Single-threaded: Processes one connection at a time.
   - Multi-threaded: Spawns a new `Thread` for each client connection.
   - Thread-pool: Submits client task to a fixed thread pool.
3. **Client Handler** reads requests, processes them, and sends responses.
4. Thread resources are **reused** in the thread pool version for better performance.

---

## ▶️ How to Run

### Prerequisites

- Java 8+
- Terminal / Command Prompt

### Running the Thread Pool Server

```bash
cd threadpool
javac *.java
java WebServer <port>

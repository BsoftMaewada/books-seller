# Online Book Seller

##Tech used:

- Develop a Spring Boot backend using REST APIs and PostgreSQL database
- Develop a Angular frontend using Angular CLI, Routers
- Develop a Heroku Cloud Deployment from Java and Angular in production mode
- Cloud Deployment for Java and NodeJS
- Heroku Cloud Deployment
- Learn the basics of Angular - Angular Modules, Components, Data Binding and Routing
- Role Base Authorization and Authentication- 
- Use Spring Security to configure Basic Authentication and JWT
- Learn the magic of Spring Boot - Auto Configuration, Spring Initializr and Starter Projects
- RXJS Observables and Observers


## Endpoints

#### Sign-Up

    POST /api/authentication/sign-up HTTP/1.1
    Host: localhost:8080
    Content-Type: application/json
    
    {
        "user": "User2",
        "username": "user2",
        "password": "user2"
    }


#### Sign-In

    POST /api/authentication/sign-in HTTP/1.1
    Host: localhost:8080
    Content-Type: application/json
    Content-Length: 52
    
    {
        "username": "user1",
        "password": "user1"
    }

#### Create - Admin

    PUT /api/internal/make-manager/manager HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer InternalApiKeypassword!

### Save Book

    POST /api/book HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer...manager
    Content-Type: application/json
    Content-Length: 121
    
    {
        "title": "Test Book 3",
        "price": "10",
        "description": "Test description 3",
        "author": "Test author 3"
    }`


### Delete Book

    DELETE /api/book/3 HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer...manager

### Get All Books

    GET /api/book HTTP/1.1
    Host: localhost:8080

### Save Purchase

    POST /api/book HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer... manager
    Content-Type: application/json
    Content-Length: 121
    
    {
        "title": "Test Book 3",
        "price": "10",
        "description": "Test description 3",
        "author": "Test author 3"
    }

### Get User Purchases
    
    POST /api/purchase-history HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer... manager
    Content-Type: application/json
    Content-Length: 55
    
    {
        "userId": 2,
        "bookId": 1,
        "price": 10.0
    }

    GET /api/purchase-history HTTP/1.1
    Host: localhost:8080
    Authorization: Bearer ...user or admin
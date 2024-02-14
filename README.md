# Spring Boot Email Project

Welcome to the Spring Boot "Email Sender" project! This is a simple project that demonstrates the way of sending emails from a Spring Boot Application.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Run The Application & Test](#run-the-application--test)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project serves as a foundational framework for developing an email sending application using modern technologies and best practices. It provides a comprehensive setup and essential dependencies to swiftly launch your email sender project, allowing you to focus on crafting robust email functionality without the hassle of intricate setup procedures.

With this project as your starting point, you'll delve into the intricacies of email communication while leveraging the power and flexibility of the chosen technologies. Whether you're a seasoned developer or just embarking on your coding journey, this project will empower you to build a reliable and efficient email sending application with ease.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed (version 17 or higher)
- Maven build tool installed

## Run The Application & Test

### Run

```bash
mvn clean spring-boot:run
```

### Check if the microservice can send Mails

```bash
curl -X POST -H 'Content-Type: application/json' -d '{"to": "<RECIPIENT_MAIL>", "subject": "test subject", "body": "test body"}' http://localhost:8081/api/sendMail -w "\n"
```

> Replace the `RECIPIENT_MAIL` in the request body with a valid email.  If you get a `200` status code with a response body `true`, your mail microservice is succesfully working. Also check your recipient mail if you got the email or not.
>

## Contributing

Contributions are welcome! If you'd like to contribute to this project, follow these steps:

1. Fork the project from the GitHub repository.
2. Create a new branch with a descriptive name.
3. Make your desired changes.
4. Commit and push your changes to your fork.
5. Create a pull request detailing your changes.

## License

This project is licensed under the [MIT License](LICENSE).

---

Happy coding!

For more information about Spring Boot, visit the [official documentation](https://spring.io/projects/spring-boot).

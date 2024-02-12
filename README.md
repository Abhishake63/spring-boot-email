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

curl -X POST -H 'Content-Type: application/json' -d '{"to": "<RECIPIENT_MAIL>", "subject": "test subject", "body": "test body"}' http://localhost:8081/api/sendMail -w "\n"

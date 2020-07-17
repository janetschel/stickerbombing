# Stickerbombing
A tool which lets you send emails to various companies you desire to hopefully get stickers or any other goodies for free

### Usage

Simply add an `application.yaml` file in the `/resource` directory structured like that:
```YAML
secrets:
  email: "example_email@gmail.com"
  password: "my_secret_password_1"
  homeAddress: "my_address"

```
<br>

The only thing left to do is to change `email.json` to feature the email addresses of the companies you want to email.  
The `email.json` is structured like this:
```JSON
{
  "emails": [
    "cr@company.com",
    "contact@othercompany.com",
    "company1@gmail.com"
  ]
}
```

Now just run the program and hope ✨ for the best ✨

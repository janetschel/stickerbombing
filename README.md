# Stickerbombing
A tool which lets you send emails to various companies you desire to hopefully get stickers or any other goodies for free

### Usage

*Optional*: Change the email body in `/src/main/../mail/data/Mail.java` to whatever you like.  
If you use the newest Java 14 preview you can use text blocks for that.

<br>

Afert thats simply add an `application.yaml` file in the `/resource` directory structured like that:
```YAML
secrets:
  email: "example_email@gmail.com"
  password: "my_secret_password_1"
  homeAddress: "my_address"
```

**Note**: your home address can be of any structure you like. Just replace newlines with `\n` and spaces with `+` signs.  
An example address could be `first_name+last_name\nstreet_name+house_number\nstate,+country`

<br>

The only thing left to do is to change the file `email.json` to feature the email addresses of the companies you want to email.  
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
<br>

Now just run the program and hope ✨ for the best ✨


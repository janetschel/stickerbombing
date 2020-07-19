# Stickerbombing
A tool which lets you send emails to various companies you desire to hopefully get stickers or any other goodies for free

### Usage

*Optional*: Change the email body in `/src/main/../mail/data/Mail.java` to whatever you like.  
If you use the newest Java 14 preview you can use [text blocks](https://openjdk.java.net/jeps/355) for that.

<br>

Add (you need to create it) an `application.yaml` file in the `/resource` directory structured like that:
```YAML
secrets:
  email: "example_email@gmail.com"
  password: "my_secret_password_1"
  homeAddress: "my_address"
```

**Note**: your home address can be of any structure you like. Just replace newlines with `\n` and spaces with `+` signs.  
An example address could be `first_name+last_name\nstreet_name+house_number\nstate,+country`

<br>

This tool comes with a sophisticated *database* of emails from big companies. If you still want to change it to fit your personal needs better just change the `email.json` in the `/resource`directory.  
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


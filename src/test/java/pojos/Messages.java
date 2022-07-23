package pojos;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/*
    "id": 77054,
    "name": "asd",
    "email": "w@k.m",
    "subject": "hjm",
    "message": "iyiydir"

 */
public class Messages {

    private String email;
    private String name;
    private String message;
    private String subject;

    public Messages() {
    }

    public Messages( String email, String name, String message, String subject) {

        this.email = email;
        this.name = name;
        this.message = message;
        this.subject = subject;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Messages{" +

                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
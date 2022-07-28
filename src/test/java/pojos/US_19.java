package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_19 {
    /*
    {
  "adress": "string",
  "birthDate": "2022-07-27T09:56:56.409Z",
  "bloodGroup": "Apositive",
  "country": {
    "id": 0,
    "name": "string"
  },
  "createdBy": "string",
  "createdDate": "2022-07-27T09:56:56.409Z",
  "cstate": {
    "country": {
      "id": 0,
      "name": "string"
    },
    "id": 0,
    "name": "string"
  },
  "description": "string",
  "firstName": "string",
  "gender": "MALE",
  "id": 0,
  "lastName": "string",
  "phone": "string",
  "ssn": "371-42-9611",
  "user": {
    "activated": true,
    "createdBy": "string",
    "createdDate": "2022-07-27T09:56:56.410Z",
    "email": "string",
    "firstName": "string",
    "id": 0,
    "imageUrl": "string",
    "langKey": "string",
    "lastName": "string",
    "login": "string",
    "resetDate": "2022-07-27T09:56:56.412Z",
    "ssn": "146-41-5948"
  }
}
     */
    private String adress;
    private  String birthDate;
    private String bloodGroup;
    private  int id;
    private String name;
    private String firstName;
    private String gender;
    private  String lastname;
    private String login;
    private String ssn;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US_19{" +
                "adress='" + adress + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
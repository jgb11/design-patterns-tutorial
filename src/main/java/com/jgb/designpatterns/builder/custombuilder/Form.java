package com.jgb.designpatterns.builder.custombuilder;

import java.util.Date;

/**
 * @author jgb
 * @since 25/11/2017 10:18
 */
public class Form {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String address;
    private Date dob;
    private String email;
    private String backupEmail;
    private String spouseName;
    private String city;
    private String state;
    private String country;
    private String language;
    private String passwordHint;
    private String securityQuestion;
    private String securityAnswer;

    // avoid instantiate class without builder
    private Form() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBackupEmail() {
        return backupEmail;
    }

    public void setBackupEmail(String backupEmail) {
        this.backupEmail = backupEmail;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public static class Builder {

        private Form form = new Form();

        private Builder(String firstName, String lastName, String userName, String password) {
            this.form.firstName = firstName;
            this.form.lastName = lastName;
            this.form.userName = userName;
            this.form.password = password;
        }

        public static Builder get(String firstName, String lastName, String userName, String password) {
            return new Builder(firstName, lastName, userName, password);
        }

        public Builder address(String address) {
            this.form.address = address;
            return this;
        }

        public Builder dob(Date dob) {
            this.form.dob = dob;
            return this;
        }

        public Builder email(String email) {
            this.form.email = email;
            return this;
        }

        public Builder backupEmail(String backupEmail) {
            this.form.backupEmail = backupEmail;
            return this;
        }

        public Builder spouseName(String spouseName) {
            this.form.spouseName = spouseName;
            return this;
        }

        public Builder city(String city) {
            this.form.city = city;
            return this;
        }

        public Builder state(String state) {
            this.form.state = state;
            return this;
        }

        public Builder country(String country) {
            this.form.country = country;
            return this;
        }

        public Builder language(String language) {
            this.form.language = language;
            return this;
        }

        public Builder passwordHint(String passwordHint) {
            this.form.passwordHint = passwordHint;
            return this;
        }

        public Builder securityQuestion(String securityQuestion) {
            this.form.securityQuestion = securityQuestion;
            return this;
        }

        public Builder securityAnswer(String securityAnswer) {
            this.form.securityAnswer = securityAnswer;
            return this;
        }

        public Form build() {
            return form;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n First Name: ");
        sb.append(firstName);
        sb.append("\n Last Name: ");
        sb.append(lastName);
        sb.append("\n User Name: ");
        sb.append(userName);
        sb.append("\n Password: ");
        sb.append(password);

        if (this.address != null) {
            sb.append("\n Address: ");
            sb.append(address);
        }
        if (this.dob != null) {
            sb.append("\n DOB: ");
            sb.append(dob);
        }
        if (this.email != null) {
            sb.append("\n Email: ");
            sb.append(email);
        }
        if (this.backupEmail != null) {
            sb.append("\n Backup Email: ");
            sb.append(backupEmail);
        }
        if (this.spouseName != null) {
            sb.append("\n Spouse Name: ");
            sb.append(spouseName);
        }
        if (this.city != null) {
            sb.append("\n City: ");
            sb.append(city);
        }
        if (this.state != null) {
            sb.append("\n State: ");
            sb.append(state);
        }
        if (this.country != null) {
            sb.append("\n Country: ");
            sb.append(country);
        }
        if (this.language != null) {
            sb.append("\n Language: ");
            sb.append(language);
        }
        if (this.passwordHint != null) {
            sb.append("\n Password Hint: ");
            sb.append(passwordHint);
        }
        if (this.securityQuestion != null) {
            sb.append("\n Security Question: ");
            sb.append(securityQuestion);
        }
        if (this.securityAnswer != null) {
            sb.append("\n Security Answer: ");
            sb.append(securityAnswer);
        }

        return sb.toString();
    }
}

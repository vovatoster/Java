package ua.epam.Model;

/**
 * Created by Volodymyr_Zaverukha on 9/22/2016.
 */
    public class Record {
        private String lastName;
        private String firstName;
        private String nickname;
        private String comment;
        private AbonentGroup group;
        private String homePhone;
        private String mobile;
        private String mobile2;
        private String email;
        private String skype;
        private Address address;
        private String creationDate;
        private String modificationDate;

    public Record(String lastName, String firstName, String nickname, String comment,
                  AbonentGroup group, String homePhone, String mobile, String mobile2,
                  String email, String skype, Address address, String creationDate, String modificationDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.mobile2 = mobile2;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", mobile2='" + mobile2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", creationDate='" + creationDate + '\'' +
                ", modificationDate='" + modificationDate + '\'' +
                '}';
    }
}

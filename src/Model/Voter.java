
package Model;

import javax.persistence.*;

@Entity
public class Voter {
    @Id
    private String voter_id;
    private String voter_age;
    private String voter_password;
    private String voter_gender;
    private String voter_election;

    public Voter() {
    }

    public Voter(String voter_id) {
        this.voter_id = voter_id;
    }

    public Voter(String voter_id, String voter_age, String voter_password, String voter_gender, String voter_election) {
        this.voter_id = voter_id;
        this.voter_age = voter_age;
        this.voter_password = voter_password;
        this.voter_gender = voter_gender;
        this.voter_election = voter_election;
    }

    public String getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(String voter_id) {
        this.voter_id = voter_id;
    }

    public String getVoter_age() {
        return voter_age;
    }

    public void setVoter_age(String voter_age) {
        this.voter_age = voter_age;
    }

    public String getVoter_password() {
        return voter_password;
    }

    public void setVoter_password(String voter_password) {
        this.voter_password = voter_password;
    }

    public String getVoter_gender() {
        return voter_gender;
    }

    public void setVoter_gender(String voter_gender) {
        this.voter_gender = voter_gender;
    }

    public String getVoter_election() {
        return voter_election;
    }

    public void setVoter_election(String voter_election) {
        this.voter_election = voter_election;
    }
    
    
    
}

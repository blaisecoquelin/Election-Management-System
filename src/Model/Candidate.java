
package Model;

import javax.persistence.*;

@Entity
public class Candidate {
    
    @Id
    private String Candidate_id;
    private String Candidate_name;
    private String Candidate_age;
    private String Candidate_gender;
    private String Candidate_photo;
    private String Candidate_elect;

    public Candidate() {
    }

    public Candidate(String Candidate_id, String Candidate_name, String Candidate_age, String Candidate_gender, String Candidate_photo, String Candidate_elect) {
        this.Candidate_id = Candidate_id;
        this.Candidate_name = Candidate_name;
        this.Candidate_age = Candidate_age;
        this.Candidate_gender = Candidate_gender;
        this.Candidate_photo = Candidate_photo;
        this.Candidate_elect = Candidate_elect;
    }

    public String getCandidate_id() {
        return Candidate_id;
    }

    public void setCandidate_id(String Candidate_id) {
        this.Candidate_id = Candidate_id;
    }

    public String getCandidate_name() {
        return Candidate_name;
    }

    public void setCandidate_name(String Candidate_name) {
        this.Candidate_name = Candidate_name;
    }

    public String getCandidate_age() {
        return Candidate_age;
    }

    public void setCandidate_age(String Candidate_age) {
        this.Candidate_age = Candidate_age;
    }

    public String getCandidate_gender() {
        return Candidate_gender;
    }

    public void setCandidate_gender(String Candidate_gender) {
        this.Candidate_gender = Candidate_gender;
    }

    public String getCandidate_photo() {
        return Candidate_photo;
    }

    public void setCandidate_photo(String Candidate_photo) {
        this.Candidate_photo = Candidate_photo;
    }

    public String getCandidate_elect() {
        return Candidate_elect;
    }

    public void setCandidate_elect(String Candidate_elect) {
        this.Candidate_elect = Candidate_elect;
    }
    
    
    
    
    
    
}

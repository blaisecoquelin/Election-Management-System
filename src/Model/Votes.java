
package Model;

import javax.persistence.*;

@Entity
public class Votes {
    @Id
    private String vote_id;
    private Voter voter_id;
    private String voter_fk;
    private Elections elections_id;
    private String election_fk;
    private Candidate Candidate_id;
    private String candidate_fk;

    public Votes() {
    }

    public Votes(String vote_id, Voter voter_id, String voter_fk, Elections elections_id, String election_fk, Candidate Candidate_id, String candidate_fk) {
        this.vote_id = vote_id;
        this.voter_id = voter_id;
        this.voter_fk = voter_fk;
        this.elections_id = elections_id;
        this.election_fk = election_fk;
        this.Candidate_id = Candidate_id;
        this.candidate_fk = candidate_fk;
    }

   

    public String getVote_id() {
        return vote_id;
    }

    public void setVote_id(String vote_id) {
        this.vote_id = vote_id;
    }

    public Voter getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(Voter voter_id) {
        this.voter_id = voter_id;
    }

    public Elections getElections_id() {
        return elections_id;
    }

    public void setElections_id(Elections elections_id) {
        this.elections_id = elections_id;
    }

    public Candidate getCandidate_id() {
        return Candidate_id;
    }

    public void setCandidate_id(Candidate Candidate_id) {
        this.Candidate_id = Candidate_id;
    }

    public String getVoter_fk() {
        return voter_fk;
    }

    public void setVoter_fk(String voter_fk) {
        this.voter_fk = voter_fk;
    }

    public String getElection_fk() {
        return election_fk;
    }

    public void setElection_fk(String election_fk) {
        this.election_fk = election_fk;
    }

    public String getCandidate_fk() {
        return candidate_fk;
    }

    public void setCandidate_fk(String candidate_fk) {
        this.candidate_fk = candidate_fk;
    }
    
    
    
    
    
}

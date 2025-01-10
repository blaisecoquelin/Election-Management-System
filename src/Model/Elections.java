
package Model;

import javax.persistence.*;

@Entity
public class Elections {
    @Id
    private String elections_id;
    private String elections_name;
    private String elections_date;

    public Elections() {
    }

    public Elections(String elections_id, String elections_name, String elections_date) {
        this.elections_id = elections_id;
        this.elections_name = elections_name;
        this.elections_date = elections_date;
    }

    public String getElections_id() {
        return elections_id;
    }

    public void setElections_id(String elections_id) {
        this.elections_id = elections_id;
    }

    public String getElections_name() {
        return elections_name;
    }

    public void setElections_name(String elections_name) {
        this.elections_name = elections_name;
    }

    public String getElections_date() {
        return elections_date;
    }

    public void setElections_date(String elections_date) {
        this.elections_date = elections_date;
    }
    
    
    
}

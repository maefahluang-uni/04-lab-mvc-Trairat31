package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
   
    private String title;

    private String description;
    private Date date;
    private int Id;
    private String performer;
    public Concert() {
    }
    public Concert(String title, String description) {
    //TODO: set attributes
    title = this.title;
    description = this.description;
    }

    public String getTitle() {
    //TODO: return title
    return title;
    }
    public String getDescription() {
    //TODO: return description
    return description;
    }

    //TODO: add getters and setters

    public void setDate(Date date) {
    date = this.date;
    }

    public void setId(int Id ) {
    Id = this.Id;
    }

    public void setperformer(String performer) {
    performer = this.performer;
    }

    public Date getDate() {
    return date;
    }
    public int getId() {
    //TODO: return Id
    return Id;
    }
    public String getPerformer() {
    //TODO: return title
    return performer;
    }


    } 


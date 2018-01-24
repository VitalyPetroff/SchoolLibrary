package PrintedEdition;

import java.util.Date;

public abstract class PrintedEdition{
    private String title;
    private Date date;

    PrintedEdition(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    @Override
    public String toString() {
        String result;
        result = "Title: " + title + "Date: " + date;
        return result;
    }
}
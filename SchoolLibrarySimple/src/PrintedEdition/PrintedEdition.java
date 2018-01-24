package PrintedEdition;

import java.text.SimpleDateFormat;
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
        result = "Title:" + title + " Date:" + (new SimpleDateFormat("yyyy-MM-dd")).format(date);
        return result;
    }
}
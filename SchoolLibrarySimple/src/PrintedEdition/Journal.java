package PrintedEdition;

import java.util.Calendar;
import java.util.Date;

public class Journal extends PrintedEdition {
    private int numberOfPages;


    Journal(String title, Date date, int numberOfPages) {
        super(title, date);
        this.numberOfPages = numberOfPages;
    }
}

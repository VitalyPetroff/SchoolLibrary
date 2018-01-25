import PrintedEditions.Edition;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pupil {
    private String name;
    private Date dateOfBirth;
    private ArrayList<Edition> readingEditions = new ArrayList<>();

    public Pupil(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void readingOfEdition(Edition publication) {
        readingEditions.add(publication);
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(dateOfBirth);
    }

    public ArrayList<Edition> getReadingEditions() {
        return readingEditions;
    }
}
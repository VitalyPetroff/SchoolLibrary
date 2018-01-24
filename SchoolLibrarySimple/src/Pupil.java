import PrintedEditions.Edition;

import java.util.ArrayList;
import java.util.Date;

public class Pupil {
    private String name;
    private Date dateOfBirth;
    private ArrayList<Edition> readingEditions = null;

    public Pupil(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void readingOfEdition(Edition publication) {
        readingEditions.add(publication);
    }
}
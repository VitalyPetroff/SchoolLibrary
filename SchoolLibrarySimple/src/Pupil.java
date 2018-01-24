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

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String pupilInfo = "Name: " + name + " Date of Birth:" + dateFormat.format(dateOfBirth);
        return pupilInfo;
    }
}
import PrintedEditions.Edition;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pupil {
    private String name;
    private Date dateOfBirth;
    private ArrayList<Edition> listOfEditions = new ArrayList<>();

    public Pupil(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void readingOfEdition(Edition publication) {
        listOfEditions.add(publication);
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                ", dateOfBirth: " + new SimpleDateFormat("yyyy").format(dateOfBirth) +
                ", listOfEditions: " + listOfEditions.size();
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Edition> getListOfEditions() {
        return listOfEditions;
    }
}
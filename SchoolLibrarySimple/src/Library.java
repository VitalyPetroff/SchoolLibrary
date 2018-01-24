import PrintedEditions.Edition;

import java.util.ArrayList;

public class Library {

    public ArrayList<Edition> editions = new ArrayList<>();
    public ArrayList<Pupil> pupils = new ArrayList<>();

    public void addEdition(Edition edition){
        editions.add(edition);
    }

    public void addPupil(Pupil pupil){
        pupils.add(pupil);
    }

    public ArrayList<Pupil> getPupils() {
        return pupils;
    }

    public ArrayList<Edition> getListOfEditions() {
        return editions;
    }
}
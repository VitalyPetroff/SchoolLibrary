import PrintedEditions.Edition;

import java.util.ArrayList;

public class Library {

    private ArrayList<Edition> listOfEditions;
    private ArrayList<Pupil> listOfPupils;

    public void addEdition(Edition edition){
        listOfEditions.add(edition);
    }

    public void addPupil(Pupil pupil){
        listOfPupils.add(pupil);
    }
}
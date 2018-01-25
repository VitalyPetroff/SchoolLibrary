import PrintedEditions.Edition;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryDao {
    private String libraryPath;
    private ObjectMapper mapper = new ObjectMapper();
    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryService.class);
    private Library library;

    LibraryDao(String path) {
        libraryPath = path;
    }

    private void readLibrary() {
        try {
            library = mapper.readValue(new File(libraryPath), Library.class);
        } catch (IOException e) {
            library = new Library();
        }
    }

    private void saveLibrary() {
        try {
            mapper.writeValue(new File(libraryPath), library);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public ArrayList<Edition> getAllEditions() {
        readLibrary();
        return library.listOfEditions;
    }

    public void saveAllEditions(ArrayList<Edition> editions) {
        readLibrary();
        library.listOfEditions.clear();
        library.listOfEditions.addAll(editions);
        saveLibrary();
    }

    public void saveEdition(Edition edition) {
        readLibrary();
        library.listOfEditions.add(edition);
        saveLibrary();
    }

    public Edition findByTitle(String title) {
        ArrayList<Edition> listOfEditions = getAllEditions();
        Edition edition = null;
        for (Edition ed : listOfEditions) {
            if (ed.getTitle().equals(title)) {
                edition = ed;
            }
        }
        return edition;
    }

    public ArrayList<Pupil> getAllPupils() {
        Library library;
        try {
            library = mapper.readValue(new File(libraryPath), new TypeReference<List<Edition>>() {});
        } catch (IOException e) {
            library = new Library();
        }
        return library.listOfPupils;
    }

    public Pupil findByName(String name) {
        ArrayList<Pupil> listOfPupils = getAllPupils();
        Pupil result = null;
        for (Pupil pupil : listOfPupils) {
            if (pupil.getName().equals(name)) {
                result = pupil;
            }
        }
        return result;
    }

    public void savePupil(Pupil pupil) {
        ArrayList<Pupil> listOfPupils = getAllPupils();
        listOfPupils.add(pupil);
    }

    public void saveAllPupuils(ArrayList<Pupil> pupils) {
        ArrayList<Pupil> listOfPupils = getAllPupils();
        listOfPupils.clear();
        listOfPupils.addAll(pupils);
    }
}
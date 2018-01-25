import java.util.Comparator;
import java.util.Date;

public class PupilAgeComparator implements Comparator<Pupil> {

    @Override
    public int compare(Pupil firstPupil, Pupil secondPupil) {
        Date firstBirthDay = firstPupil.getDateOfBirth();
        Date secondBirthDay = secondPupil.getDateOfBirth();
        if (firstBirthDay.before(secondBirthDay)){
            return 1;
        } else if (firstBirthDay.after(secondBirthDay)) {
            return -1;
        } else {
            return 0;
        }
    }
}
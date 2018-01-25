import java.util.Comparator;

public class PupilEditionsComparator implements Comparator<Pupil> {
    @Override
    public int compare(Pupil firstPupil, Pupil secondPupil) {
        int firstNumber = firstPupil.getReadingEditions().size();
        int secondNumber = secondPupil.getReadingEditions().size();
        if (firstNumber > secondNumber) {
            return -1;
        } else if (firstNumber < secondNumber) {
            return 1;
        } else {
            return 0;
        }
    }
}
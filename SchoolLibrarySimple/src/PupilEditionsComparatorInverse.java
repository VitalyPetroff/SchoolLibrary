public class PupilEditionsComparatorInverse extends PupilEditionsComparator {
    public int compare(Pupil firstPupil, Pupil secondPupil) {
        return super.compare(firstPupil, secondPupil) * -1;
    }
}

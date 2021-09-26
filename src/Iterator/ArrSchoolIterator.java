package Iterator;

public class ArrSchoolIterator implements Iterator {
    StudentInfo[] elems;
    int position = 0;

    public ArrSchoolIterator(StudentInfo[] elems) {
        this.elems = elems;
    }

    @Override
    public boolean hasNext() {
        if (position >= elems.length || elems[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public StudentInfo next() {
        StudentInfo studentInfo = elems[position];
        position += 1;

        return studentInfo;
    }
}

package Iterator;

import java.util.ArrayList;

public class ALSchoolIterator implements Iterator{
    ArrayList<StudentInfo> elems;
    int position = 0;

    public ALSchoolIterator(ArrayList<StudentInfo> elems) {
        this.elems = elems;
    }

    @Override
    public boolean hasNext() {
        if(position >= elems.size()){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public StudentInfo next() {
        StudentInfo elem = elems.get(position);
        position += 1;

        return elem;
    }
}

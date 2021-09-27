package Iterator;

import java.util.ArrayList;

public class ALSchool {
    ArrayList studentInfos;

    public ALSchool() {
        studentInfos = new ArrayList();

        addStudentInfo("사과al", 10);
        addStudentInfo("바나나al", 11);
        addStudentInfo("포도al", 12);
    }

    public void addStudentInfo(String name, int studentID) {
        StudentInfo studentInfo = new StudentInfo(name, studentID);
        studentInfos.add(studentInfo);
    }

    public Iterator createIterater() {
        return new ALSchoolIterator(studentInfos);
    }
}

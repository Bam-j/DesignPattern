package Iterator;

public class ArrSchool {
    StudentInfo[] studentInfos;
    int index = 0;

    public ArrSchool() {
        studentInfos = new StudentInfo[3];

        addStudentInfo("복숭아arr", 00);
        addStudentInfo("망고arr", 01);
        addStudentInfo("토마토arr", 02);
    }

    public void addStudentInfo(String name, int studentID) {
        StudentInfo studentInfo = new StudentInfo(name, studentID);

        studentInfos[index] = studentInfo;
        index++;
    }

    public Iterator createIterater() {
        return new ArrSchoolIterator(studentInfos);
    }
}

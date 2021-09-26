package Iterator;

import java.util.ArrayList;

public class ViewSystem {
    ALSchool alSchool = new ALSchool();
    ArrayList alSchoolStudentInfos = alSchool.getStudentInfos();

    ArrSchool arrSchool = new ArrSchool();
    StudentInfo[] arrSchoolStudentInfos = arrSchool.getStudentInfos();

    public void print() {
        System.out.println("==alSchool의 학생들");

        for (int i = 0; i < alSchoolStudentInfos.size(); i++) {
            StudentInfo studentInfo = (StudentInfo) alSchoolStudentInfos.get(i);

            System.out.println(studentInfo.getName() + ", " + studentInfo.getStudentID());
        }

        System.out.println("==arrSchool의 학생들");

        for (int i = 0; i < arrSchoolStudentInfos.length; i++) {
            StudentInfo studentInfo = arrSchoolStudentInfos[i];

            System.out.println(studentInfo.getName() + ", " + studentInfo.getStudentID());
        }
    }
}

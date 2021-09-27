package Iterator;

public class ViewSystem {
    ALSchool alSchool;
    ArrSchool arrSchool;

    public ViewSystem(ALSchool alSchool, ArrSchool arrSchool) {
        this.alSchool = alSchool;
        this.arrSchool = arrSchool;
    }

    public void print(){
        Iterator alSchoolIterator = alSchool.createIterater();
        Iterator arrSchoolIterator = arrSchool.createIterater();

        System.out.println("--AlsSchool 학생 명단--");
        print(alSchoolIterator);
        System.out.println();

        System.out.println("--ArrSchool 학생 명단 --");
        print(arrSchoolIterator);
    }

    private void print(Iterator iterator){
        while(iterator.hasNext()) {
            StudentInfo studentInfo = (StudentInfo)iterator.next();

            System.out.print(studentInfo.getName()+": "+studentInfo.getStudentID()+"\n");
        }
    }

    /*
    이터레이터를 사용하지 않을 경우의 코드
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
    */
}

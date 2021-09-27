package Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ALSchool alSchool = new ALSchool();
        ArrSchool arrSchool = new ArrSchool();
        ViewSystem viewSystem = new ViewSystem(alSchool, arrSchool);

        viewSystem.print();
    }
}

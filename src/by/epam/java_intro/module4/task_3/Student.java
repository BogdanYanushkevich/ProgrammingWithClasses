package by.epam.java_intro.module4.task_3;

public class Student {

    private String secondNameAndInitials;
    private String groupNumber;
    private int[] academicPerformance;

    public Student(String secondNameAndInitials, String groupNumber, int[] academicPerformance) {

        this.secondNameAndInitials = secondNameAndInitials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }


    public String getSecondNameAndInitials() {

        return secondNameAndInitials;
    }

    public void setSecondNameAndInitials(String secondNameAndInitials) {

        this.secondNameAndInitials = secondNameAndInitials;

    }


    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public String toString() {
        return "Student: " + secondNameAndInitials + "\n" +
                "GroupNumber: " + groupNumber;
    }
}

package codingExercises3Three;

public class Ex_4_StudentGradeChecker {
    private int marks;

    public Ex_4_StudentGradeChecker(int marks) {
        // TODO: Assign 'marks' to the instance variable 'this.marks'
        this.marks = marks;
    }

    public char assignGrade() {
        // TODO: Implement the method which assigns the grade based on marks.
        // If marks are less than 0 or greater than 100, return 'X'
        if (this.marks < 0 || this.marks >100){
            return 'X';
        }
        // If marks are greater than or equal to 90, return 'A'
        if (this.marks >= 90){
            return 'A';
        }
        // If marks are greater than or equal to 80, return 'B'
        if (this.marks >= 80){
            return 'B';
        }
        // If marks are greater than or equal to 70, return 'C'
        if (this.marks >= 70){
            return 'C';
        }
        // If marks are greater than or equal to 60, return 'D'
        if (this.marks >= 60){
            return 'D';
        }
        // If marks are greater than or equal to 50, return 'E'
        if (this.marks >= 50){
            return 'E';
        }
        // If marks are less than 50, return 'F'
        return 'F';
    }
}

package codingExercises1One;

public class ExamResult {
    
    public boolean isPass(int marks) {
        
        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        if (marks > 50) {
            return true;
        }
        else {
            return false;
        }
    }
    
    //above method can be shorten as follows:
    public boolean isPass1(int marks) {
        return marks>50;
    }
}
public class countStudents {
     public static void main(String[] args) {

        int[] marks = {85, 72, 90, 65, 78, 55, 88, 75, 92};

        int count = 0;

        for (int mark : marks) {
            if (mark > 75) {
                count++;
            }
        }

        System.out.println("Number of students who scored more than 75: " + count);
    }
}
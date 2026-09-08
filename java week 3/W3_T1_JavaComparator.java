import java.util.*;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students[i] = new Student(name, score);
        }

        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.score != b.score) {
                    return b.score - a.score;
                }
                return a.name.compareTo(b.name);
            }
        });

        for (Student s : students) {
            System.out.println(s.name + " " + s.score);
        }

        sc.close();
    }
}

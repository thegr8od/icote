// comparator 사용
package 정렬;
import java.util.*;
import java.io.*;


public class 성적이낮은순서로학생출력하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        List<Student> students = new ArrayList<>();
        StringTokenizer st;
        String name;
        int score;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            score = Integer.parseInt(st.nextToken());
            students.add(new Student(name, score));
        }

        Collections.sort(students, comparator);

        for (int i = 0; i < n; i++) {
            System.out.print(students.get(i).getName() + " ");
        }

    }

    static Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getScore() - o2.getScore();
        }
    };

    static class Student {

        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }
}



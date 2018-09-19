package Chapter16;

public class Student implements Comparable<Student> {
    private String name;
    private Integer score;

    public Student(String n, int s) {
        this.name = n;
        this.score = s;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

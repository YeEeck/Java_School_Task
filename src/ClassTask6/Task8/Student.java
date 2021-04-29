package ClassTask6.Task8;


class Student implements Comparable<Student> {
    int height = 0;
    String name;

    Student(int height, String name) {
        this.name = name;
        this.height = height;
    }

    public int compareTo(Student b) {
        return (this.height - b.height);
    }
}


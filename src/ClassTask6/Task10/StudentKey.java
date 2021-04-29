package ClassTask6.Task10;

import java.util.*;

class StudentKey implements Comparable<StudentKey> {
    double d = 0;

    StudentKey(double d) {
        this.d = d;
    }

    public int compareTo(StudentKey b) {
        if ((this.d - b.d) == 0)
            return -1;
        else
            return (int) ((this.d - b.d) * 1000);
    }
}

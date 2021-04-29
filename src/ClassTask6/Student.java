package ClassTask6;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (null != obj && obj instanceof Student) {
            Student s = (Student) obj;
            if (name.equals(s.name))
                return true;
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode();
    }
}


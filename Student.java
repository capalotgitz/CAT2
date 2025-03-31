public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Use setter to ensure grade validation
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
            System.out.println("Invalid grade. Grade set to 0.");
        }
    }
}

// b) Method Overloading and Overriding
class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

}

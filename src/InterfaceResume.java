import java.util.Scanner;

interface Resume {
    void biodata();
}

class Teacher implements Resume {
    String name;
    String qualification;
    int experience;

    Teacher(String name, String qualification, int experience) {
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
    }

    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String qualification = scanner.nextLine();
        int experience = scanner.nextInt();

        Teacher teacher = new Teacher(name, qualification, experience);
        teacher.biodata();
        
        scanner.close();
    }
}

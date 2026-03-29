import java.util.Scanner;

interface Resume {
    void biodata();
}

class Teacher implements Resume {

    String name;
    String qualification;
    int experience;

    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Teacher teacher = new Teacher();

        teacher.name = sc.nextLine();
        teacher.qualification = sc.nextLine();
        teacher.experience = sc.nextInt();
        teacher.biodata();

        sc.close();
    }
}

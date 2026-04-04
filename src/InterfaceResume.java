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

public class InterfaceResume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String qual = sc.nextLine();
        int exp = sc.nextInt();

        Teacher t = new Teacher(name, qual, exp);
        t.biodata();

        sc.close();
    }
}

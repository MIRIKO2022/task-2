import java.util.*;

class StudentAdd {
    int id;
    String name;
    float marks;

    StudentAdd(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}



public class StudentList {
    public static void main(String[] args) {
        ArrayList<StudentAdd> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        float marks;
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an action: add, delete, view, update, display, exit");
            String value = sc.nextLine().toLowerCase();

            switch (value) {
                case "add":
                    boolean continueInput = true;
                    while (continueInput) {
                        System.out.print("Enter student ID: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter student name: ");
                        name = sc.nextLine();
                        System.out.print("Enter student marks: ");
                        marks = sc.nextFloat();
                        sc.nextLine();
                        students.add(new StudentAdd(id, name, marks));

                        System.out.print("Do you want to add another student? (yes/no): ");
                        String response = sc.nextLine();
                        continueInput = response.equalsIgnoreCase("yes");
                    }
                    break;

                case "delete":
                    boolean continueDelete = true;
                    while (continueDelete) {
                        System.out.print("Enter student ID to delete: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        boolean found = false;
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).id == id) {
                                students.remove(i);
                                found = true;
                                System.out.println("Student with ID " + id + " deleted.");
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Student with ID " + id + " not found.");
                        }
                        System.out.print("Do you want to delete another student? (yes/no): ");
                        String response = sc.nextLine();
                        continueDelete = response.equalsIgnoreCase("yes");
                    }
                    break;

                case "view":
                    System.out.print("Enter student ID to view: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (StudentAdd student : students) {
                        if (student.id == id) {
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + id + " not found.");
                    }
                    break;

                case "update":
                    System.out.print("Enter student ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    boolean updated = false;
                    for (StudentAdd student : students) {
                        if (student.id == id) {
                            System.out.print("Enter new name: ");
                            name = sc.nextLine();
                            System.out.print("Enter new marks: ");
                            marks = sc.nextFloat();
                            sc.nextLine();
                            student.name = name;
                            student.marks = marks;
                            updated = true;
                            System.out.println("Student with ID " + id + " updated.");
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student with ID " + id + " not found.");
                    }
                    break;

                case "display":
                    System.out.println("All Student Details:");
                    for (StudentAdd student : students) {
                        System.out.println(student);
                    }
                    break;

                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        sc.close();
    }
}

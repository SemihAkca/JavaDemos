public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] students = new String[4];
        students[0] = "Ahmet";
        students[1] = "Hamza";
        students[2] = "Zeynep";
        students[3] = "Hüseyin";

        /* for (int i = 0; i< students.length; i++) {
               System.out.println(students[i]);
        }*/

        for (String student : students) {
            System.out.println(student);
        }
    }
}



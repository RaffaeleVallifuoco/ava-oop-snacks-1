package it.lesson.javaSnack;
import java.util.Scanner;

public class RegistroStudenti {

    private String [] students = {};

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String[] getStudents() {
        return students;
    }

    public RegistroStudenti () {}

    public void arrayPrint (String [] array) {
        System.out.println("Studenti presenti nella lista : " );
        System.out.println("");

        for(int i = 0; i < array.length; i++) {
            String current = array[i];
            System.out.println(current);
        }
        
        System.out.println("");
    }


    public void addElement() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un nuovo studente :");
        System.out.println("");
        String newElement = scan.nextLine();
        String[] elementArray = {newElement};
        String [] newArray = new String[students.length + elementArray.length];

        System.arraycopy(students, 0, newArray, 0, students.length);
        System.arraycopy(elementArray, 0, newArray, students.length, elementArray.length);


        arrayPrint(newArray);
        System.out.println("");

        students = newArray;
        
        
    }
    
 }



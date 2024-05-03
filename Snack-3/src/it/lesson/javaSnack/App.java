// Crea una classe RegistroStudenti che rappresenti un registro di studenti.
// Utilizza un array privato per memorizzare oggetti Studente.  Implementa un costruttore senza parametri per
// inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
// Aggiungi un metodo che stampi la lista degli studenti.
package it.lesson.javaSnack;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Students List");
        System.out.println("-----------------------------------------");
        System.out.println("");

        RegistroStudenti studentlist = new RegistroStudenti();
        
        studentlist.arrayPrint(studentlist.getStudents());
        
        studentlist.addElement();
        
        char choice;

        do {
            System.out.println("Vuoi inserire un nuovo studente ? (y / n");
        
            choice = scan.next().charAt(0);
            studentlist.addElement();

        } while (choice == 'y' && choice != 'n');
        
       
        

    }
}

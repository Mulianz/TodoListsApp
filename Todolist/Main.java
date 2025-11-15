package Exercices;

import Todolist.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Voir les tâches");
            System.out.println("3. Marquer comme terminée");
            System.out.println("4. Supprimer une tâche");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            String input = sc.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(" Veuillez entrer un nombre fesant parti de la liste !");
                continue;
            }

            switch (choice) {
                case 1:
                        System.out.println("=== Ajouter une tâche ===");
                        System.out.print("Titre : ");
                        String titre = sc.nextLine().toLowerCase();
                        System.out.print("Description : ");
                        String description = sc.nextLine().toLowerCase();
                        tasks.add(new Task(titre, description));
                        System.out.println("✔ Tâche ajoutée avec succès !");
                    break;
                case 2:
                    // Afficher les tâches
                    if (tasks.isEmpty()) {
                        System.out.println("La liste des taches est vide !");
                    }
                    else{
                        for(Task t: tasks){
                            System.out.println(t);
                        }
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("La liste de taches est vide !");
                    }else{
                        for(Task t: tasks){
                            System.out.println(t);
                        }
                        System.out.println("Quelle taches voulez avez vous terminé (Préciser son titre) ?");
                        String tache = sc.nextLine();
                        for (Task t: tasks){
                            if (tache.equals(t.getTitre())){
                                t.markAsDone();
                            }
                        }
                    }
                    break;
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("La liste de taches est vide !");
                    }else {
                        for (Task t : tasks) {
                            System.out.println(t);
                        }
                        System.out.println("Quelle taches voulez avez vous terminé (Préciser son titre) ?");
                        String taches = sc.nextLine();
                        if (tasks.removeIf(t -> taches.equals(t.getTitre()))) {
                            System.out.println("La tache a bien été suppprimer !");
                        } else {
                            System.out.println("Cette tache n'existe pas !");
                        }
                    }
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
    }
}

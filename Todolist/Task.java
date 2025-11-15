package Todolist;

public class Task {
    String titre;
    String description;
    boolean finished;

    public Task(String titre, String description) {
        this.titre = titre;
        this.description = description;
        this.finished = false;
    }

    public void markAsDone(){
        this.finished = true;
    }

    public boolean isFinished(){
        return this.finished;
    }

    public String getTitre(){
        return this.titre;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString() {
        if (finished) {
            return "[X] " + titre;
        } else {
            return "[ ] " + titre;
        }
    }
}

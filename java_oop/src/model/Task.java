package model;

public class Task {
    private String description;
    private boolean isDone;

    public Task(String description){
        this.description=description;
        this.isDone = false;
    }

    public void markDone(){
        isDone = true;
    }

    public String getDescription(){
        return description;
    }

    public  boolean isDone(){
        return isDone;
    }

    @Override
    public String toString(){
        return (isDone ? "[✓] " : "[ ] ") + description;
    }
}

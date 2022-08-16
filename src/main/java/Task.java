public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() { isDone = true; }

    public void markAsUndone() { isDone = false; }

    public String toString() {
        return "[" + this.getStatusIcon() + "] " + description;
    }

    //...
}

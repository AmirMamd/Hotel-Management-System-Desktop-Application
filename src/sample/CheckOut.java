package sample;

public class CheckOut {
    private String Comment;
    private int rating;
    public CheckOut(){}
    public CheckOut(String comment, int rating) {
        Comment = comment;
        this.rating = rating;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

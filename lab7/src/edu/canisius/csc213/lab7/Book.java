package edu.canisius.csc213.lab7;

import java.util.ArrayList;

public class Book extends Item {
    private ArrayList<Author> authors;

    public Book(String title, String location, ArrayList<Author> authors) {
        super(title, location, true);
        this.authors = authors;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("_______________________________________\n");
        sb.append("| Type: Book                          |\n");
        sb.append("| Title: ").append(getTitle()).append("         |\n");
        sb.append("| Can be borrowed: Yes                |\n");
        sb.append("| Author(s): ");
        for (int i = 0; i < authors.size(); i++) {
            sb.append(authors.get(i).getName());
            if (i < authors.size() - 1) sb.append(", ");
        }
        sb.append(" |\n");
        sb.append("| Location: ").append(getLocation()).append("               |\n");
        sb.append("_______________________________________\n");
        return sb.toString();
    }
}

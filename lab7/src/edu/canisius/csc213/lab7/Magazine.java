package edu.canisius.csc213.lab7;

import java.time.LocalDate;

public class Magazine extends Item {
    private LocalDate year;
    private String issueNumber;

    public Magazine(String title, String location, LocalDate year, String issueNumber) {
        super(title, location, false);
        this.year = year;
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public LocalDate getYear() {
        return year;
    }

    @Override
    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________\n");
        sb.append("| Type: Magazine        |\n");
        sb.append("| Title: ").append(getTitle()).append("       |\n");
        sb.append("| Date: ").append(getYear().getYear()).append("            |\n");
        sb.append("| Issue: ").append(getIssueNumber()).append("              |\n");
        sb.append("| Can be borrowed: No   |\n");
        sb.append("| Location: ").append(getLocation()).append(" |\n");
        sb.append("_________________________\n");
        return sb.toString();
    }
}

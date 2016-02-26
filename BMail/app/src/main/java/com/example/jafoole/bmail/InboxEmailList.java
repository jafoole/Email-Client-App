package com.example.jafoole.bmail;

/**
 * Created by sbabba on 2/26/16.
 */
public class InboxEmailList {

    private String headerText;
    private String subjectText;
    private String snippetText;
    private String timeText;

    public InboxEmailList(String headerText, String subjectText, String snapshotText, String timeText) {
        this.headerText = headerText;
        this.subjectText = subjectText;
        this.snippetText = snapshotText;
        this.timeText = timeText;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getSubjectText() {
        return subjectText;
    }

    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }

    public String getSnippetText() {
        return snippetText;
    }

    public void setSnippetText(String snapshotText) {
        this.snippetText = snapshotText;
    }

    public String getTimeText() {
        return timeText;
    }

    public void setTimeText(String timeText) {
        this.timeText = timeText;
    }
}

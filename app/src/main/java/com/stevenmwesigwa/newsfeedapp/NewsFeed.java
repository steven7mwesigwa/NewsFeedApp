package com.stevenmwesigwa.newsfeedapp;
/**
 * An {@link NewsFeed} object contains information related to a single newsfeed.
 */
public class NewsFeed {

    /**
     * The title for a single newsfeed
     */
    private String newsFeedTitle;

    /**
     * A snapshot of the main content / body of a single newsfeed
     */
    private String newsFeedBodyText;

    /** The section in which a single newsfeed belongs */
    private String newsFeedSection;

    /** The publication date of a single newsfeed */
    private String newsFeedPublicationDate;

    /** The contributor / author of a single newsfeed */
    private String newsFeedContributor;

    /** Website URL of a single newsfeed */
    private String newsFeedUrl;

    public NewsFeed(String newsFeedTitle, String newsFeedBodyText, String newsFeedSection, String newsFeedPublicationDate, String newsFeedContributor, String newsFeedUrl) {
        this.newsFeedTitle = newsFeedTitle;
        this.newsFeedBodyText = newsFeedBodyText;
        this.newsFeedSection = newsFeedSection;
        this.newsFeedPublicationDate = newsFeedPublicationDate;
        this.newsFeedContributor = newsFeedContributor;
        this.newsFeedUrl = newsFeedUrl;
    }

    public String getNewsFeedTitle() {
        return newsFeedTitle;
    }

    public void setNewsFeedTitle(String newsFeedTitle) {
        this.newsFeedTitle = newsFeedTitle;
    }

    public String getNewsFeedBodyText() {
        return newsFeedBodyText;
    }

    public void setNewsFeedBodyText(String newsFeedBodyText) {
        this.newsFeedBodyText = newsFeedBodyText;
    }

    public String getNewsFeedSection() {
        return newsFeedSection;
    }

    public void setNewsFeedSection(String newsFeedSection) {
        this.newsFeedSection = newsFeedSection;
    }

    public String getNewsFeedPublicationDate() {
        return newsFeedPublicationDate;
    }

    public void setNewsFeedPublicationDate(String newsFeedPublicationDate) {
        this.newsFeedPublicationDate = newsFeedPublicationDate;
    }

    public String getNewsFeedContributor() {
        return newsFeedContributor;
    }

    public void setNewsFeedContributor(String newsFeedContributor) {
        this.newsFeedContributor = newsFeedContributor;
    }

    public String getNewsFeedUrl() {
        return newsFeedUrl;
    }

    public void setNewsFeedUrl(String newsFeedUrl) {
        this.newsFeedUrl = newsFeedUrl;
    }
}

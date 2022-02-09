package com.example.news.news;

public class NewsModel  {
    String title;
    String description;
    String urlToImage;
    String author;
    String url;
    String publishedAt;
    String content;



    public NewsModel() {
    }

    public NewsModel(String title, String description, String urlToImage, String author, String url, String publishedAt, String content) {
        this.title = title;
        this.description = description;
        this.urlToImage = urlToImage;
        this.author = author;
        this.url = url;
        this.publishedAt = publishedAt;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}

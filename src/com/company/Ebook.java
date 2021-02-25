package com.company;

import java.util.ArrayList;

public class Ebook implements Readable {
    private String title;
    private String author;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = new ArrayList<>();
        this.pageNumber = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayList<String> getPages() {
        return pages;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void addPage(String page) {
        pages.add(page);
    }

    public void nextPage() {
        pageNumber++;
        if(pageNumber >= pages.size()) {
            pageNumber = 0;
        }
    }

    @Override
    public void read() {
        if(pages.size() > 0) {
            System.out.println(pages.get(pageNumber));
            nextPage();
        } else {
            System.out.println("The book has no pages.");
        }
    }
}

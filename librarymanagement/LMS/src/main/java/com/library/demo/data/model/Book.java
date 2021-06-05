package com.library.demo.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
  @Id
  @Column(name = "UUID")
  private String UUID;
  @Column(name = "title")
  private String title;
  @Column(name = "author")
  private String author;
  @Column(name = "category")
  private int category;
  @Column(name = "available")
  private int available;

  @Override
  public String toString() {
    return "Book [UUID=" + UUID + ", title=" + title + ", cover=" + cover + ", author="
        + author + ", category=" + category + ", available=" + available + "]";
  }

  public Book(String UUID, String title, String cover, String author, int category, int available) {
    super();
    UUID = UUID;
    this.title = title;
    this.cover = cover;
    this.publisher = publisher;
    this.category = category;
    this.available = available;
  }

  public String getUUID {
    return UUID;
  }

  public void setUUID(String UUID) {
    UUID = UUID;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getCategory() {
    return category;
  }

  public void setCategory(int category) {
    this.category = category;
  }

  public int getAvailable() {
    return available;
  }

  public void setAvailable(int available) {
    this.available = available;
  }

  public Book() {
    super();
  }

}

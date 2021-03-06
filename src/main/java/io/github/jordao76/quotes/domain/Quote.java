package io.github.jordao76.quotes.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Quote {

  @Id
  @GeneratedValue
  private Long id;

  @NotNull(message = "Quote text must not be null")
  private String text;

  @NotNull(message = "Quote author must not be null, use \"Anonymous\" for an unknown author")
  private String author;

  @SuppressWarnings("unused")
  private Quote() {}

  public Quote(String text, String author) {
    this.text = text;
    this.author = author;
  }

  public Long getId() { return id; }
  public String getText() { return text; }
  public String getAuthor() { return author; }

  @Override
  public String toString() {
    return String.format("Quote with text=[%s], author=[%s]", text, author);
  }

}

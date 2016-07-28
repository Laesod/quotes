# Quotes

[![Build Status](https://travis-ci.org/jordao76/quotes.svg)](https://travis-ci.org/jordao76/quotes)
[![License](http://img.shields.io/:license-mit-blue.svg)](https://github.com/jordao76/quotes/blob/master/LICENSE)

> _“Quotation, n: The act of repeating erroneously the words of another.” -- Ambrose Bierce_

Simple spring-boot service for citations.

Run with maven:

```
$ mvn spring-boot:run
```

Or package and run (change version as appropriate):

```
$ mvn package
...
$ java -jar target/quotes-0.0.1-SNAPSHOT.jar
```

Then go to `http://localhost:8080/quotes`.

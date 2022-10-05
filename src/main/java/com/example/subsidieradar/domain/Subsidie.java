package com.example.subsidieradar.domain;

import java.util.Date;

public class Subsidie {
    String naam;
    String subsidieverstrekker;
    String subsidialeActiviteiten;
    Date MaxLooptijd;
    double subsidieBudget;
    Date startDatum;
    Date deadline;
    String beoordelingssystematiek;
    String subsidieWebsiteLink;
    int matchPercentage;
    iMatch match;

    public Subsidie(String naam, String subsidieverstrekker, String subsidialeActiviteiten, Date maxLooptijd, double subsidieBudget, Date startDatum, Date deadline, String beoordelingssystematiek, String subsidieWebsiteLink, int matchPercentage, iMatch match) {
        this.naam = naam;
        this.subsidieverstrekker = subsidieverstrekker;
        this.subsidialeActiviteiten = subsidialeActiviteiten;
        this.MaxLooptijd = maxLooptijd;
        this.subsidieBudget = subsidieBudget;
        this.startDatum = startDatum;
        this.deadline = deadline;
        this.beoordelingssystematiek = beoordelingssystematiek;
        this.subsidieWebsiteLink = subsidieWebsiteLink;
        this.matchPercentage = matchPercentage;
        this.match = match;
    }
}

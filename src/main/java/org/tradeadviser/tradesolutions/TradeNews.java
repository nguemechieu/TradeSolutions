package org.tradeadviser.tradesolutions;

abstract class TradeNews extends News{

private double forecast;
private double previous;
private double impact;

public double getForecast() {
    return forecast;
}

public void setForecast(double forecast) {
    this.forecast = forecast;}
    public double getPrevious() {
        return previous;
    }
    public void setPrevious(double previous) {
        this.previous = previous;}
    public double getImpact() {
        return impact;
    }

    public void setImpact(double impact) {
        this.impact = impact;}

    public TradeNews(String title, String description, String url) {
        super(title, description, url);
    }
}

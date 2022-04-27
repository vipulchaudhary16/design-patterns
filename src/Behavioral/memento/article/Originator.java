package Behavioral.memento.article;

public class Originator {
    String article;

    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }
    public Memento storeInMemento(){
        return new Memento(article);
    }

    public String restoreFromMemento(Memento memento){
        return memento.getArticle();
    }
}

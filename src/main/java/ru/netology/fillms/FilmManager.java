package ru.netology.fillms;

public class FilmManager {
    private String[] movies = new String[0];
    private int limit;

    public FilmManager() {

        this.limit = 10;
    }

    public FilmManager(int limit) {

        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {

        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;

           // String[] tmp = new String[resultLength];
            String[] tmp = new String[limit];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = movies[movies.length - 1 - i];
            }
            return tmp;

        //return tmp;

      //  return new String[] = limit;
        // public new FilmManager();
    }


}



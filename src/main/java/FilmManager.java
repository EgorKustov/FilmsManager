public class FilmManager {
    private String[] films = new String[0];
    private final int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String movie) {
        String[] newFilms = new String[films.length + 1];
        System.arraycopy(films, 0, newFilms, 0, films.length);
        newFilms[newFilms.length - 1] = movie;
        films = newFilms;
    }

    public String[] findAll() {

        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}

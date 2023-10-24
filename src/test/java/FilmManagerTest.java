import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testAddOneFilm() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Отель Белград");
        Assertions.assertArrayEquals(new String[]{"Отель Белград"}, manager.findAll());
    }

    @Test
    public void testAddFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-Невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        Assertions.assertArrayEquals(new String[]{"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-Невидимка", "Тролли. Мировой тур", "Номер один"}, manager.findAll());
    }

    @Test
    public void testFindAll() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        Assertions.assertArrayEquals(new String[]{"Бладшот"}, manager.findAll());
        manager.addFilm("Вперёд");
        Assertions.assertArrayEquals(new String[]{"Бладшот", "Вперёд"}, manager.findAll());
        manager.addFilm("Отель Белград");
        Assertions.assertArrayEquals(new String[]{"Бладшот", "Вперёд", "Отель Белград"}, manager.findAll());
    }

    @Test
    public void testFindLastWithLimit() {
        FilmManager manager = new FilmManager(3);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-Невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        Assertions.assertArrayEquals(new String[]{"Номер один", "Тролли. Мировой тур", "Человек-Невидимка"}, manager.findLast());
    }

    @Test
    public void testFindLastWithoutLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-Невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        Assertions.assertArrayEquals(new String[]{"Номер один", "Тролли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель Белград"}, manager.findLast());
    }
}

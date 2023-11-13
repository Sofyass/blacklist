import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Класс Main содержит метод main, который демонстрирует использование интерфейса BlackListFilter
 * для фильтрации списка комментариев на основе заданного черного списка слов.
 * @author Seryavina Sofya
 */

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса, реализующего интерфейс BlackListFilter
        BlackListFilter blackListFilter = new BlackListFilterImpl();

        // Создание списка комментариев
        List<String> comments = new ArrayList<>();
        comments.add("это прекрасно! Просто супер!");
        comments.add("фу ужасно");
        comments.add("Неплохо! видно прогресс");
        comments.add("подпишитесь на наш новый канал");
        comments.add("хочешь много денег? регистрируйся по ссылке");

        // Создание множества черного списка слов
        Set<String> blackList = new HashSet<>();
        blackList.add("ужасно");
        blackList.add("фу");
        blackList.add("кошмар");
        blackList.add("подпишитесь");
        blackList.add("спам");
        blackList.add("хочешь много денег");

        System.out.println("До фильтрации: " + comments);

        // Применение фильтра к списку комментариев
        blackListFilter.filterComments(comments, blackList);

        System.out.println("После фильтрации: " + comments);
    }
}
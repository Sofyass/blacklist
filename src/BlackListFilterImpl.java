import java.util.List;
import java.util.Set;

/**
 * Класс BlackListFilterImpl реализует интерфейс BlackListFilter и предоставляет метод filterComments для фильтрации
 * списка комментариев на основе заданного черного списка слов.
 */
public class BlackListFilterImpl implements BlackListFilter {

    /**
     * Фильтрует список комментариев на основе заданного черного списка слов.
     * @param comments список комментариев, подлежащих фильтрации
     * @param blackList множество слов, которые не должны присутствовать в комментариях
     */
    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        for (int i = 0; i < comments.size(); i++) {
            String comment = comments.get(i);
            for (String word : blackList) {
                if (comment.toLowerCase().contains(word.toLowerCase())) {
                    comments.remove(i);
                    i--; // уменьшаем индекс, чтобы учесть удаленный комментарий
                    break; // прекращаем проверку других слов в этом комментарии
                }
            }
        }
    }
}

import java.util.List;
import java.util.Set;

public interface BlackListFilter {

    /**
     * Из заданного списка комментариев удаляет те,
     * которые содержат слова из черного списка.
     *
     * @param comments список комментариев; каждый комментарий
     *                 представляет собой последовательность слов,
     *                 разделенных пробелами, знаками пунктуации
     *                 или переносами строки
     * @param blackList список слов, которые не должны
     *                  присутствовать в комментарии
     */
    void filterComments(List<String> comments, Set<String> blackList);
}

package cistus.store.springbootdeveloper.dto;

import cistus.store.springbootdeveloper.domain.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleListViewResponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;


    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
    }
}

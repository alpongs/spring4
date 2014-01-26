package net.madvirus.spring4.chap06.board;

import java.util.HashMap;
import java.util.Map;

public class MemoryArticleDao implements ArticleDao {

	private int articleNo = 0;
	private Map<Integer, Article> articleMap = new HashMap<>();

	@Override
	public void insert(Article article) {
		articleNo++;
		articleMap.put(articleNo, article);
	}

}
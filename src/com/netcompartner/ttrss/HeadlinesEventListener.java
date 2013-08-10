package com.netcompartner.ttrss;

import com.netcompartner.ttrss.types.Article;
import com.netcompartner.ttrss.types.ArticleList;

public interface HeadlinesEventListener {
	void onArticleListSelectionChange(ArticleList m_selectedArticles);
	void onArticleSelected(Article article);
	void onArticleSelected(Article article, boolean open);
	void onHeadlinesLoaded(boolean appended);	
}

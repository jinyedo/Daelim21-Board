package com.example.Board;

import java.util.List;

public class BoardService {

    BoardDAO boardDAO;

    public BoardService() {
        boardDAO = new BoardDAO();
    }

    public List<ArticleVO> listArticles() {
        return (List<ArticleVO>) boardDAO.selectAllArticles();
    }
}

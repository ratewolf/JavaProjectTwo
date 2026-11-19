package book_management.controller;
import book_management.repository.BookRepository;

import book_management.view.center.SetFrame;
import book_management.domain.Book;
import book_management.view.BookSearchPan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookController extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    BookRepository repository;
    ArrayList<Book> bookList;
    JComboBox<String> combo;
    private final BookSearchPan searchPan;

    public BookController(){
        searchPan = new BookSearchPan();
        combo = searchPan.getCombo();
        repository = new BookRepository();
        bookList = repository.select(searchPan.getSearchWord(), combo.getSelectedIndex());
        searchPan.setBookList(bookList);
        searchPan.initView();

        JButton btnSearch = searchPan.getBtnSearch();
        btnSearch.addActionListener(btnSearchListener);

        tabbedPane.add("도서 검색", searchPan);
        add(tabbedPane);

        SetFrame.setFrame(this, "도서관리 시스템", 700, 600);
    }

    ActionListener btnSearchListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            bookList = repository.select(searchPan.getSearchWord(), combo.getSelectedIndex());
            searchPan.setBookList(bookList);
            searchPan.putSearchResult();
        }
    };

    public static void main(String[] args) {
        new BookController();
    }

}



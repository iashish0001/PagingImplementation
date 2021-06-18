package com.iashish0001.pagingimplementation.model;

public class Item{


    private int id;
    private String title;
    private int test_series_id;
    private int free_flag;
    private String time;
    private int questions;
    private int marks;
    private boolean is_completed;
    private boolean is_test_attempted;
    private String pdf_url;
    private int show_result;
    private int show_rank;
    private int show_solutions;
    private int attempt_enabled;
    private int show_sectionselector;
    private int minimumsection;
    private String exam_theme;
    private String language;
    private String upcoming_date_time;



    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }




    public Item(){

    }

    public Item(int id, String title, int test_series_id, int free_flag, String time, int questions, int marks, boolean is_completed, boolean is_test_attempted, String pdf_url, int show_result, int show_rank, int show_solutions, int attempt_enabled, int show_sectionselector, int minimumsection, String exam_theme, String language, String upcoming_date_time) {
        this.id = id;
        this.title = title;
        this.test_series_id = test_series_id;
        this.free_flag = free_flag;
        this.time = time;
        this.questions = questions;
        this.marks = marks;
        this.is_completed = is_completed;
        this.is_test_attempted = is_test_attempted;
        this.pdf_url = pdf_url;
        this.show_result = show_result;
        this.show_rank = show_rank;
        this.show_solutions = show_solutions;
        this.attempt_enabled = attempt_enabled;
        this.show_sectionselector = show_sectionselector;
        this.minimumsection = minimumsection;
        this.exam_theme = exam_theme;
        this.language = language;
        this.upcoming_date_time = upcoming_date_time;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTest_series_id() {
        return test_series_id;
    }

    public void setTest_series_id(int test_series_id) {
        this.test_series_id = test_series_id;
    }

    public int getFree_flag() {
        return free_flag;
    }

    public void setFree_flag(int free_flag) {
        this.free_flag = free_flag;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getQuestions() {
        return questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    public boolean isIs_test_attempted() {
        return is_test_attempted;
    }

    public void setIs_test_attempted(boolean is_test_attempted) {
        this.is_test_attempted = is_test_attempted;
    }

    public String getPdf_url() {
        return pdf_url;
    }

    public void setPdf_url(String pdf_url) {
        this.pdf_url = pdf_url;
    }

    public int getShow_result() {
        return show_result;
    }

    public void setShow_result(int show_result) {
        this.show_result = show_result;
    }

    public int getShow_rank() {
        return show_rank;
    }

    public void setShow_rank(int show_rank) {
        this.show_rank = show_rank;
    }

    public int getShow_solutions() {
        return show_solutions;
    }

    public void setShow_solutions(int show_solutions) {
        this.show_solutions = show_solutions;
    }

    public int getAttempt_enabled() {
        return attempt_enabled;
    }

    public void setAttempt_enabled(int attempt_enabled) {
        this.attempt_enabled = attempt_enabled;
    }

    public int getShow_sectionselector() {
        return show_sectionselector;
    }

    public void setShow_sectionselector(int show_sectionselector) {
        this.show_sectionselector = show_sectionselector;
    }

    public int getMinimumsection() {
        return minimumsection;
    }

    public void setMinimumsection(int minimumsection) {
        this.minimumsection = minimumsection;
    }

    public String getExam_theme() {
        return exam_theme;
    }

    public void setExam_theme(String exam_theme) {
        this.exam_theme = exam_theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUpcoming_date_time() {
        return upcoming_date_time;
    }

    public void setUpcoming_date_time(String upcoming_date_time) {
        this.upcoming_date_time = upcoming_date_time;
    }
}

package com.github.seungyeop_lee.blog_example.observer_pattern;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

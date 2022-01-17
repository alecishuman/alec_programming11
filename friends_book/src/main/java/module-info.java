module com.example.friends_book {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.friends_book to javafx.fxml;
    exports com.example.friends_book;
}
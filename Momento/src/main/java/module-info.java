module dev.isuru.momento {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens dev.isuru.momento to javafx.fxml;
    exports dev.isuru.momento;
}
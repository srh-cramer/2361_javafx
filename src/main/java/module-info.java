module com.cramer._361_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.cramer._361_javafx to javafx.fxml;
    exports com.cramer._361_javafx;
}
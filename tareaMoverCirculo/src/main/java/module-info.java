module com.ejemplos.tareaMoverCirculo {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

    opens com.ejemplos.tareaMoverCirculo to javafx.fxml;
    exports com.ejemplos.tareaMoverCirculo;
}

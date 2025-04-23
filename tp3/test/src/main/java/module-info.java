module iut.gon.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens iut.gon.test to javafx.fxml;
    exports iut.gon.test;
}

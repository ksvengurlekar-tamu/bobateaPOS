module green.gongchapos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.naming;
    requires java.desktop;


    opens green.gongchapos to javafx.fxml;
    opens green.gongchapos.cashierView to javafx.fxml;  // Add this line to open the cashierView package.
    exports green.gongchapos;
    exports green.gongchapos.cashierView;
}
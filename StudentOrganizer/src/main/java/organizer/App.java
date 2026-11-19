package organizer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application { // класс является JavaFX приложением наследование от Application

    @Override //означает, что переопределяется метод родителя
    public void start(Stage stage) { //этот метод JavaFX вызывает когда приложение готово параметр это окно которое она создала
        Label label = new Label("Привет"); //создание текстовой метки
        stage.setScene(new Scene(new StackPane(label), 640, 400)); //Кладём метку в контейнер StackPane, контейнер в сцену размером 640×400, а сцену на сцену-окно
        stage.setTitle("Студенческий органайзер");//задаем заголовок
        stage.show(); //показываем заголовок
    }

    public static void main(String[] args) {
        launch(); //launch() запускает механизм JavaFX, который в итоге вызывает start
    }
}

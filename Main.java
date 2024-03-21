package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Doctor's Office Login");

        // Main layout
        VBox mainLayout = new VBox(20);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.setStyle("-fx-background-color: #232323; -fx-padding: 20px;");

        // Doctor's Office label
        Label titleLabel = new Label("Doctor's Office");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #ffecd7;");

        // Sign In label
        Label signInLabel = new Label("Sign In");
        signInLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white;");

        // Email label and text field
        Label emailLabel = new Label("Email Address:");
        emailLabel.setStyle("-fx-text-fill: #ffecd7;");
        TextField emailField = new TextField();
        emailField.setPrefWidth(200); // Set preferred width

        // Password label and text field
        Label passwordLabel = new Label("Password:");
        passwordLabel.setStyle("-fx-text-fill: white;");
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefWidth(200); // Set preferred width

        // Remember me checkbox
        CheckBox rememberMeCheckBox = new CheckBox("Remember Me");
        rememberMeCheckBox.setTextFill(javafx.scene.paint.Color.WHITE);

        // Sign Up hyperlink
        Hyperlink signUpLink = new Hyperlink("Don't have an account? Sign up");
        signUpLink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Handle sign-up action (navigate to sign-up page)
                System.out.println("Navigate to sign-up page");
            }
        });

        // Forgot Password hyperlink
        Hyperlink forgotPasswordLink = new Hyperlink("Forgot password?");
        forgotPasswordLink.setTextFill(javafx.scene.paint.Color.WHITE);
        forgotPasswordLink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Handle forgot password action (navigate to forgot password)
                System.out.println("Navigate to forgot password page");
            }
        });

        // Sign In button
        Button signInButton = new Button("Sign In");
        signInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Handle sign-in action
                System.out.println("Sign In button clicked");
            }
        });

        // Add all components to the main layout
        mainLayout.getChildren().addAll(titleLabel, signInLabel, emailLabel, emailField, passwordLabel,
                passwordField, rememberMeCheckBox, signUpLink, forgotPasswordLink, signInButton);

        // Set up scene
        Scene scene = new Scene(mainLayout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

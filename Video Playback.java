import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class VideoPlayer extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a media player
        String videoPath = "path/to/your/video.mp4";
        Media media = new Media(new File(videoPath).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        // Create a media view to display the video
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.setFitWidth(800);
        mediaView.setFitHeight(600);

        // Create a scene and add the media view
        Scene scene = new Scene(mediaView, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Video Player");

        // Play the video when the stage is shown
        primaryStage.setOnShown(event -> mediaPlayer.play());

        // Stop the media player when the stage is closed
        primaryStage.setOnClosed(event -> mediaPlayer.stop());

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

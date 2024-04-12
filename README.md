# Video Playback in Java

This project demonstrates how to implement video playback functionality in a Java application using the JavaFX framework.

## Prerequisites

1. Java Development Kit (JDK) 8 or higher.
2. JavaFX libraries included in your project's classpath.

## Usage

1. Provide the path to the video file you want to play.
2. The application will create a `MediaPlayer` object using the video file and display it in a `MediaView` component.
3. The video will start playing when the stage is shown.
4. The video playback will stop when the stage is closed.

## Explanation

Here's a breakdown of the code:

1. **Extending `Application` Class**: The `VideoPlayer` class extends the `Application` class, which is the entry point for a JavaFX application.
2. **Creating `Media` and `MediaPlayer`**: In the `start()` method, we create a `Media` object by providing the path to the video file. We then create a `MediaPlayer` object using the `Media` object, which will be responsible for playing the video.
3. **Creating `MediaView`**: Next, we create a `MediaView` object and set its width and height to display the video.
4. **Setting up the Scene**: We create a `Scene` object and add the `MediaView` to it, then set the scene on the `Stage` object. We also set the title of the stage.
5. **Playing the Video**: We start playing the video when the stage is shown by calling the `play()` method on the `MediaPlayer` object.
6. **Stopping the Video**: We stop the `MediaPlayer` when the stage is closed by setting the `onClosed` event handler.
7. **Launching the Application**: The `main()` method launches the JavaFX application.

## Example Code

```java
// Code snippet from VideoPlayer.java
String videoPath = "path/to/your/video.mp4";
Media media = new Media(new File(videoPath).toURI().toString());
MediaPlayer mediaPlayer = new MediaPlayer(media);

MediaView mediaView = new MediaView(mediaPlayer);
mediaView.setFitWidth(800);
mediaView.setFitHeight(600);

Scene scene = new Scene(mediaView, 800, 600);
primaryStage.setScene(scene);
primaryStage.setTitle("Video Player");

primaryStage.setOnShown(event -> mediaPlayer.play());
primaryStage.setOnClosed(event -> mediaPlayer.stop());

primaryStage.show();

```

## Conclusion

This project demonstrates how to use the JavaFX framework to implement video playback functionality in a Java application. The provided code can be used as a starting point for building more advanced video player applications.

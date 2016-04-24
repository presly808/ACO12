package ua.artcode.taxi.view;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by serhii on 24.04.16.
 */
public class ShowMapMarkerFrame extends JFrame {

    public static final String MARKER_TEMPLATE_PATH = "/home/serhii/dev/IdeaProjects/ACO12/TaxiApp/resources/templates/googlemapmarker.html";


    public ShowMapMarkerFrame() throws HeadlessException {
        setSize(600, 600);
        JFXPanel panel = new JFXPanel();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                InitializerFX(panel);
            }
        });
    }

    private void InitializerFX(JFXPanel panel) {
        final WebView webView = new WebView();
        final WebEngine webEngine = webView.getEngine();

        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(MARKER_TEMPLATE_PATH));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line).append("\n");
            }

            // put location js format to html

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        webEngine.load("file://" + MARKER_TEMPLATE_PATH);

        // create
        Scene scene = new Scene(webView,600,600, javafx.scene.paint.Color.web("#666970"));

        panel.setScene(scene);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShowMapMarkerFrame();
            }
        });
    }
}

package com.icuxika

import com.jfoenix.controls.JFXButton
import com.jfoenix.controls.JFXTabPane
import javafx.application.Application
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color
import javafx.stage.Stage

fun main(args: Array<String>) {
    Application.launch(MainApp::class.java, *args)
}

class MainApp : Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage?.let { stage ->
            val jfxTabPane = JFXTabPane()

            val buttonNameProperty = SimpleStringProperty("Hello, world")
            val button = JFXButton().apply {
                textProperty().bind(buttonNameProperty)
                buttonType = JFXButton.ButtonType.RAISED
                textFill = Color.WHITE
                background = Background(BackgroundFill(Color.DODGERBLUE, CornerRadii(4.0), Insets.EMPTY))
            }

            stage.scene = Scene(jfxTabPane, 600.0, 400.0)
            stage.show()
        }
    }
}
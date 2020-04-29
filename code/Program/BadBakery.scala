import scala.collection.mutable.ListBuffer
import java.awt.image.BufferedImage
import java.io.FileInputStream;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javafx.scene.control.TitledPane
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JTextArea
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JTextArea
import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.scene.layout.TilePane
import javafx.stage.Stage
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections
import javafx.stage.Stage;
import javafx.scene.text.Text
import javafx.scene.text
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage

object BadBakery {
  //Create userSourdough option, where they will populate class attributes with input
  def main(args: Array[String]) {

    var sourdough = new userSourdough()
    var properSourdough = new properSourdough()

    println("LET'S MAKE SOME BREAD, BABY")
    sourdough.starter = stepOne
    println("mixing starter...")
    sourdough.rest = rest
    println("resting for " + sourdough.rest)
    sourdough.riseTime = riseTime
    sourdough.rise = riseSize
    sourdough.ovenTemp = ovenTemp
    sourdough.bakeTime = bakeTime
    sourdough.breadAppearance = breadAppearance

    var path = ""

    var breadTurnOut = compareBreads(sourdough, properSourdough)
    if (breadTurnOut == true) {
      path = "sourdough.jpg"
    } else {
      path = "jello.jpg"
    }
    Application.launch(classOf[HelloWorld], path)

  }

  //add starter ingredients to class attribute starter list
  def stepOne: List[String] = {
    var starter = new ListBuffer[String]()
    println("There are 3 elements to the starter")
    println("Add 1 element to the starter")
    var elementOne = scala.io.StdIn.readLine()
    starter += elementOne
    println("Add next element to the starter")
    var elementTwo = scala.io.StdIn.readLine()
    starter += elementTwo
    println("Add last element to the starter")
    var elementThree = scala.io.StdIn.readLine()
    starter += elementThree

    return starter.toList
  }

  //set rest time of usersourdough object to user input
  def rest: Int = {
    println("How many minutes are you gonna let 'er rest?")
    return scala.io.StdIn.readInt()
  }

  //set rise time of usersourdough object to user input
  def riseTime: Int = {
    println("How many hours are you tryna let it rise for?")
    return scala.io.StdIn.readInt()
  }

  //set rise size of usersourdough object to user input
  def riseSize: Double = {
    println("How many times it's OG size should it be after resting?")
    return scala.io.StdIn.readDouble()
  }

  //set oventemp of usersourdough object to user input
  def ovenTemp: Int = {
    println("What temp you gonna preheat the oven to, boss?")
    return scala.io.StdIn.readInt()
  }

  //set bake time of usersourdough object to user input
  def bakeTime: Int = {
    println("How many minutes you gonna let it bake for?")
    return scala.io.StdIn.readInt()
  }

  //set breadappearance of usersourdough object to user input
  def breadAppearance: String = {
    println("What color will indicate it's readiness?")
    return scala.io.StdIn.readLine()
  }

  def compareBreads(sourdough: Bread, properSourdough: Bread): Boolean = {
    if (sourdough.hashCode() == properSourdough.hashCode()) {
      if (sourdough.equals(properSourdough))
        return true
      else
        return false

    } else
      return false

  }

}

class HelloWorld extends Application {
  override def start(stage: Stage) {

    stage.setTitle("creating RadioButton");
    var params = getParameters();
    var list = params.getRaw();
    var path = list.get(0)

    var image = new Image(path);

    var iv1 = new ImageView();
    iv1.setImage(image);

    var root = new Group();
    var scene = new Scene(root);
    scene.setFill(Color.BLACK);
    var box = new HBox();
    box.getChildren().add(iv1);
    root.getChildren().add(box);

    stage.setTitle("Your Sourdough");
    stage.setWidth(415);
    stage.setHeight(200);
    stage.setScene(scene);
    stage.sizeToScene();
    stage.show();
  }

}
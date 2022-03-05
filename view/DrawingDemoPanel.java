package view;

import java.awt.BorderLayout;
import java.awt.Container; 
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ShapeDemoListener;
 
public class DrawingDemoPanel {

    private JFrame window;
    private DrawingDemoCanvas canvas;
    private JRadioButton cirButton = new JRadioButton("Circle");
    private JRadioButton recButton = new JRadioButton("Rectangle");
    private JRadioButton triButton = new JRadioButton("Triangle");

    private JRadioButton whiteColor = new JRadioButton("white");
    private JRadioButton yellowColor = new JRadioButton("yellow");
    private JRadioButton redColor = new JRadioButton("red");

    private JCheckBox filledBox = new JCheckBox("filled");

    private JRadioButton smallSize = new JRadioButton("small");
    private JRadioButton mediumSize = new JRadioButton("medium");
    private JRadioButton largeSize = new JRadioButton("large");

    private JButton sortXButton = new JButton("Sort by X");
    private JButton sortYButton = new JButton("Sort by Y");
    private JButton sortAllButton = new JButton("Show All");
    private JButton sortOrderButton = new JButton("Show Order");
    private JButton clearButton = new JButton("Clear");
    private JButton exitButton = new JButton("Exit");

    public DrawingDemoPanel(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        canvas = new DrawingDemoCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(4, 1));
        cp.add(BorderLayout.SOUTH, southPanel);
        JPanel shapePanel = new JPanel();
        JPanel colorPanel = new JPanel();
        JPanel sizePanel = new JPanel();
        JPanel buttonpPanel = new JPanel();

        southPanel.add(shapePanel);
        southPanel.add(colorPanel);
        southPanel.add(sizePanel);
        southPanel.add(buttonpPanel);

        shapePanel.setBorder(BorderFactory.createTitledBorder("Shape"));
        shapePanel.add(cirButton);
        shapePanel.add(recButton);
        shapePanel.add(triButton);
        ButtonGroup shapeGroup = new ButtonGroup();
        shapeGroup.add(cirButton);
        shapeGroup.add(recButton);
        shapeGroup.add(triButton);
        cirButton.setSelected(true);

        colorPanel.setBorder(BorderFactory.createTitledBorder("Color"));
        colorPanel.add(whiteColor);
        colorPanel.add(yellowColor);
        colorPanel.add(redColor);
        colorPanel.add(filledBox);
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(whiteColor);
        colorGroup.add(yellowColor);
        colorGroup.add(redColor);
        whiteColor.setSelected(true);

        sizePanel.setBorder(BorderFactory.createTitledBorder("Size"));
        sizePanel.add(smallSize);
        sizePanel.add(mediumSize);
        sizePanel.add(largeSize);
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallSize);
        sizeGroup.add(mediumSize);
        sizeGroup.add(largeSize);
        smallSize.setSelected(true);

        buttonpPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
        buttonpPanel.add(sortXButton);
        buttonpPanel.add(sortYButton);
        buttonpPanel.add(sortAllButton);
        buttonpPanel.add(sortOrderButton);
        buttonpPanel.add(clearButton);
        buttonpPanel.add(exitButton);

        ShapeDemoListener listener = new ShapeDemoListener(this);
        canvas.addMouseListener(listener);
        clearButton.addActionListener(listener);
        exitButton.addActionListener(listener);
        sortOrderButton.addActionListener(listener);
        sortAllButton.addActionListener(listener);
        sortXButton.addActionListener(listener);
        sortYButton.addActionListener(listener);
    }

    public JRadioButton getCirButton() {
        return cirButton;
    }

    public JRadioButton getRecButton() {
        return recButton;
    }

    public JRadioButton getTriButton() {
        return triButton;
    }

    public JRadioButton getWhiteColor() {
        return whiteColor;
    }

    public JRadioButton getYellowColor() {
        return yellowColor;
    }

    public JRadioButton getRedColor() {
        return redColor;
    }

    public JCheckBox getFilledBox() {
        return filledBox;
    }

    public JRadioButton getSmallSize() {
        return smallSize;
    }

    public JRadioButton getMediumSize() {
        return mediumSize;
    }

    public JRadioButton getLargeSize() {
        return largeSize;
    }

    public JButton getSortXButton() {
        return sortXButton;
    }

    public JButton getSortYButton() {
        return sortYButton;
    }

    public JButton getSortAllButton() {
        return sortAllButton;
    }

    public JButton getSortOrderButton() {
        return sortOrderButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public DrawingDemoCanvas getCanvas() {
        return canvas;
    }

    public JFrame getWindow() {
        return window;
    }
}

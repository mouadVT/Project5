/**
 * 
 */
package project5;

import java.awt.Color;
import cs2.Button;
import cs2.CircleShape;
import cs2.Shape;
import cs2.TextShape;
import cs2.Window;
import cs2.WindowSide;
import list.AList;

/**
 * @author Mouad
 * @version 04/15/2022
 */
public class ReadData {

    private Window window;
    private ColonyCalculator colonyCalculator;
    private Button accept;
    private Button reject;
    private AList<CircleShape> personCircles;
    private static int DISPLAY_FACTOR = 10;
    private static int PLANET_HEIGHT = 7;
    private static int PLANET_SIZE = PLANET_HEIGHT * DISPLAY_FACTOR;
    private static int QUEUE_STARTX = 50;
    private static int QUEUE_STARTY = 75;
    private static int CIRCLE_SIZE = 4;
    private Shape[] planetShapes = new Shape[3];
    private static Color[] PLANET_COLORS = new Color[7];

    /**
     * Constructor
     * 
     * @param colony
     *            The queue of applicants
     */


    /**
     * This method dequeues the Person at the front of the
     * applicantQueue
     * queue and updates the window to represent the current status
     * 
     * @param button
     *            accept button
     */
    public void clickedAccept(Button button) {
    }


    /**
     * Handles rejection with the Colony Calculator.
     * 
     * @param button
     *            : sendTrain button
     */
    public void clickedReject(Button button) {
    }


    /**
     * This method disables the buttons and is called when the queue is empty
     */
    private void endSimulation() {
    }


    /**
     * This method creates Circle shapes for each Person in the
     * applicantQueue queue and adds the circles to the PersonCircles list
     * and
     * the window. This is called by the constructor
     */
    private void drawCirclesForPerson() {
    }


    /**
     * Update everything. Wipes the screen and resets.
     */
    private void update() {
    }


    /**
     * This method updates whether the accept button is enabled based on the
     * qualifications of the upcoming person in the queue
     */
    private void updateButtons() {
    }


    /**
     * This method removes the circle at the front of the queue and in turn
     * calls
     * updateCircles to redraw the new waiting persons/applicants
     */
    private void updateQueue() {

    }


    /**
     * This method adds the person circles to the window. This is invoked
     * whenever
     * the accept or reject button is clicked
     */
    private void updateCircles() {
    }


    /**
     * When the window is displayed the first time buttons are disabled if queue
     * is
     * empty otherwise enable
     */
    private void initButtons() {nable();
        }
    }


    /**
     * This method adds two shapes to the window and updates their sizes based
     * on
     * how full the Coaster train currently is
     */
    private void updatePlanet() {}


    /**
     * Creates the indicator for a planet
     * 
     * @param planetX
     *            x coordinate of the start of planet indicators
     * @param planetY
     *            y coordinate of the start of planet indicators
     * @param planetOff
     *            distance between planet indicators
     * @param planetIndex
     *            number of planet to represent
     * @return
     */
    private Shape addPlanetShape(
        int planetX,
        int planetY,
        int planetOff,
        int planetIndex) {
    }


    /**
     * Creates the filling for planet as people get added
     * 
     * @param planetX
     *            x coordinate of the start of planet indicators
     * @param planetY
     *            y coordinate of the start of planet indicators
     * @param planetOff
     * @param planetIndex
     *            number of planet to update
     */
    private void addPlanetFilled(
        int planetX,
        int planetY,
        int planetOff,
        int planetIndex) {
    }


    /**
     * Rewrites the text boxes
     */
    private void updateText() {
    }


    /**
     * Rewrites the text for the planets
     */
    private void updatePlanetText() {
    }


    /**
     * Creates the string for the planet text
     * 
     * @param planetX
     *            x coordinate for the current planet
     * @param planetY
     *            y coordinate for the current planet
     * @param index
     *            the current planet
     */
    private void textPlanet(int planetX, int planetY, int index) {
    }


    /**
     * Updates the text for the current person
     */
    private void updatePersonText() {
    }


    /**
     * Helper method to add TextShape to the window
     */
    private void addTextShape(String message, int x, int y) {
    }
}

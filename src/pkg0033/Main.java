/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0033;

/**
 * Main class for running the application.
 */
public class Main {
    /**
     * Main method to start the application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create instances of InfoView
        InfoView infoView1 = new InfoView();
        InfoView infoView2 = new InfoView();
        
        // Set the views to be visible
        infoView1.setVisible(true);
        infoView2.setVisible(true);
        
        // Create an instance of InfoController
        InfoController infoController = new InfoController();
        
        // Add views to the controller
        infoController.addInfoView(infoView1);
        infoController.addInfoView(infoView2);
        
        // Set the controller for each view
        infoView1.setInfoController(infoController);
        infoView2.setInfoController(infoController);
    }
}

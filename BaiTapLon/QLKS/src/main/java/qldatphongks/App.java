/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldatphongks;

import java.awt.EventQueue;

import controller.LoginController;
import view.LoginView;

import java.awt.EventQueue;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
                // hiển thị màn hình login
                controller.showLoginView();
            }
        });
    }
}

/*try {
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	LoginView view = new LoginView();
	LoginController controller = new LoginController(view);
	// hiển thị màn hình login
	controller.showLoginView();
} catch (Exception ex) {
	ex.printStackTrace();
}	*/
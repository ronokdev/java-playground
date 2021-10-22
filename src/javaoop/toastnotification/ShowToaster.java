package javaoop.toastnotification;

import java.awt.*;
import java.awt.event.*;

public class ShowToaster
{
    public static void startToast() throws AWTException, InterruptedException
    {
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        else
        {
            displayTray();
        }
    }

    public static void displayTray() throws AWTException, InterruptedException
    {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        Image image = Toolkit.getDefaultToolkit().createImage(ShowToaster.class.getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Softphone");

        final PopupMenu popup = new PopupMenu();
        MenuItem exitItem = new MenuItem("Exit");
        popup.add(exitItem);
        //Let the system resize the image if needed
//        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("Softphone");
        tray.add(trayIcon);
        trayIcon.setPopupMenu(popup);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeIcon(tray,trayIcon);
            }
        });

        trayIcon.displayMessage("Softphone disconnected from server", "Please try to register again", TrayIcon.MessageType.ERROR);

    }

    private static void removeIcon(SystemTray systray, TrayIcon trayIcon)
    {
        systray.remove(trayIcon);
    }
}

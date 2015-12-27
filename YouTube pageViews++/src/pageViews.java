/**
 * Created by Mohammad Yaqoob.
 */

import java.net.URI;
import java.awt.Desktop;
import java.util.Scanner;

public class pageViews {
    public static void openPage(String s, int time) throws Exception{
        //URL url = new URL(s);
        Desktop desktop = Desktop.getDesktop();
        long t = System.currentTimeMillis();
        while(System.currentTimeMillis() <= (t+(time*1000))){
            desktop.browse(new URI(s));
        }
        System.exit(0);
    }
    public static void main(String lol[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("\nYouTube Page Views++ \n");
        System.out.print("Enter the URL of the video: ");
        String url = in.next();
        System.out.print("\nEnter the time(Seconds) during which the page will open as many times it can: ");
        int time = in.nextInt();
        openPage(url,time);
    }
}

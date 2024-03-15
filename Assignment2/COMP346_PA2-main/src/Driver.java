package src;
/**
 *
 * DOne by MHD EYAD ABOU KER 40208070
 * ABD ALWAHED 40246177
 *.
 * **/

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	Network objNetwork = new Network( );            /* Activate the network */
        Server objServer1 = new Server("1");
        Server objServer2 = new Server("2");
        Client objClient1 = new Client("sending");          /* Start the sending client thread */
        Client objClient2 = new Client("receiving");        /* Start the receiving client thread */

        objNetwork.start();
        objServer1.start();
        objServer2.start();
        objClient1.start();
        objClient2.start();
        

    }
    
 }

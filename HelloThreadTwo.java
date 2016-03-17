package com.my.sample;
import java.applet.Applet ;
import java.awt.List ;
     
public class HelloThreadTwo extends Applet implements Runnable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// declare instance variables
    private Thread threadOne ;
    private Thread threadTwo ;
    private Thread threadThree ;
     
    private List myList ;
     
    public void init() 
    {
        // init the thread variables
        threadOne = new Thread( this );
        threadTwo = new Thread( this );
        threadThree = new Thread( this );
     
        // now give each Thread a name
        threadOne.setName( "Bert" );
        threadTwo.setName( "Marley" );
        threadThree.setName( "Lucky" );
        // threads have been created, but are not yet "alive"
     
        // create the list
        myList = new List( );
     
        //set up the GUI (just the list)
        add( myList );
     
        //start the Threads
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        // this causes the Threads to become runnable
        // ALL of them will be running through this applet object's
        // run method, but each Thread will be running at a different
        // moment. They will all sleep for a half-second (500 milliseconds) 
    } // close init
     
    @SuppressWarnings("deprecation")
	public void run() 
    {
        // this run method will repeat 10 times
        for ( int i = 0 ; i < 10 ; i++ ) 
        {
            myList.addItem( Thread.currentThread().getName() + " is running" ,-1);    
            try
            {
                Thread.sleep( 500 );
            }
            catch (InterruptedException e) 
            {
            }
        } // close for loop
        myList.addItem( Thread.currentThread().getName() + " is done" );
    } // close run
} // close applet

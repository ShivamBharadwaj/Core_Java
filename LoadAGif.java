package com.my.sample;

import java.applet.* ;
import java.awt.* ;
     
public class LoadAGif extends Applet 
{
	private static final long serialVersionUID = 1L;
	private Image myImage ;
 
    public void init() 
    {
        myImage = getImage( getCodeBase() , "wb_standbyhov.gif" );
        // use a MediaTracker so the image will be downloaded
        // completely before being displayed
        MediaTracker mt = new MediaTracker( this );
        mt.addImage( myImage , 0 );
 
        try
        {
            mt.waitForAll(); // blocks here until Image is fully downloaded
        }
        catch ( InterruptedException e ) 
        {
        }
    }// close init
 
    public void paint( Graphics g ) 
    {
        g.drawImage( myImage , 25 , 25 , this );
    }// close paint
}// close applet

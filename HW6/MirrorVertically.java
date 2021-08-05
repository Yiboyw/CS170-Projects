/*Name: Yibo Wang
OPUSID: ywan738
UserID#: 2203982
Emory email: yibo.wang@emory.edu
Collaboration Statement: I used the Think @ Java textbook & collaborated with Brittany Nixon, Jacob Shuster & Kevin Park. 
*/


import java.awt.Color;
import java.awt.Dimension;


public class MirrorVertically extends Command
{
    public MirrorVertically ()
    {
        super("Mirror Vertically");
    }


    public void execute (Pixmap target)
    {
        Dimension bounds = target.getSize();
        // TODO: mirror target image along vertical middle line by swapping
        //       each color on right with one on left
        
	   
        
	for (int x = 0; x < bounds.width/2; x++) { 
	//It is x<bounds.width/2 because you only need to go through half of the horizontal row. 
		
		for (int y = 0; y < bounds.height; y++) { //These two for-loops go through the entire pixmap. 
			
			
			Color temp = target.getColor(x,y); 
			//creates a variable Color called temp that stores the color of the first pixel in the pixmap's row
			
			target.setColor(x,y,target.getColor(bounds.width-x-1,y)); 
			//sets the first pixel of the pixmap's row, which has coordinates (x,y), to the pixel on the opposite side of the pixmap's row, which has coordinates(bounds.width-x-1,y). You subtract 1 because this 2d array starts with 0.  
			target.setColor(bounds.width-x-1,y,temp); 
			//sets the pixel on the opposite side of the image's row, which has coordinates(bounds.width-x-1), to the color of first pixel of the pixmap's row, which is  called temp. 
			
				
			}	
    		}	
       	}
    
        

}


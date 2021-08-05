/*Name: Yibo Wang
OPUSID: ywan738
UserID#: 2203982
Emory email: yibo.wang@emory.edu
Collaboration Statement: I used the Think @ Java textbook & collaborated with Brittany Nixon & Jacob Shuster. 
*/

import java.awt.Color;
import java.awt.Dimension;


public class MirrorHorizontally extends Command
{
    public MirrorHorizontally ()
    {
        super("Mirror Horizontally");
    }


    public void execute (Pixmap target)
    {
        Dimension bounds = target.getSize();
        // TODO: mirror target image along horizontal middle line by swapping
        //       each color on top with one on the bottom

	for(int x = 0; x < bounds.width;x++) {
		for (int y = 0; y < bounds.height/2;y++) { //It is y<bounds.height/2 because you only need to go through half of the pixmap's column.
        	
			
			Color temp = target.getColor(x,y);
			//creates a variable Color called temp that stores the color of the first pixel of the pixmap's column.

			target.setColor(x,y,target.getColor(x,bounds.height-y-1));
			//sets the first pixel of the pixmap's column, which has coordinates (x,y), to the pixel on the opposite side of the pixmap's column, which has coordinates(x,bounds.height-y-1).  		
			target.setColor(x,bounds.height-y-1,temp);
			//sets the pixel on the opposite side of the pixmap's column, which has coordinates(x,bounds.height-y-1), to the color of first pixel of the pixmap's column, which is  called temp. 
			
		
		}
	
	}
	

	}
}

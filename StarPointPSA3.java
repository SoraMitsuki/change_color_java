/* Filename: StarPointPSA3.java 
* Created by: Sixing Jiao, cs8afbah and Jiaqi Fan, cs8afbct
 * Partner Histories:
   * Sixing Jiao:
      PSA0 Partner:  Jiaqi Fan, cs8afbct
      PSA1 Partner:  Jiaqi Fan, cs8afbct
      PSA2 Partner:  Jiaqi Fan, cs8afbct
      PSA3 Partner:  Jiaqi Fan, cs8afbct
      PSA4 Partner:  To be determined...
      PSA5 Partner:  To be determined...
      PSA6 Partner:  To be determined...
      PSA7 Partner:  To be determined...
      PSA8 Partner:  To be determined...

   * Jiaqi Fan:
      PSA0 Partner:  Sixing Jiao, cs8afbah
      PSA1 Partner:  Sixing Jiao, cs8afbah
      PSA2 Partner:  Sixing Jiao, cs8afbah
      PSA3 Partner:  Sixing Jiao, cs8afbah
      PSA4 Partner:  To be determined...
      PSA5 Partner:  To be determined...
      PSA6 Partner:  To be determined...
      PSA7 Partner:  To be determined...
      PSA8 Partner:  To be determined...
      PSA9 Partner:  To be determined...

* Date: Oct 19th, 2015 
*/ 
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;

public class StarPointsPSA3 extends SimplePicture 
{
 public Picture ()
  {
    super();  
  }
  public Picture(String fileName)
  {
    super(fileName);
  }
  public Picture(int width, int height)
  {
    super(width,height);
  }
  
  public Picture(Picture copyPicture)
  {
    super(copyPicture);
  }
  
  public Picture(BufferedImage image)
  {
    super(image);
  }
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }

  public void contrastEnhance()
{
  Pixel[] pixelArray = this.getPixels(); //method to decrease red green blue value for picture
  Pixel pixel = null;
  int index = 0;
  int valueRed = 0;
  int valueGreen = 0;
  int valueBlue = 0;
  int newValueRed = 0; 
  int newValueGreen= 0;
  int newValueBlue= 0;
  
  while( index < pixelArray.length )
  {
    pixel = pixelArray[index];
    valueRed = pixel.getRed();
    if ( valueRed> 128 ) 
    {
      newValueRed = (int)(valueRed*1.2);
    }
    else 
    {
      newValueRed = (int)(valueRed/1.2);
    }
    valueGreen = pixel.getGreen();
    if ( valueGreen> 128 ) 
    {
      newValueGreen = (int)(valueGreen*1.2);
    }
    else 
    {
      newValueGreen = (int)(valueGreen/1.2);
    }
    valueBlue = pixel.getBlue();
    if ( valueBlue> 128 ) 
    {
      newValueBlue = (int)(valueBlue*1.2);
    }
    else {
      newValueBlue = (int)(valueBlue/1.2);
    }
    pixel.setRed(newValueRed);//set the new red value
    pixel.setGreen(newValueGreen); //set the new green value  
    pixel.setBlue(newValueBlue); //set the new blue value 
    index++;
  }
}
  public static void main (String[] args) 
  { 
   Picture pic = new Picture ( FileChooser.pickAFile() );
   pic.show();
   Picture enhanced = new Picture (pic);
   enhanced.contrastEnhance();
   enhanced.show();
  }
}

  

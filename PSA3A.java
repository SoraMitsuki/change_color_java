/* Filename: PSA3A.java 
* Created by: Partner Name1 PID1 Email1 and Partner Name2 PID2 Email2 
* Partner history for Name1: PSA1 Name PID, PSA2 Name PID
* Partner history for Name2: PSA1 Name PID, PSA2 Name PID
* Date: 
*/ 
public class PSA3A
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) 
    { 
        Picture pic = new Picture ( FileChooser.pickAFile() );
        Picture SubColor = new Picture (pic);
        pic.show();
        SubColor.subtractColor(100, 100, 100);
        SubColor.show();
    } 
}


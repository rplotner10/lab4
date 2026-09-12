import java.util.ArrayList;

public class Pixel{
    private int red;
    private int green;
    private int blue;

    public int Pixel() {
        setRed(0);
        setGreen(0);
        setBlue(0);
    }

    public void setRed(int r){
        if (r < 0 && r > 255){
            System.out.println("The red values are either higher or lower then scope of RGB values! ");
        }
    }

    public void setGreen(int g){
        if (g < 0 && g > 255){
            System.out.println("The green values are either higher or lower then scope of RGB values! ");
        }
    }

    public void setBlue(int b){
        if (b < 0 && b > 255){
            System.out.println("The blue values are either higher or lower then scope of RGB values! ");
        }
    }

    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
    }

    private boolean isRealRGBValue(int val){
            if (isRealRGBValue(b)) {
                rgb = //???;
            }

    }

    public String toString() {
        
    }
}

public class Icon{
    private ArrayList<ArrayList<Pixel>>pixels;

    //Create the deafult constructor so that we can make the outer list of rows.
    pixels = new ArrayList<ArrayList<Pixel>>();
    
    

    for (int i = 0; i < 5; i++ ) {
        ArrayList<Pixel> row = new ArrayList<Pixel>();

        for (int j = 0; j < 5; j++){
            row.add(new Pixel(0,0,0));
        }
        pixels.add(row);
    }
    

}


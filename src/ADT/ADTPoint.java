package ADT;

public class ADTPoint {
    private int x;
    private int y;

    //konstruktor default
    public ADTPoint(){
        this.x = 0;
        this.y = 0;
    }

    //konstruktor with value
    public ADTPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    //Setter
    public void setX(int newX){
        this.x = newX;
    }
    
    public void setY(int newY){
        this.y = newY;
    }

    //Getter
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
//CetakPoint
    public void cetakPoint(){
        System.out.println(this.x + ", " + this.y);
    }
}

class BoundsException extends Exception{
    void printer(){
        printStackTrace();
        System.err.println("Out of Bounds!!!");
    }
}
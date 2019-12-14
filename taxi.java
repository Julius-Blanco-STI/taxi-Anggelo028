class taxi {
    private int x = 0;
        private int y = 0;
        private String platenumber = null;
        private int destx = 0;
        private int desty = 0;
        public taxi(String i){
            platenumber = i;
        }
    public void book (int destx, int desty){
        this.destx = destx;
        this.desty = desty;
    }
    public void ruuun(String trip){
        for(int i = 0; i < trip.length(); i++){
            if(trip.charAt(i)=='i') {
                x--;
            }else if(trip.charAt(i)=='d'){
                y--;
            }else if(trip.charAt(i)=='g'){
                x++;
            }else if (trip.charAt(i)=='f') {
                y++;
            }
        }
    }
    public void printcurrentlocation(){
        System.out.println(x + "," + y);  
    }
    public boolean reacheddestination(){
        if (x == destx && y == desty){
            return true;
        }else{
            return false;
        }
    }
}


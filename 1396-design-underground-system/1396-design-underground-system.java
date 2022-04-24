class UndergroundSystem {
   
    HashMap<Integer, String> checkIn ;
    HashMap<String,List<Double>> timetaken;
    public UndergroundSystem() {
        checkIn= new HashMap<>();
        timetaken= new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id,stationName);
        List<Double> list =new ArrayList<Double>();
        list.add((double)t);
        timetaken.put(String.valueOf(id),list);
        
    }
    
    public void checkOut(int id, String stationName, int t) {
        
        String startingStation= checkIn.get(id);
         List<Double> list =new ArrayList<Double>();
        list=timetaken.get(String.valueOf(id));
        Double time = t-list.get(0);
        if(timetaken.containsKey(startingStation+"|"+stationName)){
            list.clear();
            list=timetaken.get(startingStation+"|"+stationName);
            list.add(time);
            timetaken.put(startingStation+"|"+stationName, list);
        }
        else
        {
            list.clear();
            list.add(time);
            timetaken.put(startingStation+"|"+stationName,list);
        }
        
        
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
         List<Double> list = new ArrayList<Double>();
         list =timetaken.get( startStation+"|"+endStation);
        int n=0;
        Double totalTime=0.0;
        for(int i=0;i<list.size();i++){
            totalTime+=list.get(i);
            n++;
        }
        return totalTime/n;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
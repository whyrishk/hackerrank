    int alicepoints =0;
    int bobpoints =0;
    
    for(int i =0; i<a.size();i++){
        if(a.get(i) >b.get(i)){
            alicepoints++;
        }else if(a.get(i)<b.get(i)){
            bobpoints++;
            
        }
        }
          List<Integer> result = new ArrayList<>();
          result.add(alicepoints);
          result.add(bobpoints);
          return result;
    }
    }

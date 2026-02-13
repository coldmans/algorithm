import java.util.*;

class Solution {
    
    class Song{
        int id;
        int play;
        
        public Song(int id, int play){
            this.id = id;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> playMap = new HashMap<>();
        Map<String, List<Song>> songMap = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++){
            String genre = genres[i];
            int play = plays[i];
            
            playMap.put(genre, playMap.getOrDefault(genre, 0) + play);
            if(!songMap.containsKey(genre)){
                songMap.put(genre, new ArrayList<>());
            }
            
            songMap.get(genre).add(new Song(i, play));
        }
        
        List<String> sortedMap = new ArrayList<>(songMap.keySet());
        Collections.sort(sortedMap, (a, b) -> playMap.get(b) - playMap.get(a));
        
        List<Integer> best = new ArrayList<>();
        
        for(String g: sortedMap){
            List<Song> songs = songMap.get(g);
            
            Collections.sort(songs, (a, b) -> {
                if(a.play == b.play) return a.id - b.id;
                return b.play - a.play;
            });
            
            for(int i = 0; i <songs.size(); i++){
                if(i >= 2) break;
                best.add(songs.get(i).id);
            }
        }
        
        return best.stream().mapToInt(i -> i).toArray();
    }
}
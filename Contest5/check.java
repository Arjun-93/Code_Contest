class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<queries.size(); i++){
            String  str = queries.get(i);
            int count = 0;
            for(int j=0; j<strings.size(); j++){
                if(strings.get(j) == str){
                    count += 1;
                }
            }
            result.add(count);
        }
        return result;
    }
} 



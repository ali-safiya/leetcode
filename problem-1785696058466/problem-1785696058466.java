// Last updated: 03/08/2026, 00:10:58
1class Solution {
2    public int openLock(String[] deadends, String target) {
3
4        if (target.equals("0000")) return 0;
5
6        HashSet<String> set = new HashSet<>();
7
8        for(String deadend : deadends){
9            set.add(deadend);
10            if(deadend.equals("0000")) return -1;
11        }
12        
13        Queue<String> q = new LinkedList<>();
14        HashSet<String> visited = new HashSet<>();
15
16        q.add("0000");
17        visited.add("0000");
18        int len=0;
19
20        while(!q.isEmpty()){
21
22            int size = q.size();
23
24            for(int i=0;i<size;i++){
25
26                String cur = q.poll();
27                if (cur.equals(target))
28                    return len;
29                
30                char[] arr = cur.toCharArray();
31
32                for(int j=0;j<4;j++){
33
34                    char original = arr[j];
35                    arr[j] = (char) ((original - '0' + 1) % 10 + '0');
36
37                    String next = new String(arr);
38                    if (!set.contains(next) && !visited.contains(next)) {
39                        visited.add(next);
40                        q.offer(next);
41                    }
42                    arr[j] = (char) ((original - '0' + 9) % 10 + '0');    
43
44                    next = new String(arr);
45                    if (!set.contains(next) && !visited.contains(next)) {
46                        visited.add(next);
47                        q.offer(next);
48                    }
49                    arr[j]=original;
50                }
51            }
52            len++;
53        }
54        return -1;
55    }
56}
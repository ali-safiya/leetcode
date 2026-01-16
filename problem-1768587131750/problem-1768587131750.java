// Last updated: 16/01/2026, 23:42:11
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3
4        int count1 =0 ;
5        int count2 =0;
6
7        int ele1 =0;
8        int ele2 =0;
9
10        for(int i=0;i<nums.length;i++){
11
12            if(count1 ==0 && ele2 != nums[i]){
13                ele1= nums[i];
14                count1++;
15            }
16            else if(count2 ==0 && ele1 != nums[i]){
17                ele2 = nums[i];
18                count2++;
19            }
20            else if(ele1 == nums[i]){
21                count1++;
22            }
23            else if(ele2 == nums[i]){
24                count2++;
25            }
26            else{
27                count1--;
28                count2--;
29            }
30                    // System.out.println(" " + count1 + " "+ count2 +" "+ ele1 + " " + ele2);
31
32        }
33
34        count1=0;
35        count2=0;
36
37        for(int i =0;i<nums.length;i++){
38            if(nums[i]==ele1){
39                count1++;
40            }
41            if(nums[i]== ele2){
42                count2++;
43            }
44        }
45
46        int min = nums.length/3;
47
48        List<Integer> ans = new ArrayList<>();
49
50        if(count1>min) ans.add(ele1);
51        if(count2>min && ele1 != ele2) ans.add(ele2);
52
53        return ans;
54    }
55}
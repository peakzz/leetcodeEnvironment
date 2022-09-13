
import java.util.HashMap;
import java.util.Map;

class Solution {
    //思路：map去重统计词频，链表数组记录
//时间复杂度：O(n + k)O(n+k)，其中 nn 是字符串 ss 的长度，kk 是字符串 ss 包含的不同字符的个数。
// 遍历字符串统计每个字符出现的频率需要 O(n)O(n) 的时间。
// 创建桶并将不同字符加入桶需要 O(k)O(k) 的时间。
// 生成排序后的字符串，需要 O(k)O(k) 的时间遍历桶，以及 O(n)O(n) 的时拼接字符串间。
// 因此总时间复杂度是 O(n + k)O(n+k)。

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] bucket = new char[s.length()+1]; //list 数组 数组里存的是list list里存的是char 频率最多为n次
        for(char key : map.keySet()){ //最多有k个不同的字符 bucket下标对应频率
            int f = map.get(key);
            bucket[f] = key;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = bucket.length - 1; i >= 0; i--){ //从频率最高的开始遍历
            if(bucket[i] != 0){ //char数组默认为'0'
                for(int j = 0; j < i; j++)  //字符c出现i次
                    sb.append(bucket[i]); //bucket[i]就是出现i次的字符
            }
        }

        return sb.toString();
    }
}
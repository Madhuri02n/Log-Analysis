Problem Statement: Log Analysis

You are given a file containing system logs in the format: timestamp, user_id, action 
Example: 
10:01,user1,login
10:03,user2,search
10:05,user1,purchase
10:07,user2,search
10:10,user3,login 
Task Write a program to compute: 
 The most active user (user with highest number of actions) 
 The
 most common action 
 
 Approach:
The log file is processed line-by-line using BufferedReader.
We maintain two HashMaps to count user actions and action frequency.
Data Structures:
HashMap for counting occurrences.
Time Complexity: O(n)
Space Complexity: O(u + a)
The solution efficiently handles large log files without loading the entire file into memory.

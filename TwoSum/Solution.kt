/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9, return [0, 1]

Given nums = [3, 2, 4], target = 6, return [1, 2]

Given nums = [3, 3], target = 6, return [0, 1]

Given nums = [2, 5, 5, 11], target = 10, return [1, 2]

Given nums = [3, 2, 3], target = 6, return [0, 2]

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

@link https://leetcode.com/problems/two-sum/
 */


 fun main(args: Array<String>) {
     val solution = Solution()
     val result = solution.twoSum(intArrayOf(-10,-1,-18,-19),-19)
     result.forEach({print("[$it]")})
 }

 class Solution {
     
     fun twoSum(nums:IntArray,target: Int): IntArray{
        
        for(i in nums.indices){

            for(j in nums.indices){
            
                if(i < j){
                    if(nums[j] == target - nums[i]){
                        return intArrayOf(i,j)
                    }   
                }         
            }
        }

        throw Exception("$target not found in sum $nums")
     }
 }
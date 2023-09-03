# Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, your task is to find two numbers in the array such that they add up to the `target`. You need to return the indices (0-based) of these two numbers.

You may assume that each input will have exactly one solution, and you cannot use the same element twice. The order of the output does not matter.

## Input

- An array of integers `nums` (2 <= nums.length <= 10^4)
- An integer `target` (-10^9 <= target <= 10^9)

## Output

- An array of two integers representing the indices of the two numbers in `nums` that add up to `target`.

## Example

#### Input
nums = [2, 7, 11, 15]
target = 9

#### Output
[0, 1]

#### Explanationcd ..

nums[0] + nums[1] == 9, so we return [0, 1].


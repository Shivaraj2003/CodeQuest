# Arithmetic Sequence Reordering

This program checks if an unsorted array can be reordered to form an arithmetic sequence.

## Problem Statement

An arithmetic sequence is a sequence of numbers in which the difference between consecutive terms is constant. For example, [5, 7, 9, 11, 13, 15] is an arithmetic sequence with a common difference of 2.

Given an unsorted array, this program determines whether it can be reordered to form an arithmetic sequence.

## Examples

### Example 1

Input: [9, 13, 5, 15, 7, 11]

Output: true

Explanation: This can be reordered to [5, 7, 9, 11, 13, 15] or [15, 13, 11, 9, 7, 5], both of which are arithmetic sequences.

### Example 2

Input: [1, 1, 1]

Output: true

Explanation: This is an arithmetic sequence with a difference of 0.

### Example 3

Input: [4, 1, 2]

Output: false

Explanation: This cannot be reordered to form an arithmetic sequence.


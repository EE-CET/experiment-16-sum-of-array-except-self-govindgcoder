# Experiment 16: Sum of Array Except Self

## Problem Statement

Given an array of $n$ integers where $n > 1$, return an array `output` such that `output[i]` is equal to the sum of all the elements of `nums` except `nums[i]`.
All integers in the array are greater than 0.

## Input Format

* The first line consists of an integer $n$, which is the number of elements in the array.
* The next line (or lines) contains $n$ integers, representing the elements of the array.

## Output Format

Return the resultant array elements separated by spaces.

### Example 1

**Input:**

```text
4
4 3 2 10
```

**Output:**

```text
15 16 17 9
```

**Explanation:**
* `output[0]` = 3 + 2 + 10 = 15
* `output[1]` = 4 + 2 + 10 = 16
* `output[2]` = 4 + 3 + 10 = 17
* `output[3]` = 4 + 3 + 2 = 9

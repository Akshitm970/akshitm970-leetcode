class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        // Step 1: Initialize white to count 'W' blocks in the window
        int n = blocks.length();
        int white = 0; 
        int min = Integer.MAX_VALUE; 
        
        // Step 2: Count 'W' blocks in the first window (first k characters)
        for (int i = 0; i < k; i++) 
        {
            if (blocks.charAt(i) == 'W') 
            {
                white++;
            }
        }

        // Step 3: Set min to the number of 'W' blocks in the first window
        min = white;

        // Step 4: Slide the window across the string
        for (int i = k; i < n; i++) 
        {
            if (blocks.charAt(i - k) == 'W') 
            {
                white--;
            }

            if (blocks.charAt(i) == 'W') 
            {
                white++;
            }

            min = Math.min(white, min);
        }

        // Step 5: Return the minimum recolors
        return min;
    }
}
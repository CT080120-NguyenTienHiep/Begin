class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }
        char ch[] = s.toCharArray();
        char resCh[] = new char[s.length()];
        int stop = ch.length-1;
        int step;
        int mark;
        int count = 0;
        int round;
        for(int i = 1; i <= numRows; i++)
        {
            mark = i-1;
            round = 1;
            while (mark <= stop && count < stop+1)
            {
                if((round % 2 == 0 || i == numRows) && i != 1)
                {
                    step = 2*i - 3;
                }
                else
                {
                    step = (numRows*2) - (i*2) - 1;
                }
                resCh[count] = ch[mark];
                mark = mark+step+1;
                round++;
                count++;
            }
        }
        return String.valueOf(resCh);
    }
}

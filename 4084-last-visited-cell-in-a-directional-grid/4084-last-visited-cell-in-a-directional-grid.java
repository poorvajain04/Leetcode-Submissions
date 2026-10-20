class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int x=0;
        int y=0;
        int lastx=0;
        int lasty=0;
        while(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]!='X'){
            lastx=x;
            lasty=y;
            switch(grid[x][y]){
                case 'U'->x--;
                case 'D'->x++;
                case 'L'->y--;
                case 'R'->y++;
            }
            grid[lastx][lasty]='X';
        }
        return new int[]{lastx,lasty};
    }
}
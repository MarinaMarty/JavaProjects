
public class IslandFinder {
	private int n, m;

	public int numIslands(char [][] grid) {
		int count = 0;
		//optional
		if(grid.length  == 0) {
			return 0;
		}
		
		for(int r = 0; r < grid.length; r++) {
			for(int c = 0; c < grid[0].length; c++) 
				if(grid[r][c] == '1'){ //represents an island but could be anything
					//now, we run our dfs to check in directions
					sink(grid, r, c);
					count++;
				}
			}
		return count;
	}

		public void sink(char[][]grid, int r, int c) {
			//check if we are out of bounds
			if (r< 0 || c < 0|| r >=grid.length || c >= grid[0].length|| grid[r][c] != '1')
				return;
			grid[r][c] = '0';// we override it so we don't check it again. this is the DFS visited
			//now we runt the paths one at a time
			sink(grid, r +1, c);
			sink(grid, r- 1, c);
			sink(grid, r, c+1);
			sink(grid, r, c-1);
					
			
		}

}

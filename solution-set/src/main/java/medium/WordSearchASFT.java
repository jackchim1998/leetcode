package medium;

/**
 * @author Jack
 */
public class WordSearchASFT { // TODO @Jack Accepted Solution but Failed Test cases
    int m, n;
    char grid[][];
    String input;
    public boolean exist(char[][] board, String word) {
        //1st idea: dfs through the matrix to find the word
        m = board.length;
        n = board[0].length;
        grid = board;
        input = word;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //we could go backwards so we have to have a new visited array every time.
                if(dfs(i, j, new boolean[m][n], word.length() - 1))
                    return true;
            }
        }

        return false;
    }

    //the idea was perfect, but the key was to have that if condition at the end.
    public boolean dfs(int i, int j, boolean[][] visited, int index){
        //the word has been found or 'completed'
        if(index < 0 )
            return true;

        //all of the stopping conditions.
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != input.charAt(index) || visited[i][j])
            return false;

        visited[i][j] = true;
        --index;

        //check the surrounding regions.
        return dfs(i, j+1, visited, index) || dfs(i + 1, j, visited, index) || dfs(i, j - 1, visited, index) ||
                dfs(i-1, j, visited, index);


        // return false;
    }//

}

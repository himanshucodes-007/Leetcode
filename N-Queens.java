1class Solution {
2    private List<List<String>> result = new ArrayList<>();
3
4    public List<List<String>> solveNQueens(int n) {
5        if (n == 0)
6            return result;
7        
8        List<String> board = new ArrayList<>();
9        // For n = 3, board = {"...", "...", "..."} initially
10        for (int i = 0; i < n; i++) {
11            StringBuilder row = new StringBuilder();
12            for (int j = 0; j < n; j++) {
13                row.append('.');
14            }
15            board.add(row.toString());
16        }
17
18        solve(board, 0);
19        
20        return result;
21    }
22
23    private boolean isValid(List<String> board, int row, int col) {
24        // Look for up
25        for (int i = row; i >= 0; i--) {
26            if (board.get(i).charAt(col) == 'Q')
27                return false;
28        }
29
30        // Check left diagonal upwards
31        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
32            if (board.get(i).charAt(j) == 'Q')
33                return false;
34        }
35
36        // Check right diagonal upwards
37        for (int i = row, j = col; i >= 0 && j < board.size(); i--, j++) {
38            if (board.get(i).charAt(j) == 'Q')
39                return false;
40        }
41
42        return true;
43    }
44
45    private void solve(List<String> board, int row) {
46        if (row == board.size()) {
47            result.add(new ArrayList<>(board));
48            return;
49        }
50
51        // Place one queen at every row and check before placing
52        // in every direction where there is a risk of being attacked
53        // i.e., up, diagonally because we are placing queens from
54        // the top row to the bottom row, so we need to check if we put a queen
55        // vertically up in some row or diagonally upwards in some row
56
57        for (int i = 0; i < board.size(); i++) {
58            if (isValid(board, row, i)) {
59                StringBuilder newRow = new StringBuilder(board.get(row));
60                newRow.setCharAt(i, 'Q');
61                board.set(row, newRow.toString());
62
63                solve(board, row + 1);
64
65                newRow.setCharAt(i, '.');
66                board.set(row, newRow.toString());
67            }
68        }
69    }
70}
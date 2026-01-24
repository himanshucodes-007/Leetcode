1class Solution {
2    private List<List<String>> result = new ArrayList<>();
3
4    public List<List<String>> solveNQueens(int n) {
5        if (n == 0)
6            return result;
7
8        List<String> board = new ArrayList<>();
9        // For, n = 3, board = {"...", "...", "..."} initially
10        for (int i = 0; i < n; i++) {
11            StringBuilder row = new StringBuilder();
12            for (int j = 0; j < n; j++) {
13                row.append('.');
14            }
15            board.add(row.toString());
16        }
17
18        int startRow = 0;
19        HashSet<Integer> cols = new HashSet<>();
20        HashSet<Integer> diags = new HashSet<>();
21        HashSet<Integer> antiDiags = new HashSet<>();
22        solve(board, startRow, cols, diags, antiDiags);
23
24        return result;
25    }
26
27    private void solve(List<String> board, int row, HashSet<Integer> cols, HashSet<Integer> diags, HashSet<Integer> antiDiags) {
28        if (row == board.size()) {
29            result.add(new ArrayList<>(board));
30            return;
31        }
32
33        /*
34         * For a square (i, j) : Diagonally (i-j) is constant Anti diagonally (i+j) is
35         * constant
36         * 
37         * We can use this to find which square (i, j) has a risk of being attacked
38         * by another queen placed already in 'diagonal', or 'anti-diagonal' or
39         * 'column'
40         */
41
42        for (int col = 0; col < board.size(); col++) {
43            int diagId = row - col;
44            int antiDiagId = row + col;
45
46            /*
47             * If the col, or diagonal or anti_diagonal are used means one of them has a
48             * Queen placed already which can attack, so look for other column
49             */
50            if (cols.contains(col) || diags.contains(diagId) || antiDiags.contains(antiDiagId))
51                continue;
52
53            cols.add(col);
54            diags.add(diagId);
55            antiDiags.add(antiDiagId);
56            StringBuilder newRow = new StringBuilder(board.get(row));
57            newRow.setCharAt(col, 'Q');
58            board.set(row, newRow.toString());
59
60            solve(board, row + 1, cols, diags, antiDiags);
61
62            cols.remove(col);
63            diags.remove(diagId);
64            antiDiags.remove(antiDiagId);
65            newRow.setCharAt(col, '.');
66            board.set(row, newRow.toString());
67        }
68    }
69}
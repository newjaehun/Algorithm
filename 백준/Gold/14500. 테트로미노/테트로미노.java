import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][][] tet = {
            {{0,0},{0,1},{0,2},{0,3}}, // -
            {{0,0},{1,0},{2,0},{3,0}}, // |

            {{0,0},{0,1},{1,0},{1,1}}, // ㅁ

            {{0, 0}, {1, 0}, {2, 0}, {2, 1}},  // ㄴ
            {{0, 0}, {1, 0}, {2, 0}, {2, -1}},
            {{0, 0}, {1, 0}, {2, 0}, {0, -1}},
            {{0, 0}, {1, 0}, {2, 0}, {0, 1}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 0}},
            {{0, 0}, {0, 1}, {0, 2}, {-1, 0}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 2}},
            {{0, 0}, {0, 1}, {0, 2}, {-1, 2}},

            {{0, 0}, {1, 0}, {1, 1}, {2, 1}},  //
            {{0, 0}, {1, 0}, {1, -1}, {2, -1}},
            {{0, 0}, {0, 1}, {1, 1}, {1, 2}},
            {{0, 0}, {0, 1}, {-1, 1}, {-1, 2}},

            {{0, 0}, {0, 1}, {0, 2}, {1, 1}},      // ㅜ
            {{0, 0}, {0, 1}, {0, 2}, {-1, 1}},
            {{0, 0}, {1, 0}, {2, 0}, {1, 1}},
            {{0, 0}, {1, 0}, {2, 0}, {1, -1}}
    };
    static int n, m, result=0;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                findMax(i, j);
        br.close();
        System.out.println(result);
    }
    private static void findMax(int i, int j) {
        for (int[][] t : tet) {
            int sum =0;
            boolean check = true;
            for (int[] block : t) {
                int y = i + block[0];
                int x = j + block[1];
                if (y < 0 || y >= n || x < 0 || x >= m) {
                    check = false;
                    break;
                }
                sum += arr[y][x];
            }
            if(check)
                result = Math.max(result, sum);
        }
    }
}
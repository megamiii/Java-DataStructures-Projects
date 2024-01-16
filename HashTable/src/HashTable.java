
public class HashTable {
    private int[] table;
    private int c1, c2, c3;
    private int delMarker = -1;
    private int tableSize;

    public HashTable(int n) {
        tableSize = n;
    }

    public void create(int c1, int c2, int c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        table = new int[tableSize];

        for (int i = 0; i < tableSize; i++){
            table[i] = 0;
        }
    }

    public void insert(int key) {
        int prob, i = 0;
        while (true) {
            prob = quadProb(key, i);
            if (table[prob] == 0 || table[prob] == delMarker) {
                table[prob] = key;
                System.out.printf("INSERT: %d, INDEX: %d\n", key, prob);
                break;
            }
            i++;
        }
    }

    public void delete(int key) {
        int prob, i = 0;
        while (true) {
            prob = quadProb(key, i);
            if (table[prob] == 0) {
                System.out.printf("Failed to find %d\n", key);
                return;
            }
            if (table[prob] == key) {
                table[prob] = delMarker;
                System.out.printf("DELETE: %d, INDEX: %d\n", key, prob);
                break;
            }
            i++;
        }
    }

    public void search(int key) {
        int prob, i = 0;
        while (true) {
            prob = quadProb(key, i);
            if (table[prob] == 0) {
                System.out.printf("Failed to find %d\n", key);
                return;
            }
            if (table[prob] == key) {
                System.out.printf("SEARCH: %d, INDEX: %d\n", key, prob);
                break;
            }
            i++;
        }
    }

    public void maxProbe() {
        int maxProbes = 1;
        for (int i = 0; i < tableSize; i++) {
            int cnt = 0;
            int prob = quadProb(i, cnt);
            while (table[prob] != 0 && table[prob] != delMarker) {
                prob = quadProb(i, cnt);
                cnt++;
            }
            if (cnt > maxProbes) {
                maxProbes = cnt;
            }
        }
        System.out.printf("Maximum number of probes: %d\n", maxProbes);
    }

    private int quadProb(int k, int i) {
        return ((k % tableSize) + c1*i*i + c2*i + c3) % tableSize;
    }
}

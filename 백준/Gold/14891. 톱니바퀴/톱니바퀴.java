import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        List<Integer> AList = new ArrayList<>();
        List<Integer> BList = new ArrayList<>();
        List<Integer> CList = new ArrayList<>();
        List<Integer> DList = new ArrayList<>();

        String s = st.nextToken();
        for (int i = 0; i < 8; i++) {
            AList.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        st = new StringTokenizer(br.readLine());

        s = st.nextToken();
        for (int i = 0; i < 8; i++) {
            BList.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        st = new StringTokenizer(br.readLine());

        s = st.nextToken();
        for (int i = 0; i < 8; i++) {
            CList.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        st = new StringTokenizer(br.readLine());

        s = st.nextToken();
        for (int i = 0; i < 8; i++) {
            DList.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int o = Integer.parseInt(st.nextToken());
            boolean ab = false;
            if(AList.get((a + 2) % 8) != BList.get((b + 6) % 8)){
                ab = true;
            }
            boolean bc = false;
            if(BList.get((b + 2) % 8) != CList.get((c + 6) % 8)){
                bc = true;
            }
            boolean cd = false;
            if(CList.get((c + 2) % 8) != DList.get((d + 6) % 8)){
                cd = true;
            }

            if(h == 3) {
                if (o == 1) {
                    c -= 1;
                    if (c == -1) {
                        c += 8;
                    }
                    if (cd) {
                        d += 1;
                        if (d == 8) {
                            d = 0;
                        }
                    }

                    if (bc) {
                        b += 1;
                        if (b == 8) {
                            b = 0;
                        }

                        if (ab) {
                            a -= 1;
                            if (a == -1) {
                                a += 8;
                            }
                        }
                    }
                } else {
                    c += 1;
                    if (c == 8) {
                        c = 0;
                    }

                    if (cd) {
                        d -= 1;
                        if (d == -1) {
                            d += 8;
                        }
                    }

                    if (bc){
                        b -= 1;
                        if (b == -1) {
                            b += 8;
                        }
                        if (ab) {
                            a += 1;
                            if (a == 8) {
                                a = 0;
                            }
                        }
                    }
                }
            }

            if(h == 1){
                if(o == 1){
                    a -= 1;
                    if(a == -1){
                        a += 8;
                    }

                    if(ab){
                        b += 1;
                        if(b == 8){
                            b = 0;
                        }
                        if(bc){
                            c -= 1;
                            if(c == -1){
                                c += 8;
                            }
                            if(cd){
                                d += 1;
                                if(d == 8){
                                    d = 0;
                                }
                            }
                        }
                    }
                }
                else{
                    a += 1;
                    if(a == 8){
                        a = 0;
                    }

                    if(ab){
                        b -= 1;
                        if(b == -1){
                            b += 8;
                        }
                        if(bc){
                            c += 1;
                            if(c == 8){
                                c = 0;
                            }
                            if(cd){
                                d -= 1;
                                if(d == -1){
                                    d += 8;
                                }
                            }
                        }
                    }
                }
            }
            if(h == 2){
                if(o == 1){
                    b -= 1;
                    if(b == -1){
                        b += 8;
                    }

                    if(ab){
                        a += 1;
                        if(a == 8){
                            a = 0;
                        }
                    }
                    if(bc){
                        c += 1;
                        if(c == 8){
                            c = 0;
                        }
                        if(cd){
                            d -= 1;
                            if(d == -1){
                                d += 8;
                            }
                        }
                    }
                }
                else{
                    b += 1;
                    if(b == 8){
                        b = 0;
                    }

                    if(ab){
                        a -= 1;
                        if(a == -1){
                            a += 8;
                        }
                    }
                    if(bc){
                        c -= 1;
                        if(c == -1){
                            c += 8;
                        }
                        if(cd){
                            d += 1;
                            if(d == 8){
                                d = 0;
                            }
                        }
                    }
                }
            }
            if(h == 4){
                if(o == 1){
                    d -= 1;
                    if(d == -1){
                        d += 8;
                    }

                    if(cd){
                        c += 1;
                        if(c == 8){
                            c = 0;
                        }
                        if(bc){
                            b -= 1;
                            if(b == -1){
                                b += 8;
                            }
                            if(ab){
                                a += 1;
                                if(a == 8){
                                    a = 0;
                                }
                            }
                        }
                    }
                }
                else{
                    d += 1;
                    if(d == 8){
                        d = 0;
                    }

                    if(cd){
                        c -= 1;
                        if(c == -1){
                            c += 8;
                        }
                        if(bc){
                            b += 1;
                            if(b == 8){
                                b = 0;
                            }
                            if(ab){
                                a -= 1;
                                if(a == -1){
                                    a += 8;
                                }
                            }
                        }
                    }
                }
            }
        }

        int res = 0;
        if(AList.get(a) == 1){
            res += 1;
        }
        if(BList.get(b) == 1){
            res += 2;
        }
        if(CList.get(c) == 1){
            res += 4;
        }
        if(DList.get(d) == 1){
            res += 8;
        }


        System.out.println(res);

    }
}

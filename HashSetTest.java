import java.util.HashSet;
import java.util.Set;

/*
 * HashSetの習得
 */
class HashSetTest {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        //要素の追加
        fruits.add("リンゴ");
        fruits.add("メロン");
        fruits.add("スイカ");
        fruits.add("オレンジ");

        //全出力
        System.out.println("---------全出力---------");
        System.out.println(fruits);
        System.out.println();

        //要素の存在確認
        String wantedFruit = "オレンジ";
        if(fruits.contains(wantedFruit)) {
            System.out.println(wantedFruit + "は存在します");
        } else {
            System.out.println(wantedFruit + "は存在しません");
        }
        System.out.println();

        //重複要素の追加はできない
        fruits.add("スイカ");
        fruits.add("スイカ");
        fruits.add("スイカ");
        System.out.println("----------重複要素は追加されない---------");
        System.out.println(fruits);
        System.out.println();

        //サイズ取得
        System.out.println("HashSetのサイズは" + fruits.size());

        //要素を1つ削除
        fruits.remove("スイカ");

        System.out.println("---------スイカを削除---------");
        System.out.println(fruits);
        System.out.println();

        //和集合、差集合、積集合、対象差を求める
        Set<String> langs1 = Set.of("Java", "Python", "JavaScript");
        Set<String> langs2 = Set.of("Java", "Scala", "PHP");

        //和集合（その集合と、もう一方の集合の持っているものを合算）
        Set<String> union = new HashSet<>(langs1);
        Set<String> unionTmp = new HashSet<>(langs2);
        union.addAll(unionTmp);
        System.out.println("---------和集合---------");
        System.out.println(union);
        System.out.println();

        //差集合（その集合が持っているものから、もう一方の集合も共通で持っているものを削除したもの）
        Set<String> except = new HashSet<>(langs1);
        Set<String> exceptTmp = new HashSet<>(langs2);
        except.removeAll(exceptTmp);
        System.out.println("---------差集合---------");
        System.out.println(except);
        System.out.println();

        //積集合（その集合ともう一方の集合が共通で持っているもの）
        Set<String> intersect = new HashSet<>(langs1);
        Set<String> intersectTmp = new HashSet<>(langs2);
        intersect.retainAll(intersectTmp);
        System.out.println("---------積集合---------");
        System.out.println(intersect);
        System.out.println();

        //排他的論理和（その集合と、もう一方の集合の全要素の中で、片方だけが持っているもの）
        Set<String> a = new HashSet<>(langs1);
        Set<String> b = 

        

    }
}
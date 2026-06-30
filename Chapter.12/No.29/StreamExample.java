import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Strawberry", "Orange", "Cherry");

        List<String> result = words.stream()
                .filter(word -> word.startsWith("S")) // Sで始まるものを抽出
                .map(String::toUpperCase) // 大文字に変換
                .collect(Collectors.toList()); // リストにまとめる

        System.out.println(result); // 出力: [STRAWBERRY]
    }
}

// Stream APIの3ステップ
// Streamの処理は、基本的に以下の3段階のパイプラインで構成されます。

// Qiita
// +1
// 生成：コレクションや配列からStreamを作成する。
// 中間操作：データのフィルタリングや変換などを行う（複数回記述可能。遅延評価される）。
// 終端操作：結果を出力したり、集計して値を取り出したりする（1度だけ実行）。
// 代表的なメソッドと使い方
// 1. 中間操作（Intermediate Operations）
// filter(条件)：条件に一致する要素だけを抽出する。
// map(変換処理)：要素を別の形や値に変換する。
// sorted() / sorted(比較条件)：要素を並び替える。
// distinct()：重複を取り除く。

// YouTube
// ·Selenium Express
// +3
// 2. 終端操作（Terminal Operations）
// forEach(処理)：各要素に対して繰り返し処理を実行する。
// collect(toList())：処理結果を新しいリストなどにまとめる。
// count()：要素の数を数える。
// anyMatch(条件)：条件に一致する要素が1つでもあるか判定する。

// YouTube
// ·Selenium Express
// +2